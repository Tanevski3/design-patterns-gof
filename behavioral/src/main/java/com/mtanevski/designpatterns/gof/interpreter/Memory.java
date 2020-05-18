package com.mtanevski.designpatterns.gof.interpreter;

import java.util.HashMap;
import java.util.Map;

public class Memory {

    private static final Map<String, String> storage = new HashMap<>();

    public static void store(String key, String value) {
        storage.put(key, value);
    }

    public static String get(String value) {
        return storage.get(value);
    }
}
