package practice_8.generics.addition;

import java.util.HashMap;
import java.util.Map;

// 2. бобщённый метод
//Задача: Реализуйте метод printList(List<T>), который принимает список любого типа и выводит его элементы.
public class Main {
  /*  public static <T> void printList(List<T> list){
        for (T element : list){
            System.out.println(element);
        }
    }*/
    //Ограничение снизу
    //Задача: Реализуйте метод, который принимает List<T super Integer> и добавляет в него несколько чисел.
/*
    public static void addNumbers (List <? super Integer> list){
        list.add(10);
        list.add(20);
        list.add(30);
        }
*/
    //Коллекция с обобщёнными типами
    //Задача: Создайте Map<K, V> и реализуйте метод, который принимает обобщённые ключи и значения, а затем выводит их.

    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }


    public static void main(String[] args) {
        //2.Обобщённый метод
        //Задача: Реализуйте метод printList(List<T>), который принимает список любого типа и выводит его элементы.
/*        List<Integer> integerList = new ArrayList<>();
        List<String> stringList = new LinkedList<>();
        integerList.add(1);
        integerList.add(5);
        integerList.add(9);
        stringList.add("aaaa");
        stringList.add("bbb");
        stringList.add("ccc");
        printList(integerList);
        printList(stringList);*/

        //Ограничение снизу
        //Задача: Реализуйте метод, который принимает List<T super Integer> и добавляет в него несколько чисел.
  /*      List<Number> numbers = new ArrayList<>();
        addNumbers(numbers);
        System.out.println(numbers);*/

        //Коллекция с обобщёнными типами
        //Задача: Создайте Map<K, V> и реализуйте метод, который принимает обобщённые ключи и значения, а затем выводит их.
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        printMap(map);
    }

}
