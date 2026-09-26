package behavioural.visitor;

public class AreaVisitor implements Visitor {
    @Override
    public void visit(Circle cirle) {
        int radius = cirle.getRadius();
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle = " + area);
    }

    @Override
    public void visit(Rectangle rectange) {
        int width = rectange.getWidth();
        int height = rectange.getHeight();
        int area = width * height;
        System.out.println("Area of rectangle = " + area);
    }
}
