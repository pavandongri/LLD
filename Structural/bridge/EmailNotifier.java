package Structural.bridge;

public class EmailNotifier implements Notifier {
    @Override
    public void deliver(String message, String recipient) {
        System.out.println("Sending Email to " + recipient + ": " + message);
    }
}
