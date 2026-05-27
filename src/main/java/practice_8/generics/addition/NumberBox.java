package practice_8.generics.addition;
//Работа с числами
//Задача: Создайте класс NumberBox<T extends Number>, который хранит только числа и возвращает их сумму.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberBox<T extends Number> {
    private List<T> numbers;

    public void setNumbers(List<T> numbers) {
        this.numbers = numbers;
    }

    public double getSum() {
        double sum = 0;
        for (T element : numbers) {
            sum += element.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        NumberBox<Integer> integerNumberBox = new NumberBox<>();
        integerNumberBox.setNumbers(new ArrayList<>(Arrays.asList(4, 3, 5, 6, 8, 3, 2, 5, 6, 7, 8)));
        System.out.println(integerNumberBox.getSum());

        NumberBox<Double> doubleNumberBox = new NumberBox<>();
        doubleNumberBox.setNumbers(new ArrayList<>(Arrays.asList(2.0,3.1,5.7,8.6)));
        System.out.println(doubleNumberBox.getSum());


    }

}
