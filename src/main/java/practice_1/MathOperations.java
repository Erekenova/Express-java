package practice_1;

public class MathOperations {

     public static int add(int x, int y){
        return x + y;
    }
    public static int substract(int x, int y){
        return x - y;
    }
    public static int multiply(int x, int y){
        return x * y;
    }
    public static double divide(int x, int y){
        return (double) x / y;
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
    public static double averageSpeed(double distance, double time){
         if (time != 0) {
             return distance / time;
         }
        else return 0;
    }
    public static double findHypotenuse(double a, double b){
         if (a  > 0 & b > 0){
             return Math.sqrt(a * a + b * b);
         }
         else return 0;
     }
     public static double circleCircumference(double radius){
         return Math.PI * 2 * radius;
     }
     public static double calculatePercentage(double total, double part){
        if (total > 0) {
            return (part / total) * 100;
        }
        else return  0;
     }
     public static double celsiusToFahrenheit(double c){
         return c * 9 / 5 + 32;
     }
     public static double fahrenheitToCelsius(double f){
         return (f - 32) * 5 / 9;
     }
    public static void main(String[] args) {
        int x = 8;
        int y = 7;
        int a = 9;
        int b = 12;
        System.out.println("Сумма чисел " + add(x,y));
        System.out.println("Разница чисел " + substract(x,y));
        System.out.println("Произведение чисел " + multiply(x,y));
        System.out.println("Деление чисел " + divide(x,y));
        System.out.println("Максимальное число " + findMax(a,b));
        System.out.println("Разница чисел по модулю " + divide(x,y));
        System.out.println("Площадь квадрата " + squareArea(8));
        System.out.println("Периметр квадрата " + squarePerimeter(8));
        System.out.println(convertSecondsToMinutes(1000));
        System.out.println("Средняя скорость " + averageSpeed(5000,300));
        System.out.println("Гипотенуза " + findHypotenuse(a,b));
        System.out.println("Длина окружности " + circleCircumference(9));
        System.out.println("Проценты " + calculatePercentage(200,25)+ "%");
        System.out.println("Перевод Цельсия в Фаренгейт " + celsiusToFahrenheit(-2));
        System.out.println("перевод Фаренгейта в Цельсия " + fahrenheitToCelsius(28.4));



    }
}
