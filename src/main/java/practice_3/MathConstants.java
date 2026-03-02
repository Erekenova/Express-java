package practice_3;

public class MathConstants {
    final static double PI = 3.14159;
    final static double E = 2.71828;

    public static double calculateCircleArea(double r) {
        return PI * r * r;
    }

    public static double calculateCircumference(double r) {
        return 2 * PI * r;
    }

}
