package practice_5.task_3;

public class Drink extends Dish{
    private int volume;

    public Drink(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public void showDiscription() {
        System.out.println("Объем напитка " + this.volume);
    }
}
