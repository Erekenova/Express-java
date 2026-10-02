package programmingPrinciples;

public class Main {
    static void main() {
        System.out.println(MathOperations.add(new int[]{2,3,4,4,0,5}));
        System.out.println(DiscountCalculator.calculateDiscount(100,true,false,false));
        System.out.println(DiscountCalculator.calculateDiscount(100,true,true,false));
        System.out.println(DiscountCalculator.calculateDiscount(100,true,false,true));
        System.out.println(DiscountCalculator.calculateDiscount(100,false,false,false));
    }
}
