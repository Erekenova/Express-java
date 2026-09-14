package prepereToMock.OOP22;

public class Main {
    static void main() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContacts("Alex","12345");
        phoneBook.addContacts("Mariya","188945");
        System.out.println(phoneBook.getContactsCount());
        phoneBook.removeContact("Alex");
        System.out.println(phoneBook.getContactsCount());
        System.out.println( phoneBook.getPhone("Mariya"));

    }
}
