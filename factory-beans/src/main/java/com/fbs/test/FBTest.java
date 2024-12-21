package com.fbs.test;

import com.fbs.beans.Remainder;
import com.fbs.config.JavaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FBTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Remainder remainder = context.getBean(Remainder.class);
        System.out.println(remainder);

    }
}
