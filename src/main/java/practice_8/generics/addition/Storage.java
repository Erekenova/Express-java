package practice_8.generics.addition;
//1. Обобщённый класс
//Задача: Создайте класс Storage<T>, который хранит элемент и возвращает его.
public class Storage<T> {
    private T item;
    public void setItem(T item){
        this.item = item;
    }
    public T get(){
        return item;
    }

    public static void main(String[] args) {
        Storage<Integer> integerStorage = new Storage<>();
        Storage<String> stringStorage = new Storage<>();
        integerStorage.setItem(100);
        stringStorage.setItem("Hello");
        System.out.println(stringStorage.get() + " " + integerStorage.get());
    }
}
