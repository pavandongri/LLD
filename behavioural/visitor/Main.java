package behavioural.visitor;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        Rectangle rectangle = new Rectangle(5, 10);

        AreaVisitor areaVisitor = new AreaVisitor();
        areaVisitor.visit(circle);
        areaVisitor.visit(rectangle);

        SvgVisitor svgVisitor = new SvgVisitor();
        svgVisitor.visit(circle);
        svgVisitor.visit(rectangle);
    }
}
