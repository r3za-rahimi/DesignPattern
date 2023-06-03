package org.designpattern.creational.abstractfactory;

import org.designpattern.creational.abstractfactory.app.BuildCar;
import org.designpattern.creational.abstractfactory.app.CarFactory;
import org.designpattern.creational.abstractfactory.benz.BenzFactory;
import org.designpattern.creational.abstractfactory.bmw.BmwFactory;

public class MainClass {
    public static void main(String[] args) {

        BuildCar buildCar = new BuildCar();
        buildCar.build(new BmwFactory());

    }
}
