package Structural.facade;

class NotificationService {

    public void sendConfirmation(int orderId) {

        System.out.println(
            "Notification: Sending confirmation for order "
            + orderId
        );
    }
}