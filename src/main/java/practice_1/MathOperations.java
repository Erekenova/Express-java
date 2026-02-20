package practice_1;

public class MathOperations {

    public static int add(int x, int y){
        return x + y;
    }
    public static int subtract(int x, int y){
        return x - y;
    }
    public static int multiply(int x, int y){
        return x * y;
    }
    public static void divide(int x, int y){
        if (y != 0){
            System.out.println("Деление чисел " + (double) x / y);;
        }
        System.out.println("На ноль делить нельзя!");;
    }
    public static int findMax(int a, int b){
        return Math.max(a,b);
    }
    public static int difference(int x, int y){
        return Math.abs(x - y);
    }
    public static int squareArea(int side){
        return side * side;
    }
    public static int squarePerimeter(int side){
        return side * 4;
    }
    public static double convertSecondsToMinutes(int seconds){
        return (double) seconds / 60;
    }
    public static void averageSpeed(double distance, double time){
        if (time != 0) {
            System.out.println("Средняя скорость " + distance / time);
        }
        else System.out.println("На ноль делить нельзя!");
    }
    public static double findHypotenuse(double a, double b){
        return Math.sqrt(a * a + b * b);
    }
    public static double circleCircumference(double radius){
        return Math.PI * 2 * radius;
    }
    public static  void calculatePercentage(double total, double part){
        if (total > 0) {
            System.out.println("Средняя скорость " + (part / total) * 100 + "%");
        }
        else System.out.println("На ноль делить нельзя!");
    }
    public static double celsiusToFahrenheit(double c){
        return c * 9 / 5 + 32;
    }
    public static double fahrenheitToCelsius(double f){
        return (f - 32) * 5 / 9;
    }
    public static void main(String[] args) {
        int x = 8;
        int y = 0;
        int a = 9;
        int b = 0;
        System.out.println("Сумма чисел " + add(x,y));
        System.out.println("Разница чисел " + subtract(x,y));
        System.out.println("Произведение чисел " + multiply(x,y));
        divide(x,y);
        System.out.println("Максимальное число " + findMax(a,b));
        System.out.println("Разница чисел по модулю " + difference(x,y));
        System.out.println("Площадь квадрата " + squareArea(8));
        System.out.println("Периметр квадрата " + squarePerimeter(8));
        System.out.println(convertSecondsToMinutes(1000));
        averageSpeed(5000,0);
        System.out.println("Гипотенуза " + findHypotenuse(a,b));
        System.out.println("Длина окружности " + circleCircumference(9));
        calculatePercentage(0,25);
        System.out.println("Перевод Цельсия в Фаренгейт " + celsiusToFahrenheit(-2));
        System.out.println("перевод Фаренгейта в Цельсия " + fahrenheitToCelsius(28.4));



    }
}
