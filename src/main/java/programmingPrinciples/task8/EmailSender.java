package programmingPrinciples.task8;

public class EmailSender implements Sender{
    @Override
    public void sendEmail(String message) {
        System.out.println("Отправка email: " + message);
    }
}
