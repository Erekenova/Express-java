package practice_9;

import java.util.function.Predicate;

//3. Лямбда-выражение с Predicate
//
//Задача: Напишите лямбду, которая проверяет, является ли число чётным.
//3. Лямбда-выражение с Predicate:
//Используйте интерфейс Predicate<Integer>
//Лямбда будет выглядеть так: x -> x % 2 == 0
//Вызовите test(число) и проверьте результат (true или false)
public class LambdaPredicate {
    public static void main(String[] args) {
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(1));
        System.out.println(isEven.test(6));
        System.out.println(isEven.test(10));
        System.out.println(isEven.test(11));
    }
}
