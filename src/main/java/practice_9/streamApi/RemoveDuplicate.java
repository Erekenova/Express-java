package practice_9.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Задача: Напишите программу, которая принимает список элементов и удаляет из него все дубликаты, используя Stream API.
public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,1,2,3,5,5,6,7,7);
        List<Integer> filtered = integerList.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(filtered);
    }
}
