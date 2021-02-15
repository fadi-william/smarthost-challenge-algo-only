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
import java.util.Date;
import java.util.Objects;

/**
 * The customer request domain class.
 *
 * @author Fadi william
 */
public class CustomerRequest {

    private Date date;

    private String customerId;

    private String hotelId;

    private BigDecimal amountCustomerWillingToPay;

    /**
     * Instantiates a new customer request.
     *
     * @param date                       the date
     * @param customerId                 the customer id
     * @param hotelId                    the hotel id
     * @param amountCustomerWillingToPay the amount customer willing to pay
     */
    public CustomerRequest(Date date, String customerId, String hotelId, BigDecimal amountCustomerWillingToPay) {
        this.date = date;
        this.customerId = customerId;
        this.hotelId = hotelId;
        this.amountCustomerWillingToPay = amountCustomerWillingToPay;
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
     * Gets customer id.
     *
     * @return the customer id
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Sets customer id.
     *
     * @param customerId the customer id
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
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
     * Gets amount customer willing to pay.
     *
     * @return the amount customer willing to pay
     */
    public BigDecimal getAmountCustomerWillingToPay() {
        return amountCustomerWillingToPay;
    }

    /**
     * Sets amount customer willing to pay.
     *
     * @param amountCustomerWillingToPay the amount customer willing to pay
     */
    public void setAmountCustomerWillingToPay(BigDecimal amountCustomerWillingToPay) {
        this.amountCustomerWillingToPay = amountCustomerWillingToPay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerRequest that = (CustomerRequest) o;
        return date.equals(that.date) &&
                customerId.equals(that.customerId) &&
                hotelId.equals(that.hotelId) &&
                amountCustomerWillingToPay.equals(that.amountCustomerWillingToPay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, customerId, hotelId, amountCustomerWillingToPay);
    }

    @Override
    public String toString() {
        return "CustomerRequest{" +
                "date=" + date +
                ", customerId='" + customerId + '\'' +
                ", hotelId='" + hotelId + '\'' +
                ", amountCustomerWillingToPay=" + amountCustomerWillingToPay +
                '}';
    }
}
