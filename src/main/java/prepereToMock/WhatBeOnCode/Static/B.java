package prepereToMock.WhatBeOnCode.Static;

public class B extends A{
    static {
        System.out.println("Static block B");
    }
    {
        System.out.println("Instance block B");
    }
    B(){
        System.out.println(" Конструктор B");
    }
}
