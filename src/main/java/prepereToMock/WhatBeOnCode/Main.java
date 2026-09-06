package prepereToMock.WhatBeOnCode;

public class Main{
    static void main() {
        Parent object = new Child();// тип ссылки  Parent а фактический объект Child
        //поля не переопределяются Java смотрит на тип ссылки Parent.value = 10
        //методы в отличие от полей работают полиморфно, value отностится к классу child
        System.out.println(object.value);//10
        System.out.println(object.getValue());//20
    }
}
