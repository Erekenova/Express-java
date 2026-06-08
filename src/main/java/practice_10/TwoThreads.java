package practice_10;

//Условие задачи: Создайте два потока. Один поток должен печатать "A", второй — "B", каждый по 5 раз с небольшой задержкой.
public class TwoThreads {
    public static void main(String[] args) {
        Runnable printA = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("A");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Поток был прерван!");
                }
            }
        };


        Runnable printB = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("B");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Поток был прерван!");
                }
            }
        };
        Thread thread1 = new Thread(printA);
        Thread thread2 = new Thread(printB);
        thread1.start();
        thread2.start();
    }
}