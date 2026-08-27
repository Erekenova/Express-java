package complex_tests;

import complex_tasks.task5.InventoryService;
import complex_tasks.task5.OutOfStockException;
import complex_tasks.task5.Product;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/*Протестируйте добавление и извлечение товаров, проверив работу флага isInventoryOpen,
фильтрацию по категории и цене, а также обработку исключений при отсутствии товаров.
 */
public class InvestoryServiceTest {
    @Test
    public void checkGetProductByCategory(){
        InventoryService service = new InventoryService();
        Product book = new Product("Garry Potter", 1200.00,"book");
        Product phone = new Product("IPhone17Pro", 90000.00,"phone");
        service.addProduct(book);
        service.addProduct(phone);
        assertEquals(book,service.getProductByCategory("book"));
    }
    @Test
    public void checkAddProductWhenInvestoryClosed(){
        InventoryService service = new InventoryService();
        service.setInventoryOpen(false);
        Product book = new Product("Garry Potter", 1200.00,"book");
        service.addProduct(book);
        assertThrows(OutOfStockException.class, () ->service.getProductByCategory("book"));
    }
    @Test
    public  void checkOutOfStock(){
        InventoryService service = new InventoryService();
        assertThrows(OutOfStockException.class, () ->service.getProductByCategory("book"));
    }
    @Test
    public void checkaddAndGetProduct(){
        InventoryService service = new InventoryService();
        Product book = new Product("Garry Potter", 1200.00,"book");
        service.addProduct(book);
        Product get = service.getProductByCategory("book");
        assertEquals("Garry Potter",get.getName());
    }
    @Test
    public void checkFilterByPrice(){
        InventoryService service = new InventoryService();
        Product book = new Product("Garry Potter", 1200.00,"book");
        Product phone = new Product("IPhone17Pro", 90000.00,"phone");
        service.addProduct(book);
        service.addProduct(phone);
        List<Product> filterd = service.filterByPrice(10000);
        assertEquals(1,filterd.size());
        assertEquals("IPhone17Pro",filterd.get(0).getName());
    }

}
