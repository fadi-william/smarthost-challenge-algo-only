/*
 * Copyright (c) 2021 Fadi William Ghali Abdelmessih<fadi.william.ghali@gmail.com>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a
 * copy of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software,
 * and to permit persons to whom the Software is furnished to do so, subject to the following
 * conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies
 * or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
 * PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE
 * FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
 * DEALINGS IN THE SOFTWARE.
 */

package com.smarthost.roomoccupancymanager.service;

import com.smarthost.roomoccupancymanager.domain.CustomerRequest;
import com.smarthost.roomoccupancymanager.domain.HotelOccupancy;
import com.smarthost.roomoccupancymanager.domain.HotelOccupancyUsageResult;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

/**
 * The room occupancy manager service.
 *
 * @author Fadi William
 */
public class RoomOccupancyManagerService {

    /**
     * Execute the algorithm.
     *
     * @param customerRequests the customer requests to be processed for a single date for a single hotel.
     * @param hotelOccupancy   the hotel occupancy provided by the hotel.
     * @param upgradable       the option to specify if we can upgrade the customers willing to pay less than 100 euros to book premium rooms.
     * @return the list of the HotelOccupancyUsageResult objects.
     */
    public static List<HotelOccupancyUsageResult> run(List<CustomerRequest> customerRequests, HotelOccupancy hotelOccupancy, Boolean upgradable) {
        List<HotelOccupancyUsageResult> hotelOccupancyUsageResults = new ArrayList<>();

        // Filter by the customers willing to pay less than 100 and sort them.
        List<CustomerRequest> cRsForCustomersWillingToPayLessThan100Euros = customerRequests
                .stream()
                .filter(c -> c.getAmountCustomerWillingToPay().compareTo(new BigDecimal(100)) < 0)
                .sorted(Comparator.comparing(CustomerRequest::getAmountCustomerWillingToPay).reversed())
                .collect(Collectors.toList());

        // Filter by the customers willing to pay more than 100 and sort them.
        List<CustomerRequest> cRsForCustomersWillingToPayMoreThanOrEqual100Euros = customerRequests
                .stream()
                .filter(c -> c.getAmountCustomerWillingToPay().compareTo(new BigDecimal(100)) >= 0)
                .sorted(Comparator.comparing(CustomerRequest::getAmountCustomerWillingToPay).reversed())
                .collect(Collectors.toList());

        // We will work with the deque data structure for both entries.
        Deque<CustomerRequest> cRsForCustomersWillingToPayLessThan100EurosDeque = new ArrayDeque<>(cRsForCustomersWillingToPayLessThan100Euros);
        Deque<CustomerRequest> cRsForCustomersWillingToPayMoreThan100EurosDeque = new ArrayDeque<>(cRsForCustomersWillingToPayMoreThanOrEqual100Euros);

        int numberOfEconomyRooms = hotelOccupancy.getNumberOfEconomyRooms();
        int numberOfPremiumRooms = hotelOccupancy.getNumberOfPremiumRooms();

        HotelOccupancyUsageResult economyHotelOccupancyUsageResult = new HotelOccupancyUsageResult("economy");
        HotelOccupancyUsageResult premiumHotelOccupancyUsageResult = new HotelOccupancyUsageResult("premium");

        // Let's fill the premium hotel rooms first.
        while(numberOfPremiumRooms > 0) {

            // Fill first the premium rooms with the customers willing to pay more than 100 euros.
            if (!cRsForCustomersWillingToPayMoreThan100EurosDeque.isEmpty()) {
                CustomerRequest customerRequest = cRsForCustomersWillingToPayMoreThan100EurosDeque.pop();
                premiumHotelOccupancyUsageResult.incrementNumberOfRoomsReservedBy1();
                premiumHotelOccupancyUsageResult.addRoomReservationCostToTheBudget(customerRequest.getAmountCustomerWillingToPay());
                numberOfPremiumRooms -= 1;
            } else {
                // Break the loop.
                break;
            }
        }

        // The customers that may be upgraded.
        Deque<CustomerRequest> customerRequestsThatMaybeUpgraded = new ArrayDeque<>();

        // Then, fill the economy rooms with the customers willing to pay less than.
        while (numberOfEconomyRooms > 0) {
            if (!cRsForCustomersWillingToPayLessThan100EurosDeque.isEmpty()) {
                // Of course, we won't force the customers to pay more than 100 euros for non premium rooms.
                CustomerRequest customerRequest = cRsForCustomersWillingToPayLessThan100EurosDeque.pop();
                economyHotelOccupancyUsageResult.incrementNumberOfRoomsReservedBy1();
                economyHotelOccupancyUsageResult.addRoomReservationCostToTheBudget(customerRequest.getAmountCustomerWillingToPay());

                if (upgradable.equals(true)) {
                    customerRequestsThatMaybeUpgraded.add(customerRequest);
                }

                numberOfEconomyRooms -= 1;
            } else {
                // Break the loop.
                break;
            }
        }

        // Upgrade the customer requests that could be upgraded.
        while (numberOfPremiumRooms > 0) {
            if (!customerRequestsThatMaybeUpgraded.isEmpty()) {
                CustomerRequest customerRequest = customerRequestsThatMaybeUpgraded.pop();
                premiumHotelOccupancyUsageResult.incrementNumberOfRoomsReservedBy1();
                premiumHotelOccupancyUsageResult.addRoomReservationCostToTheBudget(customerRequest.getAmountCustomerWillingToPay());
                economyHotelOccupancyUsageResult.decrementOfRoomsReservedBy1();
                economyHotelOccupancyUsageResult.subtractRoomReservationCostToTheBudget(customerRequest.getAmountCustomerWillingToPay());

                numberOfPremiumRooms -= 1;
                numberOfEconomyRooms += 1;
            } else {
                // Break the loop.
                break;
            }
        }

        // Fill again the reset of the empty economy rooms as there's a possibility that some customer requests were upgraded.
        while (numberOfEconomyRooms > 0) {
            if (!cRsForCustomersWillingToPayLessThan100EurosDeque.isEmpty()) {
                CustomerRequest customerRequest = cRsForCustomersWillingToPayLessThan100EurosDeque.pop();
                economyHotelOccupancyUsageResult.incrementNumberOfRoomsReservedBy1();
                economyHotelOccupancyUsageResult.addRoomReservationCostToTheBudget(customerRequest.getAmountCustomerWillingToPay());
                numberOfEconomyRooms -= 1;
            } else {
                // Break the loop.
                break;
            }
        }

        // In case, it's not upgradable and there are some remaining rooms. Assign them to the remaining customers willing to pay less than
        // 100 euros.
        while (numberOfPremiumRooms > 0) {
            if (!cRsForCustomersWillingToPayLessThan100EurosDeque.isEmpty()) {
                CustomerRequest customerRequest = cRsForCustomersWillingToPayLessThan100EurosDeque.pop();
                premiumHotelOccupancyUsageResult.incrementNumberOfRoomsReservedBy1();
                premiumHotelOccupancyUsageResult.addRoomReservationCostToTheBudget(customerRequest.getAmountCustomerWillingToPay());
                numberOfPremiumRooms -= 1;
            } else {
                // Break the loop.
                break;
            }
        }

        hotelOccupancyUsageResults.add(premiumHotelOccupancyUsageResult);
        hotelOccupancyUsageResults.add(economyHotelOccupancyUsageResult);

        return hotelOccupancyUsageResults;
    }
}
