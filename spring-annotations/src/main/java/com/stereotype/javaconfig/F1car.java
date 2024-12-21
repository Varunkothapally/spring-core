package com.stereotype.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class F1car {
    @Autowired
    private PowerUnit powerUnit;
    public void run(){
        powerUnit.onPowerUnit();
        System.out.println("F1 car running....");
    }
}
