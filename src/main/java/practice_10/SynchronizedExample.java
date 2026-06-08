package practice_10;
//Условие задачи: Напишите класс Counter с методом increment, увеличивающим значение счётчика.
//Создайте два потока, каждый из которых вызывает increment() 1000 раз. Обеспечьте правильную работу с помощью synchronized.


public class SynchronizedExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable task = ()-> {
            for (int i = 0; i < 1000; i++){
                counter.increment();
            }
        };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter.getCount());
    }

}
