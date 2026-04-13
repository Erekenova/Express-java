package practice_5.task_3;
/*Условие:
В меню ресторана добавляется блюдо.
У каждого блюда свои параметры отображения:
Горячее блюдо — с температурой
Напиток — с объёмом
Нужно спроектировать систему, в которой можно добавлять блюда и выводить их описание с учётом характеристик.
Сущности:
меню -  добавить блюдо, вывести описание
блюдо - показать описание
горячее блюда - температура
напиток - объем

*/
public class Main {
    public static void main(String[] args) {
      HotDish soup = new HotDish(70);
      Drink tea = new Drink(200);
      Menu menu = new Menu();
      menu.add(soup);
      menu.printDescription();

      menu.add(tea);
      menu.printDescription();


    }

}
