package Structural.adapter;

public class WhatsappNotificationService implements WhatsappNotification {
    @Override
    public void sendWhatsappMessage(String message, String recipient, String whatsappKey) {
        System.out.println("Sending WhatsApp message: " + message + " to " + recipient + " using key: " + whatsappKey);
    }
}