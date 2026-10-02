package prepereToMock.OOP133;

import java.util.ArrayList;
import java.util.List;

/*"В системе есть заказ.
У заказа есть:
номер заказа
список товаров
У каждого товара есть:
название
цена
количество
Нужно реализовать систему, которая может:
добавить товар в заказ
посчитать общую стоимость заказа
Формула:
стоимость товара = цена × количество
стоимость заказа = сумма стоимостей всех товаров
Пример:
Товары в заказе:
Ноутбук — 1000 × 1
Мышь — 50 × 2
Клавиатура — 120 × 1

Метод должен вывести:
Стоимость заказа: 1220"*/
public class Order {
     private int id;
     List<OrderItem> orderList = new ArrayList<>();

    public Order(int id) {
        this.id = id;
    }
    private  void add(OrderItem order){
        orderList.add(order);
    }
   public double calculateOrder(){
        double result = 0;
        for (OrderItem order : orderList) {
            result += order.calculateSumOfOrderItem();
        }
        return result;
    }
}
