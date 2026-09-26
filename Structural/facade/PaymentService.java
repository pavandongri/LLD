package Structural.facade;

class PaymentService {

    public boolean processPayment(double amount) {
        System.out.println("Payment: Charging " + amount + "...");
        return true;
    }
}
