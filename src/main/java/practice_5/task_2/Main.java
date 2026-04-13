package practice_5.task_2;
/*Условие:
В системе может быть один домашний питомец, у каждого вида свои особенности ухода.
Примеры:
Собака гуляет и ест сухой корм
Кошка играет и ест влажный корм
Нужно спроектировать систему, которая позволяет взаимодействовать с любым питомцем с учётом его особенностей.
Pet eat
Cat play, eat
Dog walk, eat
PetSystem add, interraction


*/

public class Main {
    public static void main(String[] args) {
        Dog bim = new Dog();
        PetSystem petSystem = new PetSystem();
        petSystem.add(bim);
        petSystem.handlePet();

        Cat murka = new Cat();
        petSystem.add(murka);
        petSystem.handlePet();

    }

}
