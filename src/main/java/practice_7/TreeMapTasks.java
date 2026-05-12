package practice_7;

import java.util.TreeMap;

public class TreeMapTasks {
    public static void main(String[] args) {
       // Задача 1: Создайте TreeMap и добавьте 5 ключей (имена) и значений (баллы). Выведите отсортированные данные.
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Альбина", 95);
        treeMap.put("Дияр", 79);
        treeMap.put("Адема", 74);
        treeMap.put("Амир",86);
        treeMap.put("Нурлан", 78);
        System.out.println(treeMap);

       // Задача 2:  Найдите минимальный и максимальный ключ в TreeMap.
        System.out.println("Максимальный ключ: " + treeMap.lastKey());
        System.out.println("Минимальный ключ: " + treeMap.firstKey());


        //Задача 3:  Реализуйте TreeMap, который хранит сотрудников и их ID, с возможностью поиска ближайшего большего ID.
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1,"Альбина");
        map.put(2,"Томирис");
        map.put(3,"Наргиз");
        map.put(4,"Диана");
        map.put(5,"Асель");
        int key = 5;
        System.out.println("Ближайший больший ID чем " + key + ": " + map.higherKey(key));



    }
}
