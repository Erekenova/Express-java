package practice_9.striamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Задача: Напишите программу, которая принимает список строк и заменяет каждую строку на её длину, используя Stream API.
public class StringToLenght {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("aaaa", "bbbbbbb", "ccc");
        List<Integer> filtered = stringList.stream()
                .map(str -> str.length())
                .collect(Collectors.toList());
        System.out.println(filtered);
    }
}
