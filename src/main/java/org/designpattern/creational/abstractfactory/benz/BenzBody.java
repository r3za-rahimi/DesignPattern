package org.designpattern.creational.abstractfactory.benz;

import org.designpattern.creational.abstractfactory.app.Body;

public class BenzBody implements Body {
    @Override
    public void render() {
        System.out.println("BENZ Body");
    }
}
