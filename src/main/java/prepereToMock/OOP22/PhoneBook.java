package prepereToMock.OOP22;

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
*/
public class PhoneBook {

    Map<String,String> contacts = new HashMap<>();

    public PhoneBook() {
        this.contacts = contacts;
    }
    public void addContacts(String name, String phoneNumber){
        contacts.put(name,phoneNumber);
        System.out.println("Контакт добавлен: " + name + ": " + phoneNumber);
    }
    //удалить контакт
    public void removeContact(String name){
        if (containsName(name)){
            contacts.remove(name);
        System.out.println("Контакт  " + name + " удален");}
    }
   // найти номер по имени
    public String getPhone(String name){
        return contacts.get(name);
    }
    //проверить, существует ли контакт
    public boolean containsName(String name){
        return (contacts.containsKey(name));

    }

    //показать количество контактов
    public int getContactsCount(){
        return contacts.size();
    }



    //имя контакта уникально
    //если контакт с таким именем уже существует, номер должен обновляться
    //если контакт удален, его нельзя найти

}
