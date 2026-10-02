package prepereToMock.OOP77;

public class Car extends Transport{
    public Car(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Машина " + getName() + " едет по дороге");
    }
}
