package prepereToMock.OOP23;

import java.util.*;

/*"В системе есть телефонная книга.
Телефонная книга хранит контакты.
У каждого контакта есть:
имя
номер телефона
Нужно реализовать систему, которая может:
добавить контакт
удалить контакт
найти номер по имени
проверить, существует ли контакт
показать количество контактов

Правила:
имя контакта уникально
если контакт с таким именем уже существует, номер должен обновляться
если контакт удален, его нельзя найти

Пример:
Добавляем контакты:
Alex → 12345
Maria → 77777

Поиск:
Alex → 12345

Удаляем:
Maria

Количество контактов:
1"*/
public class PhoneBook {

    List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {

        // Если имя уже есть — обновляем номер

        for (Contact c : contacts) {

            if (c.getName().equals(contact.getName())) {

                c.contact.put(c.getName(), contact.getNumber());

                return;

            }

        }

        // Если такого имени нет — добавляем

        contacts.add(contact);

    }

    public void remove(String name) {

        contacts.removeIf(c -> c.getName().equals(name));

    }

    public String findNumber(String name) {

        for (Contact c : contacts) {

            if (c.getName().equals(name)) {

                return c.getNumber();

            }

        }

        return null;

    }

    public boolean exists(String name) {

        return contacts.stream()

                .anyMatch(c -> c.getName().equals(name));

    }

    public int size() {

        return contacts.size();

    }

        static void main() {
        PhoneBook phoneBook = new PhoneBook();
        Contact contact1 = new Contact(Map.of("Alex","12345"));
        Contact contact2 = new Contact(Map.of("Maria","77777"));
        phoneBook.addContact(contact1);
        phoneBook.addContact(contact2);
        System.out.println(phoneBook.findNumber("Alex")); // 12345
            phoneBook.remove("Maria");
            System.out.println(phoneBook.size());

    }


}

