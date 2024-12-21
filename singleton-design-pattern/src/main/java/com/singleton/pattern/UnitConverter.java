package com.singleton.pattern;

public class UnitConverter {
    public static UnitConverter instance;
    private UnitConverter() {

    }
    public static UnitConverter getInstance() {
        synchronized (UnitConverter.class) {
            if (instance == null) {
                instance = new UnitConverter();
            }
        }
        return instance;
    }
}
