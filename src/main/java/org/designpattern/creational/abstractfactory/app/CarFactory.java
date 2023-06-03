package org.designpattern.creational.abstractfactory.app;

public interface CarFactory {
    Body createBody();
    Wheel createWheel();
}
