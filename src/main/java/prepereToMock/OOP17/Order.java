package prepereToMock.OOP17;
/*"В системе есть **заказ**.

У заказа есть:
* номер заказа
* текущее состояние

Заказ может находиться в одном из состояний:
* `CREATED`
* `PAID`
* `SHIPPED`
* `DELIVERED`
* `CANCELLED`
Нужно реализовать систему, которая управляет состоянием заказа.

Достпные действия:
* оплатить заказ
* отправить заказ
* доставить заказ
* отменить заказ

Правила переходов:
CREATED → PAID
PAID → SHIPPED
SHIPPED → DELIVERED
CREATED → CANCELLED
PAID → CANCELLED

Нельзя:

* отправить неоплаченный заказ
* доставить неотправленный заказ
* изменить состояние после `DELIVERED` или `CANCELLED`
# Пример работы

Создаем заказ:
Order 1001 создан

Оплата:
Order 1001 оплачен
Отправка:
Order 1001 отправлен
Доставка:
Order 1001 доставлен

Если попытаться отправить неоплаченный заказ:
Ошибка: заказ должен быть оплачен
"*/
public class Order {
    private int orderNumber;
    OrderStatus status;

    public Order(int orderNumber) {
        this.orderNumber = orderNumber;
        this.status = OrderStatus.CREATED;
        System.out.println("Order " + orderNumber + " создан");
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    //   оплатить заказ
    public void paidOrder(){
        if (this.status.equals(OrderStatus.CREATED)){
        setStatus(OrderStatus.PAID);
        System.out.println("Order " + orderNumber + " оплачен");
        }
    }
//отправить заказ
    public void shopped(){
        if (this.status.equals(OrderStatus.PAID)){
        setStatus(OrderStatus.SHIPPED);
        System.out.println("Order " + orderNumber + " отправлен");
        }
        else System.out.println("Ошибка: заказ должен быть оплачен");
    }
 //доставить заказ
    public void delivered(){
        if (this.status.equals(OrderStatus.SHIPPED)){
        setStatus(OrderStatus.DELIVERED);
        System.out.println("Order " + orderNumber + " доставлен");
        }
        else System.out.println("Заказ еще не отправлен");
    }
    // отменить заказ
    public void cancel(){
        if (this.status.equals(OrderStatus.DELIVERED)) {
            setStatus(OrderStatus.CANCELLED);
            System.out.println("Order" + orderNumber + "отменен");
        }
    }
}
