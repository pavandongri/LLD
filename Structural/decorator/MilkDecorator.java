package Structural.decorator;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getName() {
        return coffee.getName() + " with Milk";
    }

    @Override
    public int getCost() {
        return coffee.getCost() + 10;
    }
}
