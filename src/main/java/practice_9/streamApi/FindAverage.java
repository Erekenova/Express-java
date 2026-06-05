package practice_9.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Чтобы найти среднее значение, преобразуем список в поток. Затем применяем метод collect с Collectors.averagingInt(...).
// Внутри указываем функцию, возвращающую значение элемента. Если список содержит Integer, то достаточно использовать n -> n.
//Методы:
//stream()
//collect(...)
//Collectors.averagingInt(n -> n)
public class FindAverage {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(5,5,5,5,5);
        Double average = integerList.stream()
                .collect(Collectors.averagingInt(n -> n));
        System.out.println(average);
    }
}
