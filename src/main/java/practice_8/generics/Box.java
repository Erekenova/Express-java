package practice_8.generics;
//1. Задача на дженерик класс
//Условие задачи: Разработайте дженерик класс Box, который может хранить объекты любого типа.
// Класс должен иметь методы для установки и получения значения объекта, хранящегося внутри.
public class Box<T> {
    private T item;
    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setItem("str");
        System.out.println(stringBox.getItem());
        Box<Integer> integerBox = new Box<>();
        integerBox.setItem(15);
        System.out.println(integerBox.getItem());

    }
}
