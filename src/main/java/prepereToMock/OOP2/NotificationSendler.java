package prepereToMock.OOP2;

import java.util.List;

public class NotificationSendler {
    public static void sendAllNotification(List<Notification> notificationList){
        for (Notification notification : notificationList) {
            notification.send();
        }
    }

    static void main() {
        EmailNotification emailNotification = new EmailNotification("alba-madona@mail.ru", "Hello");
        PushNotification pushNotification = new PushNotification("device-777","Java");
        SmsNotification smsNotification = new SmsNotification("89270585351", "World");
        List<Notification> notifications = List.of(emailNotification,pushNotification,smsNotification);
        sendAllNotification(notifications);
    }
}
