package practice_5.task_4;

public class Star extends SeaAnimal{

    @Override
    public void move() {
        System.out.println("Звезда ползает.");
    }

    @Override
    public void describeBehavior() {
        System.out.println("Звезда медленная");

    }
}
