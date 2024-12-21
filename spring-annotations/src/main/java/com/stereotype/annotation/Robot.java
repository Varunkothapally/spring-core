package com.stereotype.annotation;

import org.springframework.stereotype.Component;

@Component("tesla")
public class Robot {
    public void walk(int feet, String direction){
        System.out.println("Robot walks "+feet+" feet towards "+direction);
    }
}
