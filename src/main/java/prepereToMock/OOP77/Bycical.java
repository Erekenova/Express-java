package prepereToMock.OOP77;

public class Bycical extends Transport {
    public Bycical(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Велосипед " + getName() + " крутит педали");
    }
}
