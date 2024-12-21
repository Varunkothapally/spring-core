package com.singleton.test;

import com.singleton.pattern.UnitConverter;

public class SingleThreadTest {
    public static void main(String[] args) {
        UnitConverter unitConverter1 = UnitConverter.getInstance();
        UnitConverter unitConverter2 = UnitConverter.getInstance();
        System.out.println(unitConverter1.equals(unitConverter2));
    }
}
