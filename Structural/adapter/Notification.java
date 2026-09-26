package Structural.adapter;

/** Target: the interface the client already knows how to talk to. */
public interface Notification {
    void send(String message, String recipient);
}
