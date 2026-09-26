package Structural.bridge;

public class ReminderNotification extends Notification {
    public ReminderNotification(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message, String recipient) {
        String formattedMessage = "Reminder: " + message;
        notifier.deliver(formattedMessage, recipient);
    }
}
