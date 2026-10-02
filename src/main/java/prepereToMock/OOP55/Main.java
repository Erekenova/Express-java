package prepereToMock.OOP55;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {

        List<Delivery>  delivery = new ArrayList<>();

        DelyveryService delyveryService = new DelyveryService();
        Delivery delivery1 = new Dron("ул. Пушкина");
        Delivery delivery2 = new Post("ул. Гагарина");
        Delivery delivery3 = new Courier("ул. Ленина");
        delivery.add(delivery1);
        delivery.add(delivery2);
        delivery.add(delivery3);
        delyveryService.delyveryAll(delivery);



    }
}
