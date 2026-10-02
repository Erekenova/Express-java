package prepereToMock.OOP5;

public abstract class Delivery {
    private String address;

    public String getAddress() {
        return address;
    }

    public Delivery(String address) {
        this.address = address;
    }

    public abstract void deliver();
}
