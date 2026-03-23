package practice_5.task_1;

public class Main {
    public static void main(String[] args) {
        Animal owl = new Bird();
        Zoo zoo = new Zoo();
        zoo.add(owl);// добавили птицу в зоопарк
        zoo.showBehavior();
        Animal elephant = new Elephant();
        zoo.add(elephant);
        zoo.showBehavior();

    }
}
