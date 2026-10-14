package programmingPrinciples;

public class MathOperations {
    public  static int add(int... arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}