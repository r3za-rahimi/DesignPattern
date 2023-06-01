package org.designpattern.creational.singleton;

import java.util.HashMap;
import java.util.Map;

public enum EnumSingleton {

    INSTANCE;

    private Map<String, Integer> setting = new HashMap<>();


    public Integer getSetting(String key) {
        return setting.get(key);
    }

    public void setSetting(String key, Integer value) {
        this.setting.put(key, value);
    }
}
