package prepereToMock.OOP02;

public class Sms extends Notification{
    public Sms(String resiver, String text) {
        super(resiver, text);
    }

    @Override
    public void send() {
        System.out.println("SMS отправлено на " + getResiver() + ": " + getText());
    }
}
