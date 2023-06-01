package org.designpattern.creational.factory;

public class NotificationFactory {

    public static Notification factory(NotificationType type) {

        switch (type) {
            case SMS -> {
                return new SmsNotification();
            }
            case EMAIL -> {
                return new EmailNotification();
            }
        }

        return null;
    }
}
