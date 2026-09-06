package prepereToMock.OOP10;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderNumber;
    private final List<Product> products = new ArrayList<>();

    public Order(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotalPrice() {
        double totalPrice = 0.0;
        for (Product product : products) {
            totalPrice += product.getTotalPrice();
        }
        return totalPrice;
    }

    public void printTotalPrice() {
        System.out.println("Стоимость заказа: " + (int) calculateTotalPrice());
    }

    static void main() {
        Order order = new Order(1);

        order.addProduct(new Product("Ноутбук", 1000, 1));
        order.addProduct(new Product("Мышь", 50, 2));
        order.addProduct(new Product("Клавиатура", 120, 1));

        order.printTotalPrice(); // Стоимость заказа: 1220
    }
}
