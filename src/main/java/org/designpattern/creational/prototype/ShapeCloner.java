package org.designpattern.creational.prototype;

public class ShapeCloner {
    public Shape duplicate(Shape shape) {
        return shape.clone();
    }
}
