package prepereToMock.OOP5;

import java.util.ArrayList;
import java.util.List;

public class DeliveryService {
    List<Delivery> deliveryList = new ArrayList<>();
    public void sendAll(){
        for (Delivery delivery : deliveryList) {
            delivery.deliver();
        }

    }
}
