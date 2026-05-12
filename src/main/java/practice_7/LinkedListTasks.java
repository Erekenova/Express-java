package practice_7;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTasks {
    public static void main(String[] args) {
        //1.
        LinkedList<String> arr = new LinkedList<>();
        arr.add("Я пришел к тебе");
        arr.add("с приветом");
        arr.add("Рассказать, что солнце встало");
        Collections.addAll(arr, "Что оно горячим светом", "По листам затрепетало");
        System.out.println(arr);


        // 2. Реализуйте очередь задач с LinkedList. Добавьте 3 задачи и обработайте их в порядке поступления

        LinkedList<String> queue = new LinkedList<>();
        queue.add("Task 1");
        queue.add("Task 2");
        queue.add("Task 3");
        System.out.println(queue);
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        System.out.println(queue);

        //3.Создайте LinkedList, содержащий несколько строк. Напишите программу, которая печатает первый и последний элементы списка.

        LinkedList<String> list = new LinkedList<>();
        Collections.addAll(list, "Луна", "Солнце", "Земля", "Марс");
        if (!list.isEmpty()) {
            System.out.println(list.getFirst());
            System.out.println(list.getLast());
        }
        // Задача 4: Создайте LinkedList из целых чисел. Напишите программу, которая вычисляет сумму элементов списка.
        LinkedList<Integer> numbers = new LinkedList<>();
        Collections.addAll(numbers, 1, 2, 8, 6, 9, 7, 4, 10);
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }

        System.out.println("Сумма элементов:" + sum);


        //Задача 5: Используйте ListIterator для прохода по LinkedList в обоих направлениях.
        ListIterator<Integer>  it = numbers.listIterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println("");
        while (it.hasPrevious()){
            System.out.print(it.previous() + " ");
        }

    }


}
