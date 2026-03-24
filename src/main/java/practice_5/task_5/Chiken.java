package practice_5.task_5;

public class Chiken extends FarmAnimal {
    @Override
    public void care() {
        System.out.println("Курица требует корм с зерном.");
    }

    @Override
    public void function() {
        System.out.println("Курица несет яйца.");

    }
}
