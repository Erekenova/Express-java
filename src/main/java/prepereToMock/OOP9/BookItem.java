package prepereToMock.OOP9;

public class BookItem {
    private int quantity;
    Book book;
    Status status;

    public BookItem(int quantity, Book book) {
        this.quantity = quantity;
        this.book = book;
        this.status = Status.AVAILABLE;
    }

    public Book getBook() {
        return book;
    }

    public Status getStatus() {
        return status;
    }

    public void lend() {
        if (isAvailable()) {
            quantity--;
            if (quantity == 0) {
                status = Status.LEND;
            }
        }
    }

    public void returnBack() {
        quantity++;
        status = Status.AVAILABLE;

    }

    public boolean isAvailable() {
        return status == Status.AVAILABLE && quantity > 0;
    }

    @Override
    public String toString() {
        return "BookItem{" +
                "quantity=" + quantity +
                ", book=" + book +
                ", status=" + status +
                '}';
    }
}
