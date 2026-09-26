package behavioural.strategy;

public class Main {
    public static void main(String[] args) {
        DeliveryStrategy bike = new BikeDeliveryStrategy();
        DeliveryStrategy drone = new DroneDeliveryStrategy();

        Restaurant restaurant = new Restaurant("Pavan Tifins", bike);
        restaurant.deliver("dosa");

        restaurant.setDeliveryStrategy(drone);
        restaurant.deliver("poori");
    }
}
