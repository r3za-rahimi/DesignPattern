package org.designpattern.creational.builder;

public class MainClass {

    public static void main(String[] args) {
        Computer c = new Computer.ComputerBuilder("western", "kingston")
                .setBluetoothEnabled(true).build();


        System.out.println(c.isBluetoothEnabled());
        System.out.println(c.isGraphicsCardEnabled());
    }
}
