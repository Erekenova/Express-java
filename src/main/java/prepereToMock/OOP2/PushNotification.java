package prepereToMock.OOP2;

public class PushNotification extends Notification{
    public PushNotification(String recipient, String massage) {
        super(recipient, massage);
    }

    @Override
    public void send() {
        System.out.println("Push отправлено на " + recipient +": " + massage);
    }
}
