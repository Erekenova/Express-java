package practice_4;

import java.util.Scanner;

public class WhileTaskSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите N");
        int n = scanner.nextInt();
        System.out.println("Факториал равен: " + factorial(n));
        //printEvenToN(n);
       // printCountDown(n);

    }
    //1. Вычисление факториала с помощью while
    public static int factorial(int n){
        int result = 1;
        int i = 1;
        while (i <= n){
            result = result * i;
            i++;
        }
        return result;
    }
    //2. Вывод всех четных чисел до заданного
    public static void printEvenToN(int n){
        int i = 1;
        while (i <= n){
            if(i % 2 == 0)
            System.out.println(i);
            i++;
        }
    }
    //3. Обратный отсчёт от введённого числа до 1
    public static void printCountDown(int n){
        while (n > 0){
            System.out.println(n);
            n--;
        }
    }

}
