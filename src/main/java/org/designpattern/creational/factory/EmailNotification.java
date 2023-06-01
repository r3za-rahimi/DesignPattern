package org.designpattern.creational.factory;

public class EmailNotification implements Notification{
    @Override
    public void send(String text) {

        System.out.println("Email "+text);
    }
}
