package programmingPrinciples.task8;

import prepereToMock.OOP2.NotificationSendler;

public class NotificationService {
    private Sender sender;

    public NotificationService(Sender sender) {
        this.sender = sender;
    }
    public void sendMessage(String message){
        sender.sendEmail(message);
    }
}
