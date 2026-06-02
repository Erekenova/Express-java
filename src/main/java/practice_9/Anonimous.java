package practice_9;

//2. Использование анонимного класса
//Задача: Создайте анонимный класс, реализующий интерфейс Runnable, который выводит сообщение "Hello from anonymous class!".
public class Anonimous {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Привет, мир!");
            }

        };
        r1.run();
    }

}
