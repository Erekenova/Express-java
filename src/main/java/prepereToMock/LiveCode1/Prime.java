package prepereToMock.LiveCode1;
//проверка является ли число простым делится на себя и 1
public class Prime {
    public static boolean isPrime(int number){
        if (number < 2) return false;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0){
                return false;
            }

        }
        return true;
    }

    static void main() {
        System.out.println(isPrime(7));
        System.out.println(isPrime(8));
        System.out.println(isPrime(9));
        System.out.println(isPrime(0));
        System.out.println(isPr(7));
    }
    public static boolean isPr(int n){
        if(n < 2) return  false;
        for (int i = 2; i * i <= n; i++) {
           if  (n % i == 0) return false;
        }
        return  true;
    }

}
