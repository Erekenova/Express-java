package prepereToMock.OOP200;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

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
    Map<String,String> contacts = new HashMap<>();

    public PhoneBook() {
    }

    // добавить контакт
    public void addContact(String name,String number){
        contacts.put(name,number);
        System.out.println("Контакт добавлен: " + name + " -> " + number);
    }
  //  удалить контакт
    public void removeContact(String name){
        if (isHasContact(name)){
            contacts.remove(name);
            System.out.println("Удаляем " + name);
        } else {
            System.out.println("Контакт не существует/");
        }
    }
   // найти номер по имени
    public void findNumberByName(String name){
        if(isHasContact(name)){
            System.out.println("Поиск " + name + " -> " + contacts.get(name));
        }
    }
   // проверить, существует ли контакт
    public boolean isHasContact(String name){
        return (contacts.containsKey(name));
    }
   // показать количество контактов
    public void countContacts(){
        System.out.println("Количество контактов: " + contacts.size());
    }

}
