package prepereToMock.OOP5;

public class Post extends Delivery{
    public Post(String address) {
        super(address);
    }

    @Override
    public void deliver() {
        System.out.println("Почта отправила посылку через сортировочный центр на " +getAddress());
    }
}
