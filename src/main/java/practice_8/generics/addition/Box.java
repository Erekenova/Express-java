package practice_8.generics.addition;
//Обобщённый интерфейс
//Задача: Создайте интерфейс Container<T>, содержащий методы add(T item) и get().
public class Box<T> implements Container<T> {
    private  T item;
    @Override
    public void add(T item) {
        this.item = item;

    }

    @Override
    public T get() {
        return item;
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.add(1);
        System.out.println(integerBox.get());

    }
}
