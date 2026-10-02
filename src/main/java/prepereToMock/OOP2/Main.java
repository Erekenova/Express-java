package prepereToMock.OOP2;

import java.util.List;


public class Main {
    static void main() {
        EmailNotification emailNotification = new EmailNotification("alba-madona@mail.ru", "Hello");
        PushNotification pushNotification = new PushNotification("device-777", "Java");
        SmsNotification smsNotification = new SmsNotification("89270585351", "World");
        List<Notification> notifications = List.of(emailNotification, pushNotification, smsNotification);
        NotificationSendler notificationSendler = new NotificationSendler();
        notificationSendler.sendAllNotification(notifications);
    }
}