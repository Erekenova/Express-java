package prepereToMock.OOP02;

public class Email extends Notification{
    public Email(String resiver, String text) {
        super(resiver, text);
    }

    @Override
    public void send() {
        System.out.println("Email отправлен на " + getResiver() + ": " + getText());
    }
}
