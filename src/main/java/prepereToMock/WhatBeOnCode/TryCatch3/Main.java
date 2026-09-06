package prepereToMock.WhatBeOnCode.TryCatch3;

import static java.lang.Math.E;

public class Main {
    static void main() {
        for (int i = 0; i < 3; i++) {
            try {
                if (i == 1) throw new RuntimeException();
                System.out.print(i);
            } catch (Exception e) {
                System.out.print("E");
            }
        }
    }

}

