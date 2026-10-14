package retake;
/*В системе есть телефонная книга.
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
1*/
public class Main {
    static void main() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("Alex", "12345");
        phoneBook.addContact("Maria", "777777");
        phoneBook.countContact();
        phoneBook.findNumber("Alex");
        phoneBook.removeContact("Maria");
        phoneBook.countContact();
    }
}
