package practice_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;


public class ArrayListTask {

    public static void main(String[] args) {
        //1. Создайте ArrayList из 5 чисел. Добавьте еще одно число в конец. Выведете весь список.
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        arr1.add(6);
        System.out.println(arr1.toString());
        //2. Вывод всех четных чисел
        printListEvenOnly(arr1);
        //3. Создать ArrayList из строк. Найдите в нем самую длинную строку и выведите ее.
        ArrayList<String> strings = new ArrayList<>(Arrays.asList("asdfasd", "asdasdsdasdasd", "asdasd"));
        printLongStr(strings);
        //4. Создайте ArrayList из целых чисел. Напишите программу, которая находит и выводит сумму всех чисел в списке.
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(4, 3, 5, 6, 8, 3, 2, 5, 6, 7, 8));
        printSumOfListNumbers(numbers);
        //5. Создайте ArrayList из целых чисел. Напишите программу, которая находит и выводит максимальное число из списка.
        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(8, 0, 4, 75, 869, 1100, 14, 5, 100));
        Integer max = Collections.max(numbers2);
        System.out.println("Максимальное число: " + max);
    }

    //2.Вывод всех четных чисел
    public static void printListEvenOnly(ArrayList<Integer> arrayList) {
        Iterator iteratorForList = arrayList.iterator();
        while (iteratorForList.hasNext()) {
            Integer currElement = (Integer) iteratorForList.next();
            if (!(currElement % 2 == 0)) {
                iteratorForList.remove();
            }
        }
        System.out.println(arrayList);


    }

    //3. Создать ArrayList из строк. Найдите в нем самую длинную строку и выведите ее.
    public static void printLongStr(ArrayList<String> strings) {
        int maxL = 0;
        String findStr = "";
        for (String item : strings) {
            if (item.length() > maxL) {
                maxL = item.length();
                findStr = item;
            }
        }
        System.out.println(findStr);
    }

    //4. Создайте ArrayList из целых чисел. Напишите программу, которая находит и выводит сумму всех чисел в списке.
    public static void printSumOfListNumbers(ArrayList<Integer> numbers) {
        int sum = 0;
        for (Integer item : numbers) {
            sum += item;
        }
        System.out.println("Сумма всех чисел в списке равна: " + sum);
    }

}
