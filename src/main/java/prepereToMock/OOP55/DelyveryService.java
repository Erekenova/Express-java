package prepereToMock.OOP55;

import java.util.ArrayList;
import java.util.List;

public class DelyveryService {


    public void delyveryAll(List<Delivery> deliveries){
        for (Delivery delivery : deliveries) {
            delivery.deliver();
        }
    }
}
