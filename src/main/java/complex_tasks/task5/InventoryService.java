package complex_tasks.task5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*Сервис для управления товарами на складе. Должен поддерживать операции добавления товара и извлечения товара по категории.
Управление товарными запасами:
Хранение товаров осуществляется в структуре Map<String, List<Product>>, где ключ - это категория товара.
Метод для добавления товара на склад. Если флаг isInventoryOpen равен false, операция добавления не должна выполняться.
Метод для получения товара по категории. Если в указанной категории нет товаров, должно выбрасываться исключение OutOfStockException.*/
public class InventoryService {
    Map<String, List<Product>> storage = new HashMap<>();
    private Boolean isInventoryOpen = true;

    public void setInventoryOpen(Boolean inventoryOpen) {
        isInventoryOpen = inventoryOpen;
    }
    public void addProduct(Product product){
        if (!isInventoryOpen) {
            System.out.println("Сервис закрыт!");
            return;
        }
        storage.computeIfAbsent(product.getCategory(),key -> new ArrayList<>())
                .add(product);
    }
    public Product getProductByCategory(String category){
        List<Product> products = storage.getOrDefault(category, new ArrayList<>());
        if (products.isEmpty()){
            throw new OutOfStockException("Товаров нужной категории нет на складе");
        }
        return products.remove(0);
    }
    /*Используйте Stream API для поиска и фильтрации товаров по категориям.
    Для фильтрации товаров по цене используйте лямбда-выражения в сочетании с filter().*/
    public List<Product> filterByPrice(double minPrice){
        return storage.values()
                .stream()
                .flatMap(List::stream)
                .filter(product -> product.getPrice() >= minPrice)
                .collect(Collectors.toList());
    }

}
