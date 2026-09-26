package Structural.bridge;

public class AlertNotification extends Notification {
    public AlertNotification(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message, String recipient) {
        String formattedMessage = "Alert: " + message;
        notifier.deliver(formattedMessage, recipient);
    }
}
