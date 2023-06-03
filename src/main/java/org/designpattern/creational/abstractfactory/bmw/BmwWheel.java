package org.designpattern.creational.abstractfactory.bmw;

import org.designpattern.creational.abstractfactory.app.Wheel;

public class BmwWheel implements Wheel {
    @Override
    public void render() {
        System.out.println("BMW Wheel");
    }
}
