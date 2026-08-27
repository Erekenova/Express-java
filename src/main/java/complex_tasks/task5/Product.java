package complex_tasks.task5;
/*Продукт имеет минимальные характеристики, такими как название, цена и категория.*/
public class Product {
    private String name;
    private Double price;
    private String category;

    public Product(String name, Double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

}
