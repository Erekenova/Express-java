package Mock.Algorithm;
//создать класс персона с гетерами и сеттерами
public class Main {
    static void main() {
        Person person = new Person("Alex", 25);
        System.out.println("Имя: " + person.getName() + " возраст: " + person.getAge());
        person.setAge(26);
        System.out.println("Имя: " + person.getName() + " возраст: " + person.getAge());
    }
}
