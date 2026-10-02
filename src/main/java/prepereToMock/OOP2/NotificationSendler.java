package prepereToMock.OOP2;

import java.util.ArrayList;
import java.util.List;

public class NotificationSendler {
    List<Notification> notificationList = new ArrayList<>();

    public void sendAllNotification(List<Notification> notificationList) {
        for (Notification notification : notificationList) {
            notification.send();
        }
    }
    public void add(Notification notification) {
        notificationList.add(notification);
    }
}
