package prepereToMock.WhatBeOnCode.TryCatch1;

public class Main {
    static int calculate(){
        int value = 10;
        try{
            return  value;// запоминает значение, которое нужно вернуть 10.
        }
        finally {
            value = 20;
            System.out.println(value);
        }
    }

    static void main() {
        System.out.println(calculate());
    }
}
