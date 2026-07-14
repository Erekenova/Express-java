package practice_12;

public class DebugTask8 {
    public static void main(String[] args) {
        double a = 0.1 * 3;
        double b = 0.3;
        double e = 1e-9;
        if (Math.abs(a - b) < e) System.out.println("Equal");
        else {
            System.out.println("Not Equal");
        }
    }
}
