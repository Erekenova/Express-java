package programmingPrinciples;

import prepereToMock.WhatBeOnCode.Static.C;

public class DiscountCalculator {
    private final static double MAX_DISCOUNT = 0.9;
    private final static double COUPON_DISCOUNT = 0.93;
    private final static double LOYAL_DISCOUNT = 0.95;
    private final static double SIMPLE_DISCOUNT = 0.98;

    public static double calculateDiscount(double price, boolean isLoyalCustomer, boolean isFirstPurchase, boolean hasCoupon) {

        if (isLoyalCustomer && isFirstPurchase) {
            return price * MAX_DISCOUNT;
        }
        if (hasCoupon) {
            return price * COUPON_DISCOUNT;
        }
        if (isLoyalCustomer) {
            return price * LOYAL_DISCOUNT;
        }

        return price * SIMPLE_DISCOUNT;
    }
}



