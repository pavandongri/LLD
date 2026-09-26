package Creational.factory;

public class EmailNotifier implements Notifier {
    @Override 
    public Notification createNotification() {
        return new EmailNotification();
    }
}
