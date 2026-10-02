package prepereToMock.OOP77;

public class Plane extends Transport{
    public Plane(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Самолет " + getName() + " летит по воздуху");
    }
}
