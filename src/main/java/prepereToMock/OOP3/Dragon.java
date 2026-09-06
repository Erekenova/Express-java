package prepereToMock.OOP3;

public class Dragon extends  Pet{
    public Dragon(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " ест уголь");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " спит в пещере");

    }
}
