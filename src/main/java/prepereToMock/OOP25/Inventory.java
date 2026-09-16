package prepereToMock.OOP25;

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
    Map<String,Integer> inventory = new HashMap<>();
    //обавить предмет в инвентарь
    public void addItem(String item, Integer quantity){
        if(inventory.containsKey(item)){
            inventory.put(item,inventory.get(item) + 1);
        }
        else inventory.put(item,quantity);
    }
   // использовать предмет
    public void useItem(String item){
        if(inventory.containsKey(item)){
           int val =  inventory.get(item);
           if (val > 1){
            inventory.put(item, inventory.get(item) - 1);}
           else inventory.remove(item);
        }
        else System.out.println("Такого предмета нет");

    }
   // узнать количество предмета
    public int itemQuantity(String item){
       return inventory.get(item);
    }
   // проверить, есть ли предмет в инвентаре
    public  boolean hasItem(String item){
        return inventory.containsKey(item);
    }
   // показать количество разных предметов
    public int sizeInventory(){

        return inventory.size();
    }

}
