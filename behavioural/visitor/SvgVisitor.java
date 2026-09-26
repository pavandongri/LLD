package behavioural.visitor;

public class SvgVisitor implements Visitor {
    @Override
    public void visit(Circle circle) {
        System.out.println("Creating svg of circle whose radius = " + circle.getRadius());
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("Creating svg of rectangle whose width = " + rectangle.getWidth()
                + ", height = " + rectangle.getHeight());
    }
}
