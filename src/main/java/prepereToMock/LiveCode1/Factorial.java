package prepereToMock.LiveCode1;

public class Factorial {
    static void main() {
        System.out.println(factorial(-1));
        System.out.println(fact(5));
    }
    public static int factorial(int n){
        int fact = 1;
        for (int i = 2; i <= n; i++){
            fact*=i;
        }
    return fact;
    }
    public static int fact(int n){
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result*=i;
        }
        return result;
    }
}
