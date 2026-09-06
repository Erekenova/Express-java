package prepereToMock.OOP3;

public class Cat extends Pet{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " ест рыбу");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " спит на подоконнике");
    }
}
