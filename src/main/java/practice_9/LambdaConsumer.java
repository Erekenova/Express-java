package practice_9;

import java.util.function.Consumer;

//Задача: Напишите лямбду, которая принимает строку и печатает её в консоль.
public class LambdaConsumer {
    public static void main(String[] args) {
        Consumer<String> printer = message -> System.out.println("Сообщение: " + message);
        printer.accept("Hello, world!");
    }
}
