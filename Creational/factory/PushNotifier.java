package Creational.factory;

public class PushNotifier implements Notifier {
    @Override 
    public Notification createNotification() {
        return new PushNotification();
    }   
}
