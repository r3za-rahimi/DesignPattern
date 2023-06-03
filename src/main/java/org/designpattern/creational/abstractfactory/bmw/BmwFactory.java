package org.designpattern.creational.abstractfactory.bmw;

import org.designpattern.creational.abstractfactory.app.Body;
import org.designpattern.creational.abstractfactory.app.CarFactory;
import org.designpattern.creational.abstractfactory.app.Wheel;

public class BmwFactory implements CarFactory {
    @Override
    public Body createBody() {
        return new BmwBody();
    }
    @Override
    public Wheel createWheel() {
        return new BmwWheel();
    }
}
