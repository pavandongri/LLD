package Structural.adapter;

/** An implementation that already fits the target interface, so it needs no adapter. */
public class SmsNotification implements Notification {
    @Override
    public void send(String message, String recipient) {
        System.out.println("Sending SMS: " + message + " to " + recipient);
    }
}
