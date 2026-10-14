package prepereToMock.OOP200;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("Alex", "12334234");
        phoneBook.addContact("Mariya", "83263162");
        phoneBook.countContacts();
        phoneBook.findNumberByName("Alex");
        phoneBook.removeContact("Mariya");
        phoneBook.countContacts();

    }
}
