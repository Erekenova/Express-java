package practice_5.task_3;

public class MainCourse extends Dish {
    private int temperature;
    public int getTemperature() {
        return temperature;
    }


    public MainCourse(int temperature){
        this.temperature = temperature;
    }

    @Override
    public void showDiscription() {
        System.out.println("Температура горячего блюда " + this.temperature);

    }
}
