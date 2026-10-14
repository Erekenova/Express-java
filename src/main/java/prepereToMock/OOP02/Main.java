package prepereToMock.OOP02;

public class Main {
    public static void main(String[] args) {
        NotificationSystem notificationSystem = new NotificationSystem("Система нотификации");

        Notification sms = new Sms("+123456789", "Код подтверждения 1234");
        Notification push = new Push("device-777", "У вас новое сообщение");
        Notification email = new Email("alex@test.com", "Ваш заказ готов");

        notificationSystem.addN(sms);
        notificationSystem.addN(push);
        notificationSystem.addN(email);
        notificationSystem.sendNotification();


    }
}
