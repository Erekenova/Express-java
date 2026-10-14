package retake;

import java.util.HashMap;
import java.util.Map;

/*имя
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
 */
public class PhoneBook {
    Map<String, String> phoneBook = new HashMap<>();
    public void addContact(String name, String phoneNumber){
        phoneBook.put(name,phoneNumber);
        System.out.println("Контант добавлен: " + name + " -> " + phoneNumber);
    }
    public void removeContact(String name){
        if(isPresent(name)){
            phoneBook.remove(name);
            System.out.println("Контакт удален " + name);
        } else System.out.println("Номера нет в телефонной книге");
    }
    public void findNumber(String name){
        if(isPresent(name)){
            System.out.println("Поиск " +name + " -> " + phoneBook.get(name));
        }
    }
    public void countContact(){
        System.out.println("Количество контактов " + phoneBook.size());
    }
    public boolean isPresent(String name){
        return phoneBook.containsKey(name);
    }
}
