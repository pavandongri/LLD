package Creational.simplefactory;

public class NotificationFactory {
    public static Notification createNotification(String type){
        switch(type){
            case "EMAIL": 
                return new EmailNotification();
            case "PUSH":
                return new PushNotification();
            default:    
                throw new IllegalArgumentException("Unknown notification type");
        }
    }
}
