package prepereToMock.OOP4;

public class BookItem {
    private Book book;
    private int id;
    private BookStatus status;

    public BookItem(Book book, int id) {
        this.book = book;
        this.id = id;
        this.status = BookStatus.AVAILABLE;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "BookItem{" +
                "book=" + book +
                ", id=" + id +
                ", status=" + status +
                '}';
    }

    public Book getBook() {
        return book;
    }

    public BookStatus getStatus() {
        return status;
    }
}