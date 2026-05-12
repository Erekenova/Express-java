package practice_7;

import java.util.PriorityQueue;

public class PriorityQueueTask {
    //Создайте PriorityQueue и добавьте 5 чисел. Выведите их в порядке удаления
    public static void main(String[] args) {
    /*    1.	PriorityQueue Задача 1:
•	Используй PriorityQueue<Integer>
•	Добавляй числа через add() или offer()
•	Элементы автоматически сортируются по возрастанию при извлечении
•	Используй poll() в цикле while (!queue.isEmpty()) для поочерёдного извлечения и вывода*/
        PriorityQueue<Integer> arr = new PriorityQueue<>();
        arr.add(5);
        arr.add(2);
        arr.add(7);
        arr.add(10);
        arr.add(8);
        while (!arr.isEmpty()){
            System.out.println(arr.poll() + " ");
        }


    }
}
