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

import java.util.Date;
import java.util.Objects;

/**
 * The hotel occupancy domain class.
 *
 * @author Fadi william
 */
public class HotelOccupancy {

    private Date date;

    private String hotelId;

    private Integer numberOfPremiumRooms;

    private Integer numberOfEconomyRooms;

    /**
     * Instantiates a new hotel occupancy.
     *
     * @param date                 the date
     * @param hotelId              the hotel id
     * @param numberOfPremiumRooms the number of premium rooms
     * @param numberOfEconomyRooms the number of economy rooms
     */
    public HotelOccupancy(Date date, String hotelId, Integer numberOfPremiumRooms, Integer numberOfEconomyRooms) {
        this.date = date;
        this.hotelId = hotelId;
        this.numberOfPremiumRooms = numberOfPremiumRooms;
        this.numberOfEconomyRooms = numberOfEconomyRooms;
    }

    /**
     * Gets date.
     *
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets date.
     *
     * @param date the date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Gets hotel id.
     *
     * @return the hotel id
     */
    public String getHotelId() {
        return hotelId;
    }

    /**
     * Sets hotel id.
     *
     * @param hotelId the hotel id
     */
    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    /**
     * Gets number of premium rooms.
     *
     * @return the number of premium rooms
     */
    public Integer getNumberOfPremiumRooms() {
        return numberOfPremiumRooms;
    }

    /**
     * Sets number of premium rooms.
     *
     * @param numberOfPremiumRooms the number of premium rooms
     */
    public void setNumberOfPremiumRooms(Integer numberOfPremiumRooms) {
        this.numberOfPremiumRooms = numberOfPremiumRooms;
    }

    /**
     * Gets number of economy rooms.
     *
     * @return the number of economy rooms
     */
    public Integer getNumberOfEconomyRooms() {
        return numberOfEconomyRooms;
    }

    /**
     * Sets number of economy rooms.
     *
     * @param numberOfEconomyRooms the number of economy rooms
     */
    public void setNumberOfEconomyRooms(Integer numberOfEconomyRooms) {
        this.numberOfEconomyRooms = numberOfEconomyRooms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HotelOccupancy that = (HotelOccupancy) o;
        return date.equals(that.date) &&
                hotelId.equals(that.hotelId) &&
                numberOfPremiumRooms.equals(that.numberOfPremiumRooms) &&
                numberOfEconomyRooms.equals(that.numberOfEconomyRooms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, hotelId, numberOfPremiumRooms, numberOfEconomyRooms);
    }

    @Override
    public String toString() {
        return "HotelOccupancy{" +
                "date=" + date +
                ", hotelId='" + hotelId + '\'' +
                ", numberOfPremiumRooms=" + numberOfPremiumRooms +
                ", numberOfEconomyRooms=" + numberOfEconomyRooms +
                '}';
    }
}
