package Structural.bridge;

public class SmsNotifier implements Notifier {
    @Override
    public void deliver(String message, String recipient) {
        System.out.println("Sending SMS to " + recipient + ": " + message);
    }
}
