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

import com.smarthost.roomoccupancymanager.domain.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * The customer seed provider.
 *
 * @author Fadi William
 */
public class CustomerSeed {

    /**
     * Gets customer seed list.
     *
     * @return the customer seed list
     */
    public static List<Customer> getCustomerSeed() {

        List<Customer> customerList = new ArrayList<>();

        Customer c1 = new Customer("1", "Fadi William");
        Customer c2 = new Customer("2", "Christiane Werner");
        Customer c3 = new Customer("3", "Klemens Scholz");
        Customer c4 = new Customer("4", "Inglebert Eichel");
        Customer c5 = new Customer("5", "Rolf Sauber");
        Customer c6 = new Customer("6", "Rudolf Nagel");
        Customer c7 = new Customer("7", "Kerstin Berger");
        Customer c8 = new Customer("8", "Tadday Horn");
        Customer c9 = new Customer("9", "Horst Riese");
        Customer c10 = new Customer("10", "Luise Fabel");

        customerList.add(c1);
        customerList.add(c2);
        customerList.add(c3);
        customerList.add(c4);
        customerList.add(c5);
        customerList.add(c6);
        customerList.add(c7);
        customerList.add(c8);
        customerList.add(c9);
        customerList.add(c10);

        return customerList;
    }
}
