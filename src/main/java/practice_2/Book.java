package practice_2;

import java.util.Objects;

public class Book {
    String title;
    String author;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

    Book(String title, String author){
        this.title = title;
        this.author = author;
    }
    String getTitle(){
        return this.title;
    }
    String getAuthor(){
        return  this.author;
    }
    void setTitle(String newTitle){
        this.title = newTitle;
    }
    void  setAuthor(String newAuthor){
        this.author = newAuthor;
    }
    void printInfo(){
       System.out.println("Название: " + this.title + " Автор: " + this.author);
    }

}
