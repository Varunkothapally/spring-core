package com.stereotype.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SATest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.stereotype.annotation");
        Robot robot = applicationContext.getBean("tesla", Robot.class);
        robot.walk(5,"left");
    }
}
