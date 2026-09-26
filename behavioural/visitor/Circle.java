package behavioural.visitor;

public class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
