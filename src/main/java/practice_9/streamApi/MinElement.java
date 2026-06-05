package practice_9.streamApi;

import java.util.stream.IntStream;

//Нужно найти наименьшее значение в списке чисел. После создания потока применяем метод min, который возвращает Optional.
// Если список не пуст, можно получить значение через get() или orElse(...).
public class MinElement {
    public static void main(String[] args) {
        System.out.println(
                IntStream.of(1,2,3,4,5,6,7,8,9)
                        .min()
                        .orElseThrow(() -> new RuntimeException( "Пустой список.")));
    }
}
