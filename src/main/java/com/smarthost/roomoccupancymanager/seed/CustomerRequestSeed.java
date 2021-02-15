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

import com.smarthost.roomoccupancymanager.domain.CustomerRequest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * The customer request seed provider.
 *
 * @author Fadi William
 */
public class CustomerRequestSeed {

    /**
     * Gets first customer request seed list.
     *
     * @return the first customer request seed list
     */
    public static List<CustomerRequest> getCustomerRequestSeed1() {

        List<CustomerRequest> customerRequestList = new ArrayList<>();

        // Create the requested date.
        Calendar calendar = Calendar.getInstance();
        calendar.set(2021, 02, 20);

        Date date = calendar.getTime();

        CustomerRequest cr1 = new CustomerRequest(date, "1", "1", new BigDecimal(23));
        CustomerRequest cr2 = new CustomerRequest(date, "2", "1",  new BigDecimal(45));
        CustomerRequest cr3 = new CustomerRequest(date, "3", "1",  new BigDecimal(155));
        CustomerRequest cr4 = new CustomerRequest(date, "4", "1",  new BigDecimal(374));
        CustomerRequest cr5 = new CustomerRequest(date, "5", "1",  new BigDecimal(22));
        CustomerRequest cr6 = new CustomerRequest(date, "6", "1",  new BigDecimal(99));
        CustomerRequest cr7 = new CustomerRequest(date, "7", "1",  new BigDecimal(100));
        CustomerRequest cr8 = new CustomerRequest(date, "8", "1",  new BigDecimal(101));
        CustomerRequest cr9 = new CustomerRequest(date, "9", "1",  new BigDecimal(115));
        CustomerRequest cr10 = new CustomerRequest(date, "10", "1",  new BigDecimal(209));

        customerRequestList.add(cr1);
        customerRequestList.add(cr2);
        customerRequestList.add(cr3);
        customerRequestList.add(cr4);
        customerRequestList.add(cr5);
        customerRequestList.add(cr6);
        customerRequestList.add(cr7);
        customerRequestList.add(cr8);
        customerRequestList.add(cr9);
        customerRequestList.add(cr10);

        return customerRequestList;
    }

    /**
     * Gets second customer request seed list.
     *
     * @return the second customer request seed list
     */
    public static List<CustomerRequest> getCustomerRequestSeed2() {

        List<CustomerRequest> customerRequestList = new ArrayList<>();

        // Create the requested date.
        Calendar calendar = Calendar.getInstance();
        calendar.set(2021, 02, 21);

        Date date = calendar.getTime();

        CustomerRequest cr11 = new CustomerRequest(date, "1", "1", new BigDecimal(23));
        CustomerRequest cr12 = new CustomerRequest(date, "2", "1",  new BigDecimal(45));
        CustomerRequest cr13 = new CustomerRequest(date, "3", "1",  new BigDecimal(155));
        CustomerRequest cr14 = new CustomerRequest(date, "4", "1",  new BigDecimal(374));
        CustomerRequest cr15 = new CustomerRequest(date, "5", "1",  new BigDecimal(22));
        CustomerRequest cr16 = new CustomerRequest(date, "6", "1",  new BigDecimal(99));
        CustomerRequest cr17 = new CustomerRequest(date, "7", "1",  new BigDecimal(100));
        CustomerRequest cr18 = new CustomerRequest(date, "8", "1",  new BigDecimal(101));
        CustomerRequest cr19 = new CustomerRequest(date, "9", "1",  new BigDecimal(115));
        CustomerRequest cr20 = new CustomerRequest(date, "10", "1",  new BigDecimal(209));

        customerRequestList.add(cr11);
        customerRequestList.add(cr12);
        customerRequestList.add(cr13);
        customerRequestList.add(cr14);
        customerRequestList.add(cr15);
        customerRequestList.add(cr16);
        customerRequestList.add(cr17);
        customerRequestList.add(cr18);
        customerRequestList.add(cr19);
        customerRequestList.add(cr20);

        return customerRequestList;
    }

    /**
     * Gets third customer request seed list.
     *
     * @return the third customer request seed list
     */
    public static List<CustomerRequest> getCustomerRequestSeed3() {

        List<CustomerRequest> customerRequestList = new ArrayList<>();

        // Create the first requested date.
        Calendar calendar = Calendar.getInstance();
        calendar.set(2021, 02, 22);

        Date date = calendar.getTime();

        CustomerRequest cr21 = new CustomerRequest(date, "1", "1", new BigDecimal(23));
        CustomerRequest cr22 = new CustomerRequest(date, "2", "1",  new BigDecimal(45));
        CustomerRequest cr23 = new CustomerRequest(date, "3", "1",  new BigDecimal(155));
        CustomerRequest cr24 = new CustomerRequest(date, "4", "1",  new BigDecimal(374));
        CustomerRequest cr25 = new CustomerRequest(date, "5", "1",  new BigDecimal(22));
        CustomerRequest cr26 = new CustomerRequest(date, "6", "1",  new BigDecimal(99));
        CustomerRequest cr27 = new CustomerRequest(date, "7", "1",  new BigDecimal(100));
        CustomerRequest cr28 = new CustomerRequest(date, "8", "1",  new BigDecimal(101));
        CustomerRequest cr29 = new CustomerRequest(date, "9", "1",  new BigDecimal(115));
        CustomerRequest cr30 = new CustomerRequest(date, "10", "1",  new BigDecimal(209));

        customerRequestList.add(cr21);
        customerRequestList.add(cr22);
        customerRequestList.add(cr23);
        customerRequestList.add(cr24);
        customerRequestList.add(cr25);
        customerRequestList.add(cr26);
        customerRequestList.add(cr27);
        customerRequestList.add(cr28);
        customerRequestList.add(cr29);
        customerRequestList.add(cr30);

        return customerRequestList;
    }

    /**
     * Gets fourth customer request seed list.
     *
     * @return the fourth customer request seed list
     */
    public static List<CustomerRequest> getCustomerRequestSeed4() {

        List<CustomerRequest> customerRequestList = new ArrayList<>();

        // Create the requested date.
        Calendar calendar = Calendar.getInstance();
        calendar.set(2021, 02, 23);

        Date date4 = calendar.getTime();

        CustomerRequest cr31 = new CustomerRequest(date4, "1", "1", new BigDecimal(23));
        CustomerRequest cr32 = new CustomerRequest(date4, "2", "1", new BigDecimal(45));
        CustomerRequest cr33 = new CustomerRequest(date4, "3", "1", new BigDecimal(155));
        CustomerRequest cr34 = new CustomerRequest(date4, "4", "1", new BigDecimal(374));
        CustomerRequest cr35 = new CustomerRequest(date4, "5", "1", new BigDecimal(22));
        CustomerRequest cr36 = new CustomerRequest(date4, "6", "1", new BigDecimal(99));
        CustomerRequest cr37 = new CustomerRequest(date4, "7", "1", new BigDecimal(100));
        CustomerRequest cr38 = new CustomerRequest(date4, "8", "1", new BigDecimal(101));
        CustomerRequest cr39 = new CustomerRequest(date4, "9", "1", new BigDecimal(115));
        CustomerRequest cr40 = new CustomerRequest(date4, "10", "1", new BigDecimal(209));

        customerRequestList.add(cr31);
        customerRequestList.add(cr32);
        customerRequestList.add(cr33);
        customerRequestList.add(cr34);
        customerRequestList.add(cr35);
        customerRequestList.add(cr36);
        customerRequestList.add(cr37);
        customerRequestList.add(cr38);
        customerRequestList.add(cr39);
        customerRequestList.add(cr40);

        return customerRequestList;
    }
}
