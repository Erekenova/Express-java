package practice_9.striamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Задача: Напишите программу, которая принимает список чисел и находит в нём самое большое число, используя Stream API.
public class MaxElement {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2,5,7,12,56,44,1,22,56);
        int max = integerList.stream()
                .mapToInt(n -> n)
                .max()
                 .getAsInt();

        System.out.println(max);

    }
}
