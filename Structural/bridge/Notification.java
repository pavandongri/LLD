package Structural.bridge;

/** Abstraction: what is being sent, kept independent of how it travels. */
public abstract class Notification {
    protected final Notifier notifier;

    public Notification(Notifier notifier) {
        this.notifier = notifier;
    }

    public abstract void send(String message, String recipient);
}
