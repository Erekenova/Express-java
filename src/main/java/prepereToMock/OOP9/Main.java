package prepereToMock.OOP9;

public class Main {
    static void main() {
        Library library = new Library("City library");
        Book book = new Book("1994","Оруэлл");
        Book book1 = new Book("Мастер и Маргарита","Булгаков");
        BookItem bookItem = new BookItem(2,book);
        BookItem bookItem2 = new BookItem(1,book1);
        library.addBookToLibrary(bookItem);
        library.addBookToLibrary(bookItem2);
        library.showAvailableBook();
        System.out.println("-----------");
        library.lendBook("1994");
        library.lendBook("1994");
        library.showAvailableBook();
        library.ternBook("1994");
        System.out.println("-----------");
        library.showAvailableBook();
    }
}
