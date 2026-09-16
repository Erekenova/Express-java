package prepereToMock.OOP25;

public class Main {
    static void main() {
        Inventory inventory = new Inventory();

        inventory.addItem("Potion", 3);
        inventory.addItem("Arrow", 10);
        inventory.addItem("Potion", 2);

        System.out.println("Количество:");
        System.out.println("Potion → " + inventory.itemQuantity("Potion"));
        System.out.println("Arrow → " + inventory.itemQuantity("Arrow"));

        inventory.useItem("Potion");

        System.out.println("Количество:");
        System.out.println("Potion → " + inventory.itemQuantity("Potion"));
        System.out.println("Разных предметов: " + inventory.sizeInventory());
    }
}
