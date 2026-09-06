package prepereToMock.OOP3;

public class Dog extends Pet{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " ест мясо");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " спит в будке");
    }
}
