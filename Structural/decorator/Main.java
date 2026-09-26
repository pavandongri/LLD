package Structural.decorator;

public class Main {
    public static void main(String[] args) {
        Coffee espresso = new SimpleCoffee("Espresso", 100);
        System.out.println(espresso.getName() + " : " + espresso.getCost());

        Coffee milkCoffee = new MilkDecorator(espresso);
        System.out.println(milkCoffee.getName() + " : " + milkCoffee.getCost());

        Coffee sugarCoffee = new SugarDecorator(espresso);
        System.out.println(sugarCoffee.getName() + " : " + sugarCoffee.getCost());

        // decorators stack: each one wraps the previous result
        Coffee milkSugarCoffee = new SugarDecorator(new MilkDecorator(new SugarDecorator(new MilkDecorator(espresso))));
        System.out.println(milkSugarCoffee.getName() + " : " + milkSugarCoffee.getCost());
    }
}
