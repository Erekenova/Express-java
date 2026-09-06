package prepereToMock.WhatBeOnCode;

public class Parent {
    int value = 10;
    int getValue(){
        return value;
    }
}
class Child extends Parent{
    int value = 20;
    @Override
    int getValue(){
        return value;
    }
}
