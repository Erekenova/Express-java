package practice_9.streamApi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.System.*;
import static java.util.stream.Collectors.*;

//Задача: Напишите программу, которая принимает список чисел и преобразует его в новый список,
// где каждое число заменено на его квадрат, используя Stream API.
public class ListOfSquares {
    public static void main(String[] args) {
        Random r = new Random();
        IntStream stream = r.ints(10,0,10);
       List <Integer> squares  = stream
                .peek(num -> out.println("Исходное число: " + num))
                .map(num -> num * num)
               .boxed()
               .collect(toList());
        out.println(squares);

    }
}
