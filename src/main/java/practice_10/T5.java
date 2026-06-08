package practice_10;

public class T5 {
    static final Object lock = new Object();
    static boolean ready = false;

    public static void main(String[] args) {
        Thread waiter = new Thread(() -> {
            synchronized (lock) {
                if(!ready) {
                    try {
                        lock.wait();
                    } catch (InterruptedException ignored) {
                    }
                }
                System.out.println("go");
            }});
        Thread notifier = new Thread(() -> {
            synchronized (lock){
                ready = true;
                lock.notify();
        }

                    });
        waiter.start();
        notifier.start();
        try {
            waiter.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            notifier.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
