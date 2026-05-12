package practice_7;

import java.util.*;

public class HashSetTasks {
    public static void main(String[] args) {


        //Задача 1:    Создайте HashSet из 5 чисел и выведите его содержимое.
        Set<Integer> set = new HashSet<>();
        set.add(8);
        set.add(9);
        set.add(7);
        set.add(2);
        set.add(8);
        System.out.println(set);
        // Задача 2:    Добавьте в HashSet 10 чисел. Проверьте, содержит ли он заданное число.
        Set<Integer> set1 = new HashSet<>();
        Collections.addAll(set1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(set1.contains(5));
        System.out.println(set1.contains(100));


        //Задача 3:    Реализуйте метод, который принимает List<String> и возвращает Set<String> без дубликатов.

        List<String> stringList = Arrays.asList("Солнце", "Море", "Пляж", "Пляж");
        Set<String> uniqueUtems = convertingListToSet(stringList);
        System.out.println(uniqueUtems);

        // Задача 4:    Создайте HashSet, содержащий набор имен. Напишите программу, которая проверяет, содержится ли ваше имя в множестве, и выводит соответствующее сообщение.
        HashSet<String> names = new HashSet<>();
        names.add("Альбина");
        names.add("Наргиз");
        names.add("Томирис");
        names.add("Дияр");
        String chekingName = "Дияр";
        if (names.contains(chekingName)){
            System.out.println("Имя " + chekingName +" содержится в множестве" + names);
        }
        else System.out.println("Имя " + chekingName +" не содержится в множестве" + names);


    }
    //Задача 3:    Реализуйте метод, который принимает List<String> и возвращает Set<String> без дубликатов.
    public static Set<String> convertingListToSet(List<String> list) {
        return new HashSet<>(list);
    }

}
