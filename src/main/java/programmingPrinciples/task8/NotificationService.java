package programmingPrinciples.task8;

public class NotificationService {
    private Sender sender;

    public NotificationService(Sender sender) {
        this.sender = sender;
    }
    public void sendMessage(String message){
        sender.send(message);
    }
}
