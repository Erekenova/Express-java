package practice_10;
//Условие задачи: Создайте поток, который бесконечно увеличивает счетчик.
//В основном потоке через 2 секунды установите флаг stop = true, чтобы остановить поток.
public class VolatileExample {
    public static volatile boolean stop = false;
    public static void main(String[] args) throws InterruptedException{
        Runnable task = () -> {
            long count = 0;
            while (!stop){
                count++;
            }
            System.out.println("Поток прерван! " + count);
        };
        Thread thread = new Thread(task);
        thread.start();
        Thread.sleep(1000);
        stop = true;
        thread.join();
        System.out.println("Поток завершен!");

    }
}
