package practice_5.task_3;

public class HotDish extends Dish {
    private int temperature;
    public int getTemperature() {
        return temperature;
    }


    public HotDish(int temperature){
        this.temperature = temperature;
    }

    @Override
    public void showDescription() {
        System.out.println("Температура горячего блюда " + this.temperature);

    }
}
