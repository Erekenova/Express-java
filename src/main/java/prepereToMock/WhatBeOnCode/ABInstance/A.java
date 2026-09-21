package prepereToMock.WhatBeOnCode.ABInstance;

public class A {
    int x;
    A(int x){this.x = x;}

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof A){
            return ((A) obj).x == this.x;}
        return false;
    }
}
class B extends A{
    B (int  x){super(x);}
}
