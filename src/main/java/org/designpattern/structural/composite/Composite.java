package org.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private String name;
    private List<Component> components = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public void addComponent(Component com){
        components.add(com);
    }

    @Override
    public void info() {
        System.out.println( name + " : ");
        for (Component c : components) {
            c.info();
        }
    }
}
