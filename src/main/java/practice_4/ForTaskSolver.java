package practice_4;

import java.util.Scanner;

public class ForTaskSolver {
    public static void main(String[] args) {
        // 1. Вывод чисел от 1 до 100, делящихся на 3
       //printNumbersDivide3();
        // 2. Сумма чисел от 1 до n
      //  Scanner scanner = new Scanner(System.in);
       /* System.out.println("Введите число n:");
        int n = scanner.nextInt();
        System.out.println("Сумма чисел от 1 до "+ n + " равна: "+sumN(n));*/
        //3. Таблица умножения для числа
        /*System.out.println("Введите число:");
        int n = scanner.nextInt();*/
       // printPowTable(n);
      //  4. Проверка на простое число
       // System.out.println(isSimpleNumber(n));
        //  5. Вывод чисел от 1 до 10
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }

    }
    // 1. Вывод чисел от 1 до 100, делящихся на 3
    public static void printNumbersDivide3(){
        for (int i = 0; i <= 100; i++ ){
            if(i % 3 == 0){
                System.out.println(i);
            }
        }
    }
   // 2. Сумма чисел от 1 до n
    public static int sumN(int n) {
    int sum = 0;
    for (int i= 1; i < n; i++ ){
        sum = sum + i;
    }
    return sum;
    }
//3. Таблица умножения для числа
    public static void printPowTable(int n){
        for (int i = 1; i <= 10; i++){
            System.out.println(n + " * " + i + " = " + i * n );
        }
    }
    //4. Проверка на простое число
    public static boolean isSimpleNumber( int n){
        boolean isPrime = true;
        for(int i = 2; i < n; i ++ ){
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }




}
