package practice_2;

public class Main {
    public static void main(String[] args) {
        Car volvo = new Car("Волво", 2022);
        volvo.print();
        volvo.setYear(2024);
        volvo.print();
        Rectangle rectangle = new Rectangle(10,12);
        rectangle.setWidth(11);
        System.out.println("Площадь прямоугольника с высотой " +rectangle.getHeight() + " и шириной " + rectangle.getWidth() + " равна: " + rectangle.calculateArea());
        Book book = new Book("Гарри Поттер и Тайная комната.", "Джоан Роулинг");
        book.printInfo();
        book.setAuthor("Джордж Мартин");
        book.printInfo();
        BankAccount bankAccount = new BankAccount("Абжетова Альбина", 0);
        bankAccount.deposit(1000000);
        bankAccount.printBalance();
        bankAccount.withdraw(10000);
        bankAccount.printBalance();
        Point point = new Point(1,1);
        point.print();
        point.setX(5);
        point.print();
        StudentGroup studentGroup1 = new StudentGroup("ФИИТ 111",25);
        studentGroup1.printInfo();
        studentGroup1.setStudentCount(24);
        studentGroup1.printInfo();
        Circle circle = new Circle(5);
        circle.setRadius(10);
        System.out.println("Площадь окружности " + circle.calculateArea());
        System.out.println("Длина окружности " + circle.calculateCircumference());
        Teacher teacherOfBiology = new Teacher("Мария Амангалиевна", "Биология");
        teacherOfBiology.printInfo();
        teacherOfBiology.setSubject("География");
        teacherOfBiology.printInfo();
        Product laptop = new Product("BenQ", 10000);
        laptop.printInfo();
        laptop.setPrice(12000);
        laptop.printInfo();
        laptop.aplplyDiscount(30);
        laptop.printInfo();
        Laptop laptop1 = new Laptop("Samsung", 15000);
        laptop1.printInfo();
        laptop1.setPrice(13000);
        laptop1.printInfo();


    }
}
