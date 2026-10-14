package prepereToMock.OOP9;



import java.util.ArrayList;
import java.util.List;

/*"В системе есть библиотека.
У библиотеки есть:
название
список книг
У каждой книги есть:
название
автор
Нужно реализовать систему, которая может:
добавить книгу в библиотеку
выдать книгу читателю
вернуть книгу обратно
показать список доступных книг
Правила:
книгу можно выдать, если она доступна
при выдаче статус меняется на LEND
при возврате статус меняется AVAILABLE
Пример:
В библиотеке есть книги:
""1984"" — Оруэлл — 2
""Мастер и Маргарита"" — Булгаков — 1
После одной выдачи:
""1984"" — 1
""Мастер и Маргарита"" — 1

После возврата:
""1984"" — 2
""Мастер и Маргарита"" — 1"*/
public class Library {
    private String name;
    private List<BookItem> bookItemList = new ArrayList<>();
    public Library(String name) {
        this.name = name;
    }

    //добавить книгу в библиотеку
    public void addBookToLibrary(BookItem item){
        bookItemList.add(item);
    }
    //выдать книгу читателю
    public void lendBook(String title){
        for (BookItem bookItem: bookItemList) {
            if (bookItem.getBook().getTitle().equals(title) && bookItem.isAvailable()) {
                bookItem.lend();
            }
        }

    }
    //вернуть книгу обратно
    public void ternBook(String title){
        for (BookItem bookItem: bookItemList) {
            if (bookItem.getBook().getTitle().equals(title) && bookItem.getStatus().equals(Status.LEND)){
                bookItem.returnBack();
                System.out.println("Книгу вернули " + bookItem);
            }
        }
    }

    //показать список доступных книг
    public void showAvailableBook(){
        System.out.println("Список доступных книг:");
        for (BookItem bookItem : bookItemList) {
            if(bookItem.isAvailable()){
                System.out.println(bookItem);
            }
        }
    }
}
