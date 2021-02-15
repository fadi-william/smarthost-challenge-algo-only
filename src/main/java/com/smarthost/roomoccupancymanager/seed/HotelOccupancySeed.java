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

package com.smarthost.roomoccupancymanager.seed;

import com.smarthost.roomoccupancymanager.domain.HotelOccupancy;

import java.util.Calendar;
import java.util.Date;

/**
 * The hotel occupancy seed provider.
 *
 * @author Fadi William
 */
public class HotelOccupancySeed {

    /**
     * Gets first hotel occupancy seed object.
     *
     * @return the first hotel occupancy seed object
     */
    public static HotelOccupancy getHotelOccupancySeed1() {

        // Create the requested date.
        Calendar calendar = Calendar.getInstance();
        calendar.set(2021, 02, 20);

        Date date = calendar.getTime();

        return new HotelOccupancy(date, "1", 3, 3);
    }

    /**
     * Gets second hotel occupancy seed object.
     *
     * @return the second hotel occupancy seed object
     */
    public static HotelOccupancy getHotelOccupancySeed2() {

        // Create the requested date.
        Calendar calendar = Calendar.getInstance();
        calendar.set(2021, 02, 21);

        Date date = calendar.getTime();

        return new HotelOccupancy(date, "1", 7, 5);
    }

    /**
     * Gets third hotel occupancy seed object.
     *
     * @return the third hotel occupancy seed object
     */
    public static HotelOccupancy getHotelOccupancySeed3() {

        // Create the requested date.
        Calendar calendar = Calendar.getInstance();
        calendar.set(2021, 02, 22);

        Date date = calendar.getTime();

        return new HotelOccupancy(date, "1", 2, 7);
    }

    /**
     * Gets fourth hotel occupancy seed object.
     *
     * @return the fourth hotel occupancy seed object
     */
    public static HotelOccupancy getHotelOccupancySeed4() {

        // Create the requested date.
        Calendar calendar = Calendar.getInstance();
        calendar.set(2021, 02, 23);

        Date date = calendar.getTime();

        return new HotelOccupancy(date, "1", 7, 1);
    }
}
