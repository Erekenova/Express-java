package prepereToMock.OOP255;

import java.util.HashMap;
import java.util.Map;

/*"В системе есть инвентарь.
Инвентарь хранит предметы игрока.
У каждого предмета есть:
название
количество
Нужно реализовать систему, которая может:
добавить предмет в инвентарь
использовать предмет
узнать количество предмета
проверить, есть ли предмет в инвентаре
показать количество разных предметов
Правила:
если предмет уже есть, при добавлении количество увеличивается
использовать можно только существующий предмет
при использовании количество уменьшается на 1
если количество стало 0, предмет удаляется из инвентаря
название предмета уникально

Пример:
Добавляем предметы:
Potion → 3
Arrow → 10
Potion → 2

Количество:
Potion → 5
Arrow → 10
Используем:
Potion
Количество:

Potion → 4"*/
public class Inventory {
    Map<String, Integer> items = new HashMap<>();

    public Inventory(Map<String, Integer> items) {
        this.items = items;
    }

    //
    public void addItem(String item, Integer quantity) {
        if (items.containsKey(item)) {
            items.put(item, items.get(item) + quantity);
        } else items.put(item,quantity);
    }
    public  void useItem(String item){
        if(items.containsKey(item)){
            Integer var = items.get(item);
            if (var > 1){
                items.put(item,items.get(item) - 1);
            } else items.remove(item);
        } else System.out.println("Такого предмета нет");
    }
   // узнать количество предмета
    public int countItem(String item){
        return items.getOrDefault(item,0);
    }
   // проверить, есть ли предмет в инвентаре
    public boolean isHas(String item){
        return (items.containsKey(item));
    }
    //показать количество разных предметов
    public int CountDif(){
        return items.size();
    }





}
