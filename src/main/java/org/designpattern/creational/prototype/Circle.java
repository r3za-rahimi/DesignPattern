package org.designpattern.creational.prototype;

public class Circle implements Shape {

    private Integer radius;

    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }

    @Override
    public void render() {
        System.out.println("Circle Class");
    }

    @Override
    public Shape clone() {
        Circle newCircle = new Circle();
        newCircle.setRadius(radius);
        return newCircle;
    }
}
