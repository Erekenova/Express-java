package prepereToMock.OOP4;

public class Main
{
    static void main() {
        Library library = new Library("Городская библиотека");
        Book book = new Book("Мастер и Маргарита", "Булгаков");
        Book book1 = new Book("1984", "Оруэлл");
        BookItem bookItem = new BookItem(book,1);
        BookItem bookItem1 = new BookItem(book1,2);
        library.addBook(bookItem);
        library.addBook(bookItem1);

        library.showAvailableBook();

        library.lendBook("1984");

        System.out.println("\nПосле одной выдачи:");
        library.showAvailableBook();

        library.ternBook("1984");

        System.out.println("\nПосле возврата:");
        library.showAvailableBook();
    }
}
