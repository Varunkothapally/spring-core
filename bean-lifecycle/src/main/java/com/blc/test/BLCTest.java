package com.blc.test;

import com.blc.beans.Calculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BLCTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.blc.beans");
        Calculator calculator = (Calculator) applicationContext.getBean("calculator");
        System.out.println(calculator);
    }
}
