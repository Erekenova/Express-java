package prepereToMock.OOP133;

public class OrderItem {
    private String title;
    private  double price;
    private int quantity;

    public OrderItem(String title, double price, int quantity) {
        this.title = title;
        this.price = price;
        this.quantity = quantity;
    }
    public double calculateSumOfOrderItem(){
        return price * quantity;
    }
}
