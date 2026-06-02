package practice_9.striamApi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.System.*;

//Задача: Напишите программу, которая принимает список чисел и преобразует его в новый список,
// где каждое число заменено на его квадрат, используя Stream API.
public class ListOfSquares {
    public static void main(String[] args) {
        Random r = new Random();
        IntStream stream = r.ints(10,0,10);
        stream
                .peek(num -> out.println("Исходное число: " + num))
                .map(num -> num * num)
                .forEachOrdered(square -> out.println("Квадрат: " + square));
    }
}
