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

package com.smarthost.roomoccupancymanager;

import com.smarthost.roomoccupancymanager.domain.CustomerRequest;
import com.smarthost.roomoccupancymanager.domain.HotelOccupancy;
import com.smarthost.roomoccupancymanager.domain.HotelOccupancyUsageResult;
import com.smarthost.roomoccupancymanager.seed.CustomerRequestSeed;
import com.smarthost.roomoccupancymanager.seed.HotelOccupancySeed;
import com.smarthost.roomoccupancymanager.service.RoomOccupancyManagerService;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        // The first test.
        List<CustomerRequest> customerRequests = CustomerRequestSeed.getCustomerRequestSeed1();
        HotelOccupancy hotelOccupancy = HotelOccupancySeed.getHotelOccupancySeed1();

        List<HotelOccupancyUsageResult> hotelOccupancyUsageResults = RoomOccupancyManagerService.run(customerRequests, hotelOccupancy, true);

        // The first test results.
        System.out.println("*** First Test ***");
        printTestResults(hotelOccupancy, hotelOccupancyUsageResults);
        System.out.println("*******************");

        // The second test.
        List<CustomerRequest> customerRequests2 = CustomerRequestSeed.getCustomerRequestSeed2();
        HotelOccupancy hotelOccupancy2 = HotelOccupancySeed.getHotelOccupancySeed2();

        List<HotelOccupancyUsageResult> hotelOccupancyUsageResults2 = RoomOccupancyManagerService.run(customerRequests2, hotelOccupancy2, false);

        // The second test results.
        System.out.println("*** Second Test ***");
        printTestResults(hotelOccupancy2, hotelOccupancyUsageResults2);
        System.out.println("*******************");

        // The third test.
        List<CustomerRequest> customerRequests3 = CustomerRequestSeed.getCustomerRequestSeed3();
        HotelOccupancy hotelOccupancy3 = HotelOccupancySeed.getHotelOccupancySeed3();

        List<HotelOccupancyUsageResult> hotelOccupancyUsageResults3 = RoomOccupancyManagerService.run(customerRequests3, hotelOccupancy3, true);

        // The third test results.
        System.out.println("*** Third Test ***");
        printTestResults(hotelOccupancy3, hotelOccupancyUsageResults3);
        System.out.println("*******************");

        // The fourth test.
        List<CustomerRequest> customerRequests4 = CustomerRequestSeed.getCustomerRequestSeed4();
        HotelOccupancy hotelOccupancy4 = HotelOccupancySeed.getHotelOccupancySeed4();

        List<HotelOccupancyUsageResult> hotelOccupancyUsageResults4 = RoomOccupancyManagerService.run(customerRequests4, hotelOccupancy4, true);

        // The fourth test results.
        System.out.println("*** Fourth Test ***");
        printTestResults(hotelOccupancy4, hotelOccupancyUsageResults4);
        System.out.println("*******************");
    }

    public static void printTestResults(HotelOccupancy hotelOccupancy, List<HotelOccupancyUsageResult> hotelOccupancyUsageResults) {

        HotelOccupancyUsageResult hotelOccupancyUsageResultPremium = hotelOccupancyUsageResults.get(0);
        HotelOccupancyUsageResult hotelOccupancyUsageResultEconomy = hotelOccupancyUsageResults.get(1);

        System.out.println("(Input) Free Premium rooms " + hotelOccupancy.getNumberOfPremiumRooms());
        System.out.println("(Input) Free Economy rooms " + hotelOccupancy.getNumberOfEconomyRooms());
        System.out.println("(Output) Usage Premium: " + hotelOccupancyUsageResultPremium.getNumberOfRoomsReserved() + " (EUR " + hotelOccupancyUsageResultPremium.getTotalReservationsBudgetToBePaidByTheCustomers() + ")");
        System.out.println("(Output) Usage Premium: " + hotelOccupancyUsageResultEconomy.getNumberOfRoomsReserved() + " (EUR " + hotelOccupancyUsageResultEconomy.getTotalReservationsBudgetToBePaidByTheCustomers() + ")");
    }
}
