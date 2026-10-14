package programmingPrinciples;

public class Main {
    public static void main(String[] args){
        System.out.println(MathOperations.add(2,3,4,4,0,5));
        System.out.println(DiscountCalculator.calculateDiscount(100,true,false,false));
        System.out.println(DiscountCalculator.calculateDiscount(100,true,true,false));
        System.out.println(DiscountCalculator.calculateDiscount(100,true,false,true));
        System.out.println(DiscountCalculator.calculateDiscount(100,false,false,false));
    }
}
