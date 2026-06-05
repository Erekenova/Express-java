package practice_9.streamApi;

import java.util.Arrays;
import java.util.List;

//Задача: Напишите программу, которая принимает список чисел и вычисляет их сумму, используя Stream API.
public class SumElement {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,1,1,1,1,1,1,1);
        int sum = integerList.stream()
                .mapToInt(n -> n)
                .sum();
        System.out.println(sum);
    }
}
