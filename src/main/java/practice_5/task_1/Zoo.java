package practice_5.task_1;

public class Zoo {
private Animal animalInZoo; //животное, которое добавлено в зоопарк

public void add(Animal animal){
    this.animalInZoo = animal;
    System.out.println("Лог:Животное добавлено в зоопарк");
}
public void showBehavior(){
    System.out.println("Лог: Поведение животного в зоопарке:");
    animalInZoo.makeSound();
    animalInZoo.move();
}
}
