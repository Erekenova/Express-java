package prepereToMock.OOP02;

import java.util.ArrayList;
import java.util.List;

public class NotificationSystem {
    private String name;
    List<Notification> notificationList = new ArrayList<>();

    public NotificationSystem(String name) {
        this.name = name;
    }

    public void addN(Notification notification){
        notificationList.add(notification);
    }
    public void sendNotification(){
        for (Notification notification : notificationList) {
            notification.send();
        }
    }
}
