package practice_5.task_8;

public class Manuscript extends Exhibit{
    @Override
    public void manage() {
        System.out.println("Манускрипт: Необходимо контролировать влажность и температуру.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Манускрипт V века н.э.");

    }
}
