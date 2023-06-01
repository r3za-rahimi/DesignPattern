package org.designpattern.creational.factory;

public class Main {

    public static void main(String[] args) {

        Notification notification = NotificationFactory.factory(NotificationType.SMS);
        notification.send("this is factory  design pattern ");

        Notification notification2 = NotificationFactory.factory(NotificationType.EMAIL);
        notification2.send("this is factory  design pattern ");
    }
}
