package behavioural.strategy;

public class BikeDeliveryStrategy implements DeliveryStrategy {
    public BikeDeliveryStrategy() {
    }

    @Override
    public void deliver(String food) {
        System.out.println(food + " food is delivered by bike strategy");
    }
}
