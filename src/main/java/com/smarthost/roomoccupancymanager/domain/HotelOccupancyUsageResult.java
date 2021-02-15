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

package com.smarthost.roomoccupancymanager.domain;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * The hotel occupancy usage result domain class.
 *
 * @author Fadi William
 */
public class HotelOccupancyUsageResult {

    private String roomCategory;

    private Integer numberOfRoomsReserved;

    private BigDecimal totalReservationsBudgetToBePaidByTheCustomers;

    /**
     * Instantiates a new hotel occupancy usage result.
     *
     * @param roomCategory the room category
     */
    public HotelOccupancyUsageResult(String roomCategory) {
        this.numberOfRoomsReserved = 0;
        this.totalReservationsBudgetToBePaidByTheCustomers = new BigDecimal(0);
        this.roomCategory = roomCategory;
    }

    /**
     * Instantiates a new hotel occupancy usage result.
     *
     * @param roomCategory                                  the room category
     * @param numberOfRoomsReserved                         the number of rooms reserved
     * @param totalReservationsBudgetToBePaidByTheCustomers the total reservations budget to be paid by the customers
     */
    public HotelOccupancyUsageResult(String roomCategory, Integer numberOfRoomsReserved, BigDecimal totalReservationsBudgetToBePaidByTheCustomers) {
        this.roomCategory = roomCategory;
        this.numberOfRoomsReserved = numberOfRoomsReserved;
        this.totalReservationsBudgetToBePaidByTheCustomers = totalReservationsBudgetToBePaidByTheCustomers;
    }

    /**
     * Gets room category.
     *
     * @return the room category
     */
    public String getRoomCategory() {
        return roomCategory;
    }

    /**
     * Sets room category.
     *
     * @param roomCategory the room category
     */
    public void setRoomCategory(String roomCategory) {
        this.roomCategory = roomCategory;
    }

    /**
     * Gets number of rooms reserved.
     *
     * @return the number of rooms reserved
     */
    public Integer getNumberOfRoomsReserved() {
        return numberOfRoomsReserved;
    }

    /**
     * Increment number of rooms reserved by 1.
     */
    public void incrementNumberOfRoomsReservedBy1() {
        this.numberOfRoomsReserved += 1;
    }

    /**
     * Decrement of rooms reserved by 1.
     */
    public void decrementOfRoomsReservedBy1() {
        this.numberOfRoomsReserved -= 1;
    }

    /**
     * Sets number of rooms reserved.
     *
     * @param numberOfRoomsReserved the number of rooms reserved
     */
    public void setNumberOfRoomsReserved(Integer numberOfRoomsReserved) {
        this.numberOfRoomsReserved = numberOfRoomsReserved;
    }

    /**
     * Gets total reservations budget to be paid by the customers.
     *
     * @return the total reservations budget to be paid by the customers
     */
    public BigDecimal getTotalReservationsBudgetToBePaidByTheCustomers() {
        return totalReservationsBudgetToBePaidByTheCustomers;
    }

    /**
     * Add room reservation cost to the budget.
     *
     * @param costToAdd the cost to add
     */
    public void addRoomReservationCostToTheBudget(BigDecimal costToAdd) {
        this.totalReservationsBudgetToBePaidByTheCustomers = this.totalReservationsBudgetToBePaidByTheCustomers.add(costToAdd);
    }

    /**
     * Subtract room reservation cost to the budget.
     *
     * @param costToSubtract the cost to subtract
     */
    public void subtractRoomReservationCostToTheBudget(BigDecimal costToSubtract) {
        this.totalReservationsBudgetToBePaidByTheCustomers = this.totalReservationsBudgetToBePaidByTheCustomers.subtract(costToSubtract);
    }

    /**
     * Sets total reservations budget to be paid by the customers.
     *
     * @param totalReservationsBudgetToBePaidByTheCustomers the total reservations budget to be paid by the customers
     */
    public void setTotalReservationsBudgetToBePaidByTheCustomers(BigDecimal totalReservationsBudgetToBePaidByTheCustomers) {
        this.totalReservationsBudgetToBePaidByTheCustomers = totalReservationsBudgetToBePaidByTheCustomers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HotelOccupancyUsageResult that = (HotelOccupancyUsageResult) o;
        return roomCategory.equals(that.roomCategory) &&
                numberOfRoomsReserved.equals(that.numberOfRoomsReserved) &&
                totalReservationsBudgetToBePaidByTheCustomers.equals(that.totalReservationsBudgetToBePaidByTheCustomers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomCategory, numberOfRoomsReserved, totalReservationsBudgetToBePaidByTheCustomers);
    }

    @Override
    public String toString() {
        return "HotelOccupancyUsageResult{" +
                "roomCategory='" + roomCategory + '\'' +
                ", numberOfRoomsReserved=" + numberOfRoomsReserved +
                ", totalReservationsBudgetToBePaidByTheCustomers=" + totalReservationsBudgetToBePaidByTheCustomers +
                '}';
    }
}
