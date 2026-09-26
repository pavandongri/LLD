package behavioural.strategy;

public class Restaurant {
    private String name;
    private DeliveryStrategy deliveryStrategy;

    public Restaurant(String name, DeliveryStrategy deliveryStrategy) {
        this.name = name;
        this.deliveryStrategy = deliveryStrategy;
    }

    public void setDeliveryStrategy(DeliveryStrategy deliveryStrategy) {
        this.deliveryStrategy = deliveryStrategy;
    }

    public void deliver(String food) {
        System.out.println(this.name + " restaurant dispatched food by " + deliveryStrategy.getClass().getSimpleName());
        deliveryStrategy.deliver(food);
    }
}
