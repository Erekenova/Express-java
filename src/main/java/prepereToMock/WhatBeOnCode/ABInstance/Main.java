package prepereToMock.WhatBeOnCode.ABInstance;

public class Main {
    static void main() {
        A a = new A(5);
        B b = new B(5);
        System.out.println(a.equals(b));
        System.out.println(b.equals(a));
    }
}
