package prepereToMock.WhatBeOnCode.ParentChild;

public class Animal {
    static String name = "animal";
    String breed = "animal";
    static void makeSound(){
        System.out.println("Animal sound");
    }
}
class Dog extends Animal{
    static String name ="dog";
    String breed = "dog";
    static void makeSound(){
        System.out.println("Bark");
    }
}

