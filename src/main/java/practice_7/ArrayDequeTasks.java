package practice_7;

import java.util.ArrayDeque;
import java.util.Collections;

public class ArrayDequeTasks {
    public static void main(String[] args) {


        // Задача 1:   Создайте ArrayDeque, добавьте 5 элементов и выведите их.
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.addLast(8);
        deque.addLast(6);
        deque.addLast(7);
        deque.addLast(5);
        deque.addLast(3);
        System.out.println(deque);
        while (!deque.isEmpty()){
            System.out.println(deque.remove());
        }
        System.out.println(deque);

        // Задача 2:    Используйте ArrayDeque как стек: добавьте элементы и извлеките их в обратном порядке.
        deque.push(3);
        deque.push(8);
        deque.push(5);
        deque.push(7);
        deque.push(9);
        System.out.println(deque);
        while (!deque.isEmpty()){
            System.out.println(deque.pop());
        }

        // Задача 3:    Используйте ArrayDeque как очередь: добавьте элементы в начало и конец, извлеките из обоих концов.
        deque.add(5);
        deque.addFirst(8);
        deque.add(9);
        deque.offer(4);
        deque.addLast(3);
        deque.push(6);
        deque.addFirst(10);
        deque.add(8);
        deque.addLast(7);
        System.out.println(deque);
        System.out.println("Первый элемент: " + deque.getFirst());
        System.out.println("Последний элемент: " + deque.getLast());

    }
}
