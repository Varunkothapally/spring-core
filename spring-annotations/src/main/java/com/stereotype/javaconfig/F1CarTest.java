package com.stereotype.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class F1CarTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        F1car f1car = applicationContext.getBean("f1car", F1car.class);
        f1car.run();
    }
}
