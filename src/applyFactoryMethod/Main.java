package applyFactoryMethod;

public class Main {
    public static void main(String[] args) {
        FactoryShape factoryShape = new FactoryShape();
        Shape shape = factoryShape.createShape(ShapeType.CIRCLE);
        Shape shape1 = factoryShape.createShape(ShapeType.RECTANGEL);
        Shape shape2 = factoryShape.createShape(ShapeType.TRIAGLE);
        shape.draw();
        shape1.draw();
        shape2.draw();
    }
}
