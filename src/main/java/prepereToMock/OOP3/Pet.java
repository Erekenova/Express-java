package prepereToMock.OOP3;

public abstract class Pet {
    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void eat();

    public abstract void sleep();
}
