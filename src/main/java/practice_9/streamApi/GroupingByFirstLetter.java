package practice_9.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Группировка строк по первой букве
//stream()
//collect(...)
//Collectors.groupingBy(...)
//s -> s.charAt(0) или s -> s.substring(0, 1)
//Задача: Напишите программу, которая принимает список строк и группирует их по первой букве, используя Stream API.
public class GroupingByFirstLetter {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("aaaa","bbb","ccc", "cout", "apple", "count","b");
        Map<String, List<String>> grouping = stringList.stream()
                .collect(Collectors.groupingBy(s -> s.substring(0,1)));
        System.out.println(grouping);
    }
}
