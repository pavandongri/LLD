package Structural.bridge;

/** Implementor: the channel a notification travels over. */
public interface Notifier {
    void deliver(String message, String recipient);
}
