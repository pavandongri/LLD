package Structural.adapter;

/** Adaptee: a third-party API whose signature does not match Notification. */
public interface WhatsappNotification {
    void sendWhatsappMessage(String message, String recipient, String whatsappKey);
}
