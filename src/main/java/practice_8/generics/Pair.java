package practice_8.generics;
//3. Задача на дженерик с двумя типами данных
//   Условие задачи: Создайте класс Pair, который может хранить два объекта разных типов. Класс должен позволять получать и устанавливать каждый из этих объектов.

public class Pair<T,U> {
    private T first;
    private U second;

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    public static void main(String[] args) {
        Pair<String , Integer> pair = new Pair<>();
        pair.setFirst("string");
        pair.setSecond(123);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
