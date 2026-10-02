package prepereToMock.OOP5;

public class Dron extends Delivery{
    public Dron(String address) {
        super(address);
    }


    @Override
    public void deliver() {
        System.out.println("Дрон летит с посылкой на " +getAddress());
    }
}
