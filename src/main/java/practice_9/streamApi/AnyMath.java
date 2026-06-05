package practice_9.streamApi;

import java.util.Arrays;
import java.util.List;

//5. Проверка наличия хотя бы одного элемента по условию
//
//Задача: Напишите программу, которая проверяет, есть ли хотя бы один элемент в списке,
// который удовлетворяет заданному условию (например, является чётным числом), используя Stream API.
public class AnyMath {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2,3,4,5,6,7,8,9,10);
        boolean hasEven = integerList.stream()
                .anyMatch(n -> n % 2 == 0);
        System.out.println(hasEven);
    }
}
