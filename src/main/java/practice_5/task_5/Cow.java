package practice_5.task_5;

public class Cow extends FarmAnimal{
    @Override
    public void care(){
        System.out.println("Корова нуждается в выпасе.");
    }
    @Override
    public void function(){
        System.out.println("Корова дает молоко.");
    }
}
