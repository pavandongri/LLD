package Structural.facade;

class OrderService {

    private int nextOrderId = 1000;

    public int createOrder(double total) {
        int orderId = nextOrderId++;
        System.out.println("Order: Created order " + orderId + " for " + total);
        return orderId;
    }
}
