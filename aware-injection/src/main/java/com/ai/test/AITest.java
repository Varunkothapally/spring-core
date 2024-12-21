package com.ai.test;

import com.ai.beans.Television;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AITest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.ai.beans");
        Television television = (Television) applicationContext.getBean("television");
        television.play();

    }
}
