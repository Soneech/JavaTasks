package org.soneech.tasks.variant23;

public class Rectangle extends Shape{
    @Override
    public void draw() {
        System.out.println("draw rectangle");
    }

    @Override
    public void erase() {
        System.out.println("erase rectangle");
    }
}
