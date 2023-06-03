package org.designpattern.creational.abstractfactory.bmw;

import org.designpattern.creational.abstractfactory.app.Body;

public class BmwBody implements Body {
    @Override
    public void render() {
        System.out.println("BMW Body");
    }
}
