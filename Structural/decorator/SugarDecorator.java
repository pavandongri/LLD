package Structural.decorator;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getName() {
        return coffee.getName() + " with Sugar";
    }

    @Override
    public int getCost() {
        return coffee.getCost() + 20;
    }
}
