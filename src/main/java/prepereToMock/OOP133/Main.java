package prepereToMock.OOP133;

public class Main {
    static void main() {
        OrderItem orderItem1 = new OrderItem("Ноутбук", 100,2);
        OrderItem orderItem2 = new OrderItem("Клавиатура", 50,5);
        OrderItem orderItem3 = new OrderItem("Мышь", 10,4);
        Order order = new Order(1);
        order.orderList.add(orderItem1);
        order.orderList.add(orderItem2);
        order.orderList.add(orderItem3);
        System.out.println(order.calculateOrder());

    }
}
