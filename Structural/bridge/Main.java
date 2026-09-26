package Structural.bridge;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Notifier smsNotifier = new SmsNotifier();
        Notifier emailNotifier = new EmailNotifier();

        String message = "Hello message !";
        String recipient = "876543210";

        // Two notification types x two channels, from 2 + 2 classes instead of 2 x 2.
        List<Notification> notifications = List.of(
                new AlertNotification(emailNotifier),
                new AlertNotification(smsNotifier),
                new ReminderNotification(emailNotifier),
                new ReminderNotification(smsNotifier));

        for (Notification notification : notifications) {
            notification.send(message, recipient);
        }
    }
}
