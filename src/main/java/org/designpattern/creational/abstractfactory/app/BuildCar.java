package org.designpattern.creational.abstractfactory.app;

public class BuildCar {
    public void build(CarFactory factory){

        factory.createBody().render();
        factory.createWheel().render();
    }
}
