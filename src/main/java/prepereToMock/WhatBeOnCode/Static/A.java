package prepereToMock.WhatBeOnCode.Static;

public class A {
    static {
        System.out.println("Static block A");
    }
    {
        System.out.println("Instance block A");
    }
    A(){
        System.out.println(" Конструктор A");
    }
}
