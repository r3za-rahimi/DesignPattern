package org.designpattern.structural.composite;

public class Leaf implements Component{
    private String name;
    private Integer price;

    public Leaf(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void info() {
        System.out.println(name + " =>  price : "+  price);
    }
}
