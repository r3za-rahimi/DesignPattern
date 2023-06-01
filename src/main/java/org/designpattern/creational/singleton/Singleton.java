package org.designpattern.creational.singleton;

import java.util.HashMap;
import java.util.Map;

public class Singleton {

   private Map<String, Integer> setting = new HashMap<>();
    private static Singleton INSTANCE ;

    private Singleton() {

    }

    public static Singleton getINSTANCE() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }


    public Integer getSetting(String key) {
        return setting.get(key);
    }

    public void setSetting(String key, Integer value) {
        this.setting.put(key, value);
    }
}
