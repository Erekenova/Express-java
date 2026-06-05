package practice_9.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Задача: Напишите программу, которая принимает список строк и удаляет из него все строки длиной 5 символов и менее, используя Stream API.
public class StrMoreThenFive {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("aaaaaa", "bbbb", "cccccc", "dd");
        List<String> filtered = strings.stream().filter(str -> str.length() > 5)
                .collect(Collectors.toList());
        System.out.println(filtered);

    }
}
