package prepereToMock.OOP5;

public class Courier extends Delivery{
    public Courier(String address) {
        super(address);
    }

    @Override
    public void deliver() {
        System.out.println("Курьер доставляет посылку " + getAddress());
    }
}
