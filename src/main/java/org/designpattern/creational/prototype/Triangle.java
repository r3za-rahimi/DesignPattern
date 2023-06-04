package org.designpattern.creational.prototype;

public class Triangle implements Shape {

    private Integer height;
    public Integer getHeight() {
        return height;
    }
    public void setHeight(Integer height) {
        this.height = height;
    }
    @Override
    public void render() {

        System.out.println("Triangle Class");
    }
    @Override
    public Shape clone() {
        Triangle newTriangle = new Triangle();
        newTriangle.setHeight(height);
        return newTriangle;
    }
}
