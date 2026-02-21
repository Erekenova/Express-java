package practice_2;

public class Product {
    String name;
    float price;
    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    float aplplyDiscount(int discaunt){
        this.price = this.price * (100 - discaunt)/100;
        return this.price;
    }
    void printInfo(){
        System.out.println("Товар: " + this.name + " Цена: " + this.price);
    }
}
