package practice_10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*Напишите программу, которая использует ExecutorService для создания пула потоков, в котором несколько потоков обрабатывают задачи.
Каждая задача — это выполнение простого теста с задержкой. Программа должна создать пул из 4 потоков,
каждая задача должна быть выполнена с задержкой в 2 секунды.
После выполнения всех задач, результат должен быть выведен в главном потоке.*/
public class ExecuterServiceExample {
    public static void main(String[] args) throws Exception{
        ExecutorService pool = Executors.newFixedThreadPool(4);
        Runnable task = () -> System.out.println(Thread.currentThread().getName() + " Выполняет задачу");
        for (int i = 0; i < 10; i++) {
            pool.submit(task);
            Thread.sleep(2000);

        }
        pool.shutdown();
    }

}
