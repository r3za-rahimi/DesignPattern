package org.designpattern.creational.abstractfactory.benz;

import org.designpattern.creational.abstractfactory.app.Body;
import org.designpattern.creational.abstractfactory.app.CarFactory;
import org.designpattern.creational.abstractfactory.app.Wheel;

public class BenzFactory implements CarFactory {
    @Override
    public Body createBody() {
        return new BenzBody();
    }
    @Override
    public Wheel createWheel() {
        return new BenzWheel();
    }
}
