package prepereToMock.LiveCode1;

import java.util.Objects;

public class Book {
    String title;
    String author;

    @Override
    public int hashCode() {
      return  Objects.hash(title,author);
    }

    public boolean equals(Object o){
        if (!(o instanceof Book)) return false;
        else return  (this.author.equals(((Book) o).author) && this.title.equals(((Book) o).title));
    }
}
