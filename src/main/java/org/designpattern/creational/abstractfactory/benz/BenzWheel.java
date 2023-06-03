package org.designpattern.creational.abstractfactory.benz;

import org.designpattern.creational.abstractfactory.app.Wheel;

public class BenzWheel implements Wheel {
    @Override
    public void render() {
        System.out.println("BENZ Wheel");
    }
}
