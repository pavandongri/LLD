package Creational.factory;

public class Main {
    public static void main(String[] args) {
        Notifier notifier;

        notifier = new EmailNotifier();
        Notification emailNotification = notifier.createNotification();
        emailNotification.notifyUser();

        notifier = new PushNotifier();
        Notification pushNotification = notifier.createNotification();
        pushNotification.notifyUser();
    }
}
