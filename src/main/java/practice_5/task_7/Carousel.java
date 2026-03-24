package practice_5.task_7;

public class Carousel extends Attraction{
    @Override
    public void service() {
        System.out.println("Карусель: Необходимо частое тех. обслуживание.");
    }

    @Override
    public void info() {
        System.out.println("Карусель с лошадками.");

    }
}
