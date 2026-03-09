package practice_4;

import java.util.Scanner;

public class SwitchTaskSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. Вывод дня недели по номеру
        /*System.out.println("Введите номер дня недели:");
        int day = scanner.nextInt();
        System.out.println(printDayOfWeak(day));*/
        //2. Стоимость билета по дню недели
        /* System.out.println("Введите номер дня недели:");
        int day = scanner.nextInt();
        checkTicketPrice(day);*/
        //3. Перевод числовых оценок в буквенные (A–F)
        /*System.out.println("Введите число от 0-100:");
        int ball = scanner.nextInt();
        System.out.println(convertGradesToLetters(ball));*/
        //4. Обработка текстовых команд
        /*System.out.println("Введите комманду:");
        String command = scanner.nextLine();
        System.out.println(processingTextCommands(command));*/
        //5. Простой калькулятор с использованием switch
        System.out.println("Введите первое число: ");
       double a = scanner.nextDouble();
        System.out.println("Введите второе число: ");
      double b = scanner.nextDouble();
        System.out.println("Введите оператор +,-,*,/ ");
       scanner.nextLine();

       String operator = scanner.nextLine();

        calculateTwoNumber(a,b,operator);


    }

    //1. Вывод дня недели по номеру
    public static String printDayOfWeak(int day) {
        String result = "";
        switch (day) {
            case 1:
                result = "Понедельник";
                break;
            case 2:
                result = "Вторник";
                break;
            case 3:
                result = "Среда";
                break;
            case 4:
                result = "Четверг";
                break;
            case 5:
                result = "Пятница";
                break;
            case 6:
                result = "Суббота";
                break;
            case 7:
                result = "Воскресенье";
                break;
            default:
                result = "Нет такого дня недели";
                break;
        }
        return result;

    }

    //2. Стоимость билета по дню недели
    public static void checkTicketPrice(int day) {

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Стоимость билета 300 рублей");
                break;
            case 6:
            case 7:
                System.out.println("Стоимость билета 450 рублей");
                break;
            default:
                System.out.println("Нет такого дня недели");
        }

    }

    //3. Перевод числовых оценок в буквенные (A–F)
    public static String convertGradesToLetters(int ball) {
        String grade = "";
        if ((ball >= 90) && (ball <= 100)) {
            grade = "A";
        } else if ((ball >= 80) && (ball < 90)) {
            grade = "B";
        } else if ((ball >= 70) && (ball < 80)) {
            grade = "C";
        } else if ((ball >= 60) && (ball < 70)) {
            grade = "D";
        } else if ((ball >= 0) && (ball < 60)) {
            grade = "F";
        } else grade = "Некорректный ввод числа";
        return grade;
    }

    //4. Обработка текстовых команд
    public static String processingTextCommands(String command) {
        String result = "";
        switch (command) {
            case "start":
                result = "Система запущена";
                break;
            case "stop":
                result = "Система остановлена";
                break;
            case "restart":
                result = "Перезагрузка системы";
                break;
            case "status":
                result = "Статус системы";
                break;
            default:
                result = "Нет такой команды";
        }
        return result;

    }
//5. Простой калькулятор с использованием switch
    public static void calculateTwoNumber(double a, double b, String operator){
        switch (operator){
            case "+" :
                System.out.println(a + b);
                break;
            case "-" :
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/" :
                if (b == 0){
                    System.out.println("Делить на ноль нельзя");
                } else   System.out.println(a / b);
                break;
        }

    }


}



