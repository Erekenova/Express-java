package prepereToMock.OOP2;

public class EmailNotification extends Notification{

    public EmailNotification(String email, String massage) {
        super(email, massage);
    }

    @Override
    public void send() {
        System.out.println("Email отправлен на " + recipient + ": "   + massage);
    }
}
