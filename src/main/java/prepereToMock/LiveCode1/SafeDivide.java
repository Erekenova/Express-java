package prepereToMock.LiveCode1;

public class SafeDivide {
    public static double safeDivade(double a, double b){
        try {
            return b / a;
        }
        catch (ArithmeticException e){
            System.out.println("Ошибка деления на ноль");
            return 0;
        }

    }

    static void main() {
        System.out.println(safeDivade(9,0));
    }
}
