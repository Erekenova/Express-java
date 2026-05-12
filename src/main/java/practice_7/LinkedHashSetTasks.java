package practice_7;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTasks {
    public static void main(String[] args) {
        //Задача 1:    Создайте LinkedHashSet и добавьте в него 5 строк. Проверьте порядок элементов при выводе.
        Set<String> linkedSet = new LinkedHashSet<>();
        linkedSet.add("Яблоко");
        linkedSet.add("Груша");
        linkedSet.add("Банан");
        linkedSet.add("Апельсин");
        linkedSet.add("Яблоко");
        linkedSet.add("Мандарин");
        System.out.println(linkedSet);

        //  Задача 2:    Напишите метод, который добавляет элемент в LinkedHashSet, но не добавляет дубликаты.
/*•	Создай метод с сигнатурой void addUnique(LinkedHashSet<String> set, String element)
•	Используй contains() для проверки: если элемента ещё нет — добавь, иначе ничего не делай
•	LinkedHashSet сам по себе не допускает дубликатов*/
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        addUnique(linkedHashSet, "Яблоко");
        addUnique(linkedHashSet, "Апельсин");
        addUnique(linkedHashSet, "Мандарин");
        addUnique(linkedHashSet, "Яблоко");
        System.out.println(linkedHashSet);
    }

    public static void addUnique(LinkedHashSet<String> set, String element) {
        if (!set.contains(element)) {
            set.add(element);
        }
    }


}
