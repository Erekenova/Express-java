package prepereToMock.OOP23;

import java.util.HashMap;
import java.util.Map;

public class Contact {
    Map<String,String> contact = new HashMap<>();

    public Contact(Map<String, String> contact) {
        this.contact = contact;
    }
    public String getName() {

        return contact.keySet().iterator().next();

    }

    public String getNumber() {

        return contact.values().iterator().next();
    }
}
