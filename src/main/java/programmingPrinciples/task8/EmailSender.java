package programmingPrinciples.task8;

public class EmailSender implements Sender{
    @Override
    public void send(String message) {
        System.out.println("Отправка email: " + message);

    }
}
