package practice_5.task_8;

public class Sculpture extends Exhibit{
    @Override
    public void manage() {
        System.out.println("Скульптура: Необходима регулярная реставрация.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Скульптура Петра I");

    }
}
