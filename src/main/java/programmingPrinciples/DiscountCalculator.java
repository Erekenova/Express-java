package programmingPrinciples;

public class DiscountCalculator {
    public static double calculateDiscount(double price, boolean isLoyalCustomer, boolean isFirstPurchase, boolean hasCoupon) {

        if (isLoyalCustomer && isFirstPurchase) {
            return price * 0.90;
        }
        if (hasCoupon) {
            return price * 0.93;
        }
        if (isLoyalCustomer) {
            return price * 0.95;
        }

        return price * 0.98;
    }
}



