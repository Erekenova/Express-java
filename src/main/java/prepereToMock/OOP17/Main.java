package prepereToMock.OOP17;

public class Main {
    static void main() {
        Order order = new Order(1001);
        order.shopped();
        order.delivered();
        order.paidOrder();
        order.shopped();
        order.delivered();
    }

    /*
Оплата:
Order 1001 оплачен
Отправка:
Order 1001 отправлен
Доставка:
Order 1001 доставлен

Если попытаться отправить неоплаченный заказ:
Ошибка: заказ должен быть оплачен*/

}
