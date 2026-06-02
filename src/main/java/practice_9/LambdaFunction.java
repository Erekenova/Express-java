package practice_9;

import java.util.function.Function;

//Задача: Создайте лямбду, которая принимает строку и возвращает её длину.
public class LambdaFunction {
    public static void main(String[] args) {
        Function<String, Integer> getLenght = str -> str.length();
        System.out.println(getLenght.apply("abc"));
        }
    }

