package practice_2;

public class Laptop {
    String brand;
    float price;

    public Laptop(String brand, float price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    void printInfo(){
        System.out.println("Название: " + this.brand + " Цена: " + this.price);
    }
}
