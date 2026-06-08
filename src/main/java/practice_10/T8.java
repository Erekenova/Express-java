package practice_10;

public class T8 {
    public static void main(String[] args) throws Exception{
        Thread t = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
            }
            System.out.println("stopped");
            });
        t.start();
        Thread.sleep(500);
        t.interrupt();
        //t.join();
        System.out.println("main");

    }
}
