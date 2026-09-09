package prepereToMock.OOP23;

import prepereToMock.OOP12.CartItem;
import prepereToMock.OOP12.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<CartItem> items = new ArrayList<>();

    public void addProduct(Product product, int count) {
        if (count <= 0) {
            return;
        }
        CartItem existing = findByName(product.getName());
        if (existing != null) {
            existing.setCount(existing.getCount() + count);
            return;
        }
        items.add(new CartItem(product, count));
    }

    public void removeProduct(String productName) {
        items.removeIf(item -> item.getProduct().getName().equals(productName));
    }

    public void changeCount(String name, int newCount) {
        if (newCount <= 0) {
            removeProduct(name);
            return;
        }
        CartItem item = findByName(name);
        if (item != null) {
            item.setCount(newCount);
        }
    }

    public double getTotal() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getTotal();
        }
        return total;
    }

    public void showCart() {
        System.out.println("В корзине:");
        System.out.println();
        for (CartItem item : items) {
            Product product = item.getProduct();
            System.out.println(product.getName() + " — " + (int) product.getPrice()
                    + " × " + item.getCount());
        }
        System.out.println();
        System.out.println("Общая стоимость:");
        System.out.println((int) getTotal());
    }

    private CartItem findByName(String name) {
        for (CartItem item : items) {
            if (item.getProduct().getName().equals(name)) {
                return item;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(new Product(1, "Телефон", 500), 1);
        cart.addProduct(new Product(2, "Чехол", 20), 2);
        cart.addProduct(new Product(3, "Зарядка", 30), 1);
        cart.showCart();
        cart.changeCount("Телефон",5);
        cart.showCart();
        cart.removeProduct("Телефон");
        cart.showCart();
    }
}
