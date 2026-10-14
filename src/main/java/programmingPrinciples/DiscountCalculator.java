package programmingPrinciples;


public class DiscountCalculator {
    private final static double MAX_PRICE_FACTOR = 0.9;
    private final static double COUPON_PRICE_FACTOR = 0.93;
    private final static double LOYAL_PRICE_FACTOR = 0.95;
    private final static double SIMPLE_PRICE_FACTOR = 0.98;

    public static double calculateDiscount(double price, boolean isLoyalCustomer, boolean isFirstPurchase, boolean hasCoupon) {

        if (isLoyalCustomer && isFirstPurchase) {
            return price * MAX_PRICE_FACTOR;
        }
        if (hasCoupon) {
            return price * COUPON_PRICE_FACTOR;
        }
        if (isLoyalCustomer) {
            return price * LOYAL_PRICE_FACTOR;
        }

        return price * SIMPLE_PRICE_FACTOR;
    }
}



