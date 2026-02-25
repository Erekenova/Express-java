package practice_3;

public class LibraryTest {
    public static void main(String[] args) {
        Library book1 = new Library("Гарри Поттер", "Джоан Роулинг", 2002, "фентези");
        System.out.println("автор книги " + book1.author);
        System.out.println("категория книги " + book1.category);
        System.out.println("Название книги " + book1.getBookTitle());
        System.out.println("Год книги " + book1.getYear());
    }

}
