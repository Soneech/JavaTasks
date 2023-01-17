package org.soneech.tasks.variant23;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory;
        Shape shape;

        shapeFactory = new CircleFactory();
        shape = shapeFactory.createShape();
        shape.draw();
        shape.erase();

        shapeFactory = new RectangleFactory();
        shape = shapeFactory.createShape();
        shape.draw();
        shape.erase();
    }
}
