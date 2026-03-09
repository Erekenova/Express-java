package practice_4;

import java.util.Scanner;

public class DoWhileTaskSolver {
    public static void main(String[] args) {
        // Напишите программу, которая запрашивает у пользователя число и продолжает спрашивать, пока оно не станет положительным.
        /*        Scanner scanner = new Scanner(System.in);*/
        /*        int n;*/
        /*       do {*/
        /*           System.out.println("Введите число:");*/
        /*           n =  scanner.nextInt();*/
        /*       }*/
        /*       while (n <= 0);*/
        //Реализуйте программу, которая запрашивает у пользователя пароль, пока он не введёт верный (пароль заранее задан в коде).
        /*   Scanner scanner = new Scanner(System.in);*/
        /*   String password = "12345";*/
        /*   String linePass;*/
        /*   do {*/
        /*       System.out.println("Введите пароль");*/
        /*       linePass = scanner.nextLine();*/
        /*   }*/
        /*   while (!password.equals(linePass));*/
        /*   System.out.println("Пароль верный!");*/

        //Создайте программу, которая выводит числа от 1 до 10, используя do-while.
        /* int i = 1;*/
        /* do {*/
        /*     System.out.println(i);*/
        /*     i++;*/
        /* }*/
        /* while (i <= 10);*/
        // Напишите программу, которая будет ждать ввода команды "exit" от пользователя для завершения работы.
        /*  Scanner scanner = new Scanner(System.in);*/
        /*  String command;*/
        /*  do {*/
        /*      System.out.println("Введите команду:");*/
        /*      command = scanner.nextLine();*/
        /* }*/
        /*  while (!command.equals("exit"));*/
        /*  System.out.println("Программа завершена");*/

        //Напишите программу, которая подсчитывает, сколько цифр в целом числе, введённом пользователем.
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;
        do {
            number = number / 10;
            count++;
        }
        while (number != 0);
        System.out.println("Количество цифр " + count);


    }
}
