package practice_4;

import java.util.Scanner;

public class BreakContinueTaskSolver {
    public static void main(String[] args) {
       // Напишите программу, которая запрашивает у пользователя числа и выводит их сумму. Программа завершает выполнение, если пользователь вводит отрицательное число.
/*        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("Введите число:");
            int a = scanner.nextInt();
            if (a < 0){
                break;
            }
            sum += a;
        }
        System.out.println("Сумма чисел равна:" + sum);*/

        //Создайте программу, которая выводит числа от 1 до 20, пропуская те, которые делятся на 3.
    /*    for (int i = 1; i <=20; i++){
            if (i % 3 == 0)
                continue;
            System.out.println(i);
        }*/
// Напишите программу, которая принимает ряд чисел от пользователя и выводит только положительные. Отрицательные числа нужно пропускать.
   /* Scanner scanner = new Scanner(System.in);
      while (true){
          System.out.println("Введите число:");
         int  number = scanner.nextInt();
         if (number == 0){
             break;
         }
         if (number < 0 ){
             continue;
         }
          System.out.println(number);
      }*/
    //    Программа должна запрашивать строки у пользователя и завершаться только тогда, когда введена команда "stop".
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Введите команду:");
            String string = scanner.nextLine();
            if (string.equals("stop")){
                break;
            }
            else System.out.println("Вы ввели: " + string);
        }

    }

}
