package prepereToMock.WhatBeOnCode.Static;

public class C extends B{
    static {
        System.out.println("Static block C");
    }
    {
        System.out.println("Instance block C");
    }
    C(){
        System.out.println(" Конструктор C");
    }
}
