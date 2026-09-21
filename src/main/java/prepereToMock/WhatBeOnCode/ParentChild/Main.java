package prepereToMock.WhatBeOnCode.ParentChild;

public class Main{
    static void main() {
        Animal animal = new Dog();

        animal.makeSound();
        //не статичные методы относятся к экземпляру
        //статичные методы относятся к классу
        System.out.println(animal.breed);
        //поля статические и нет относятся к типу переменной

    }
}
