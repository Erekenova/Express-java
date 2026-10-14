package prepereToMock.OOP02;
/*"Система работает с разными типами уведомлений:

Email уведомление
SMS уведомление
Push уведомление
У каждого уведомления есть получатель и текст сообщения.
Правила отправки:
Email — отправляется на email-адрес
SMS — отправляется на номер телефона
Push — отправляется на deviceId
о реализовать систему, которая может отправить уведомления всем получателям.
Требование:
Метод, который отправляет уведомления, должен работать со списком уведомлений, не зная их конкретный тип.
Каждый тип уведомления должен сам реализовывать логику отправки.

Метод должен вывести, например:
Email отправлен на alex@test.com: Ваш заказ готов
SMS отправлено на +123456789: Код подтверждения 1234
Push отправлено на device-777: У вас новое сообщение"*/
public abstract class Notification {
    private String resiver;
    private String text;

    public Notification(String resiver, String text) {
        this.resiver = resiver;
        this.text = text;
    }

    public String getResiver() {
        return resiver;
    }

    public String getText() {
        return text;
    }
    public abstract void send();
}
