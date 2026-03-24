package practice_5.task_6;

public class BotanicalGarden {
    private Plant plant;
    public void add(Plant plant){
        this.plant = plant;
        System.out.println("Растение добавлено в сад.");
    }
    public void care(){
        plant.describeCare();
    }
}
