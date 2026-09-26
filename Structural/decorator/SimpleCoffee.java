package Structural.decorator;

public class SimpleCoffee implements Coffee {
    private final String name;
    private final int cost;

    public SimpleCoffee(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getCost() {
        return this.cost;
    }
}

// Espresso
// Cappuccino
// Latte
