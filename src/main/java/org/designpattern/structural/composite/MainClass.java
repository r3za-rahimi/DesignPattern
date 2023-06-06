package org.designpattern.structural.composite;

public class MainClass {

    public static void main(String[] args) {

        Component mouse = new Leaf("Mouse" , 5000);
        Component keyboard = new Leaf("Keyboard" , 8000);
        Component monitor = new Leaf("Monitor" , 10000);

        Component cpu = new Leaf("Cpu" , 50000);
        Component ram = new Leaf("Ram" , 25000);

        Composite gadget = new Composite("Gadget");
        Composite motherBord = new Composite("MotherBord");
        Composite computerCase =  new Composite("Case");

        gadget.addComponent(mouse);
        gadget.addComponent(keyboard);
        gadget.addComponent(monitor);

        motherBord.addComponent(cpu);
        motherBord.addComponent(ram);


        computerCase.addComponent(motherBord);

        computerCase.info();
        gadget.info();

    }
}
