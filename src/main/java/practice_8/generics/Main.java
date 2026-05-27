package practice_8.generics;

public class Main {
    public static <T> void printArray(T[] array){
        for (T item:array){
            System.out.println(item);
        }
    }
//2. Задача на дженерик метод
//    Условие задачи: Напишите дженерик метод printArray, который принимает массив элементов любого типа и выводит каждый элемент массива на консоль.

    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5};
        String[] strArray = {"a","aa","aaa"};
        printArray(intArray);
        printArray(strArray);
    }
}
