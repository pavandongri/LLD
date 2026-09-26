package behavioural.strategy;

public class DroneDeliveryStrategy implements DeliveryStrategy {
    public DroneDeliveryStrategy() {
    }

    @Override
    public void deliver(String food) {
        System.out.println(food + " food is delivered by drone strategy.");
    }
}
