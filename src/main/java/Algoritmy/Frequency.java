package Algoritmy;

import java.util.*;

public class Frequency {
    public static Map<String, Integer>  findFreq(List<String> str ){
        Map<String, Integer> map = new HashMap<>();
        for ( String i : str){
             map.put(i,map.getOrDefault(i,0) + 1);
        }
        return map;
    }

    static void main() {
        List<String> str = new ArrayList<>(Arrays.asList("Россия", "Англия", "Франция","Россия")) ;
        List<String> list = new ArrayList<>(List.of("один", "два", "три"));
        System.out.println(findFreq(str));
        System.out.println(findFreq(list));
    }
}
