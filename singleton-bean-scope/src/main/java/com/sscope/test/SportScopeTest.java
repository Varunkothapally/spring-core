package com.sscope.test;

import com.sscope.beans.Sport;
import com.sscope.config.JavaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SportScopeTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Sport sport1 = context.getBean("sport1", Sport.class);
        Sport sport2 = context.getBean("sport1", Sport.class);
        System.out.println("sport1 == sport2 ? "+(sport1==sport2));
        Sport sport3 = context.getBean("sport2", Sport.class);
        Sport sport4 = context.getBean("sport2", Sport.class);
        System.out.println("sport3 == sport4 ? "+(sport3==sport4));
    }
}
