package prepereToMock.OOP2;

public class SmsNotification extends Notification{
    public SmsNotification(String phoneNumber, String massage) {
        super(phoneNumber, massage);
    }

    @Override
    public void send() {
        System.out.println("SMS отправлено на " + recipient + ": " + massage);
    }
}
