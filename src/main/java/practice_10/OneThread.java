package practice_10;
/*1. Задача: создание одного потока
Условие задачи: Напишите программу, в которой создается отдельный поток,
выводящий сообщение
"Привет из потока!" 5 раз с паузой в 1 секунду между сообщениями.*/
public class OneThread {
    public static void main(String[] args ) {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++){
                System.out.println("Привет из потока!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Поток был прерван!");;
                }
            }
        });
        thread.start();



    }
}