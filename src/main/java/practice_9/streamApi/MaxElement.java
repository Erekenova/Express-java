package practice_9.streamApi;

import java.util.Arrays;
import java.util.List;

//Задача: Напишите программу, которая принимает список чисел и находит в нём самое большое число, используя Stream API.
public class MaxElement {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2,5,7,12,56,44,1,22,56);
        int max = integerList.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElseThrow(() -> new RuntimeException( "Пустой список."));


        System.out.println(max);

    }
}
