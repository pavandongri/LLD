package Structural.adapter;

/**
 * Adapter: implements the target interface and delegates to the adaptee,
 * supplying the extra whatsappKey the client should not have to know about.
 */
public class WhatsappNotificationAdapter implements Notification {
    private final WhatsappNotification whatsappNotification;
    private final String whatsappKey;

    public WhatsappNotificationAdapter(WhatsappNotification whatsappNotification, String whatsappKey) {
        this.whatsappNotification = whatsappNotification;
        this.whatsappKey = whatsappKey;
    }

    @Override
    public void send(String message, String recipient) {
        whatsappNotification.sendWhatsappMessage(message, recipient, whatsappKey);
    }
}
