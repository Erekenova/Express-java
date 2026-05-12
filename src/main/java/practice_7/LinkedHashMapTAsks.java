package practice_7;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class LinkedHashMapTAsks {
    public static void main(String[] args) {

        //  Задача 1:    Создайте LinkedHashMap и добавьте в него 5 элементов. Выведите их в порядке добавления.
        LinkedHashMap<String, String> phoneBook = new LinkedHashMap<>();
        phoneBook.put("Albina", "89270585351");
        phoneBook.put("Diyar", "89372524039");
        phoneBook.put("Mariya", "89372207087");
        phoneBook.put("Aslbek", "89279158106");
        phoneBook.put("Tomiris", "89018807400");
        System.out.println(phoneBook);


        //Задача 2:    Реализуйте телефонную книгу с LinkedHashMap. Добавьте и найдите контакт.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = scanner.nextLine();
        if (phoneBook.containsKey(name)) {
            System.out.println("Номер телефона контакта " + name + ": " + phoneBook.get(name));
        } else System.out.println("Контакт не найден");

    }
}
