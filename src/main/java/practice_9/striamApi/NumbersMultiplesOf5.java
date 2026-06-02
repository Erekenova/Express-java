package practice_9.striamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Задача: Напишите программу, которая принимает список чисел и отбирает только те, которые делятся на 5 без остатка, используя Stream API.
public class NumbersMultiplesOf5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,6,5,9,10,25,67,60);
        List<Integer> filtered = numbers.stream()
                .filter(num -> num % 5 == 0)
                .collect(Collectors.toList());
        System.out.println(filtered);

    }
}
