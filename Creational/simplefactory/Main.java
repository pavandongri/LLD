package Creational.simplefactory;

public class Main {
    public static void main(String[] args) {
        Notification notification;

        notification = NotificationFactory.createNotification("EMAIL");
        notification.notifyUser();


        notification = NotificationFactory.createNotification("PUSH");
        notification.notifyUser();
    }
}
