package Structural.adapter;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String whatsappKey = "your_whatsapp_key"; // This could be fetched from a config
        WhatsappNotification whatsappNotificationService = new WhatsappNotificationService();

        // Without the adapter the client has to know the WhatsApp signature and hold the key itself.
        whatsappNotificationService.sendWhatsappMessage("Hello Message!", "9876543211", whatsappKey);

        // With the adapter, WhatsApp looks like any other Notification.
        List<Notification> notifications = List.of(
                new SmsNotification(),
                new WhatsappNotificationAdapter(whatsappNotificationService, whatsappKey));

        for (Notification notification : notifications) {
            notification.send("Hello Message!", "9876543211");
        }
    }
}
