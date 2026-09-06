package prepereToMock.WhatBeOnCode.StringTask;

import java.util.Arrays;
import java.util.List;

public class Main {
    static void main() {
     /*   String a = "a";//Строковый литерал "a" помещается в String Pool
        String b = a + "b"; //Здесь a — это переменная, поэтому Java выполняет конкатенацию во время выполнения.Получается новый объект со значением "ab"
        String c = "a" + "b";//Оба значения — строковые литералы, известные компилятору заранее.Поэтому c указывает на "ab" из String Pool.
        System.out.println(b == "ab");
        System.out.println(c == "ab");*/
        String a = "hello";
        String b = new String("hello");
        System.out.println(a == b);
        List<String> list = Arrays.asList("A", "BB", "CCC");
        long count = list.stream()
                .filter(s -> s.length() > 1)
                .count();
        System.out.println(count);
    }

}
