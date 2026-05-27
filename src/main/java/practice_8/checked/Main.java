package practice_8.checked;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.time.DateTimeException;
/*
        1. Обработка проверяемого исключения
        Условие задачи:
        Напишите программу, которая пытается открыть файл с именем "data.txt". Если файл не найден, программа должна обработать исключение и вывести сообщение: "Файл не найден".
*/
public class Main {
   /* public static void main(String[] args) {
        try {
                FileReader fileReader = new FileReader("data.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }*/

   // 3. Создание и использование собственного проверяемого исключения
   // Условие задачи: Разработайте метод, который проверяет валидность возраста пользователя. Если возраст меньше 0 или больше 150, метод должен выбрасывать проверяемое исключение.
   public static void main(String[] args)  {
       try {
           checkAge(100);
       } catch (InvalidAgeException e) {
           System.out.println(e.getMessage());
       }
   }
    public static void checkAge(int age) throws InvalidAgeException {
        if ((age < 0) || (age > 150))
        {
            throw new InvalidAgeException("Возраст не валиден.");
        }
        else System.out.println("Валидный возраст.");
    }
}