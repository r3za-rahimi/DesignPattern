package org.designpattern.creational.singleton;

public class Main {
    public static void main(String[] args) {

        Singleton s = Singleton.getINSTANCE();
        s.setSetting("R3ZAR", 1372);
        Singleton s2 = Singleton.getINSTANCE();
        System.out.println(s2.getSetting("R3ZAR"));


        EnumSingleton s3 = EnumSingleton.INSTANCE;

        s3.setSetting("R3ZAR", 1372);

        EnumSingleton s4 = EnumSingleton.INSTANCE;
        System.out.println(s4.getSetting("R3ZAR"));
    }
}