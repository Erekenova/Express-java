package practice_4;

import java.util.Scanner;

public class IfElseTaskSolver {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        //1. Определение знака числа
       /* int number;
        System.out.println("Введите число:");
        number = scaner.nextInt();
        checkNumberSign(number);*/

        //2. Поиск наибольшего из двух чисел
    /*    System.out.println("Введите числа a и b:");
        int a = scaner.nextInt();
        int b = scaner.nextInt();
        System.out.println("Максимальное число: " + findMaxNumber(a,b)); */
        //3. Вывод оценки по шкале 1–5
         /*  System.out.println("Введите оценку:");
        int  number = scaner.nextInt();
        System.out.println(printGrade(number));*/

        //4. Проверка на чётность
    /*    System.out.println("Введите число:");
        int number = scaner.nextInt();
        System.out.println(checkParity(number)
        );*/
        // 5. Определение размера скидки по
      /*  System.out.println("Введите ваш возраст:");
        int age = scaner.nextInt();
        discauntByAge(age);*/
       // 6. Оценка результата теста по баллам
        System.out.println("Введите количество баллов от 0-100");
        int balls = scaner.nextInt();
        checkBallsFromTest(balls);

    }

    //1.Определение знака числа
    public static void checkNumberSign(int number) {
        if (number > 0) {
            System.out.println("Число положительное.");
        } else if (number < 0) {
            System.out.println("Число отрицательное.");
        } else System.out.println("Число равно нулю.");

    }

    //2. Поиск наибольшего из двух чисел
    public static int findMaxNumber(int a, int b) {
        return Math.max(a, b);
    }

    //3.Вывод оценки по шкале 1–5
    public static String printGrade(int grade) {
        String s = "";
        switch (grade) {
            case 1:
                s = "Неудовлетворительно";
                break;
            case 2:
                s = "Неудовлетворительно";
                break;
            case 3:
                s = "Удовлетворительно";
                break;
            case 4:
                s = "Хорошо";
                break;
            case 5:
                s = "Отлично";
                break;
            default:
                s = "Несуществующая оценка";

        }
        return s;

    }

    //4.Проверка на чётность
    public static String checkParity(int number) {
        String result = "";
        if (number % 2 == 0) {
            result = "Четное";
        } else result = "Нечетное";
        return result;
    }

    // 5. Определение размера скидки по возрасту
    public static void discauntByAge(int age) {
        if (age < 18) {
            System.out.println("Ваша скидка 25%");
        } else if (age >= 65) {
            System.out.println("Ваша скидка 30 %");
        } else System.out.println("Скидка не предусмотрена");
    }

   // 6. Оценка результата теста по баллам
    public static void checkBallsFromTest(int balls){
        if(balls >= 90){
            System.out.println("Отлично");
        }
        else if ((balls >= 75) && (balls <= 89) ){
            System.out.println("Хорошо");
        }
        else if ((balls >= 60) && (balls <= 74)){
            System.out.println("Удовлетворительно");
        }
        else System.out.println("Неудовлетворительно");
    }
}
