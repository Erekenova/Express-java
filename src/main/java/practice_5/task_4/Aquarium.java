package practice_5.task_4;

public class Aquarium {
    private SeaAnimal seaAnimal;


    public void add(SeaAnimal seaAnimal){
        this.seaAnimal = seaAnimal;
        System.out.println("Морское существо добавлено в аквариум.");
    }

    public void showBehavior(){
        seaAnimal.move();
        seaAnimal.describeBehavior();
    }
}
