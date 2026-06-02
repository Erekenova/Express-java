package practice_9.striamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Задача: Напишите программу, которая принимает список строк и находит первую строку,
// начинающуюся на букву "Б", используя Stream API.
public class StartWithB {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Альбина", "Батыр", "Дияр", "Борис");
        Optional<String> result = stringList.stream()
                .filter(s -> s.startsWith("Б"))
                .findFirst();
        System.out.println(result.orElse(null));
    }
}
