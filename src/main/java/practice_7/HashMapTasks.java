package practice_7;

import java.util.HashMap;
import java.util.Map;

public class HashMapTasks {
    public static void main(String[] args) {

        //  Задача 1:  Создайте HashMap<String, Integer>, добавьте 5 пар (имя – возраст) и выведите все записи.
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Albina", 32);
        hashMap.put("Tomiris", 8);
        hashMap.put("Nargiz", 3);
        hashMap.put("Diyar", 33);
        hashMap.put("Mariya", 57);
        System.out.println(hashMap);


        //   Задача 2: Проверьте, есть ли определённое имя в HashMap.
        if (hashMap.containsKey("Gauhar")) {
            System.out.println("Мар содержит ключ = Mariya");
        } else System.out.println("Мар не содержит ключ = Mariya");

        //    Задача 3:   Реализуйте метод, который печатает из HashMap всех пользователей младше 18 лет.
        printUserUnder18(hashMap);

    }

    public static void printUserUnder18(HashMap<String, Integer> hashMap) {
        for (Map.Entry<String, Integer> item : hashMap.entrySet()) {
            if (item.getValue() < 18) {
                System.out.println(item.getKey() + ": " + item.getValue());
            }
        }


    }
}
