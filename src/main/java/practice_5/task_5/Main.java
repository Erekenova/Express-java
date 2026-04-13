package practice_5.task_5;
/*Условие:
На ферме содержится одно домашнее животное.
У каждого животного свои функции и нужды.
Примеры:
Корова даёт молоко, нуждается в выпасе
Курица несёт яйца, требует зерно
Нужно создать систему, которая позволяет управлять животным с учётом его потребностей.*/
public class Main {
    public static void main(String[] args) {
        FarmAnimal cow = new Cow();
        Farm farm = new Farm();
        farm.add(cow);
        farm.manageAnimal();

        FarmAnimal chiken = new Chicken();
        farm.add(chiken);
        farm.manageAnimal();
    }
}
