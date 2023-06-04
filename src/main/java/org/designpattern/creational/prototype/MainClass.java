package org.designpattern.creational.prototype;

public class MainClass {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(20);

        /** Clone With  Cloner  */
        ShapeCloner shapeCloner = new ShapeCloner();
        Circle newCircle = (Circle) shapeCloner.duplicate(circle);
        System.out.println(newCircle.getRadius());

        /** Clone With Object  */
        Circle circle1 = (Circle) circle.clone();
        System.out.println(circle1.getRadius());

        /** Different Reference  */
        System.out.println(circle);
        System.out.println(newCircle);
        System.out.println(circle1);
    }

}
