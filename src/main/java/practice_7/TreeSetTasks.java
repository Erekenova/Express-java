package practice_7;

import java.util.TreeSet;

public class TreeSetTasks {
    public static void main(String[] args) {

        //Задача 1:        Создайте TreeSet из 5 чисел и выведите его. Обратите внимание на порядок.
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(20);
        treeSet.add(10);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);
        System.out.println(treeSet);

      //  Задача 2:        Напишите метод, который добавляет числа в TreeSet, но не позволяет добавить дубликаты.
        // коллекция по умолчанию не позволяет добавлять дубликаты

        treeSet.add(30);
        System.out.println(treeSet);

       // Задача 3:        Найдите ближайшее большее и меньшее число к заданному в TreeSet.
 /*       •	Используй TreeSet<Integer>
•	Метод higher(value) возвращает наименьший элемент, строго больше заданного
•	Метод lower(value) возвращает наибольший элемент, строго меньше заданного
•	Выведи оба значения, если они не равны null
•	Пример: если в наборе {10, 20, 30, 40} и задано 25, то higher = 30, lower = 20*/

        int value = 25;

        System.out.println(treeSet.higher(value));
        System.out.println(treeSet.lower(value));



    }

}
