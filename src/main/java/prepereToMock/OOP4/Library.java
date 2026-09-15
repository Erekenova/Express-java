package prepereToMock.OOP4;

import complex_tasks.task6.Status;

import java.util.ArrayList;
import java.util.List;

public  class Library {
    private String name;

    public Library(String name) {
        this.name = name;
    }
    private final List<BookItem> bookItems = new ArrayList<>();
    public void addBook(BookItem bookItem){
        bookItems.add(bookItem);
    }
    public void lendBook(String bookName){
       BookItem found =  bookItems.stream().filter(bookItem -> bookItem.getBook().getTitle().equals(bookName) &&
                       bookItem.getStatus().equals(BookStatus.AVAILABLE))
                .findFirst()
               .get();
       found.setStatus(BookStatus.LEND);
    }
    public void ternBook(String bookName){
        BookItem find =  bookItems.stream().filter(bookItem -> bookItem.getBook().getTitle().equals(bookName)&&
                bookItem.getStatus().equals(BookStatus.LEND))
                .findFirst()
                .get();
        find.setStatus(BookStatus.AVAILABLE);
    }
    public void showAvailableBook(){
        System.out.println("Доступные книги:");
        for (BookItem bookItem : bookItems) {
            if (bookItem.getStatus().equals(BookStatus.AVAILABLE)) {
                System.out.println(bookItem);
            }

        }
    }

}
