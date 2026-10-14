package prepereToMock.OOP02;

public class Push extends Notification{
    public Push(String resiver, String text) {
        super(resiver, text);
    }

    @Override
    public void send() {
        System.out.println("Push отправлено на " + getResiver() + ": " + getText());
    }
}
