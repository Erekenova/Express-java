package practice_12;

public class DebugTask6 {
    public static void main(String[] args) {
        countdown(5);
    }
    public static int countdown(int n) {
        while (n > 0) {
            System.out.println(n);
            n = countdown(n - 1);
        }
        return n;
    }
}
