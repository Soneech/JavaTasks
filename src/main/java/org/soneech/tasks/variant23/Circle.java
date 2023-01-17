package org.soneech.tasks.variant23;

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("draw circle");
    }

    @Override
    public void erase() {
        System.out.println("erase circle");
    }
}
