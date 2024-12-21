package com.nbf.test;

import com.nbf.beans.Motor;
import com.nbf.config.ChildConfig;
import com.nbf.config.ParentConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class NBFTest {
    public static void main(String[] args) {
        ApplicationContext parentAppCtx = new
                AnnotationConfigApplicationContext(ParentConfig.class);
        ApplicationContext childApptCtx = new
                AnnotationConfigApplicationContext();
        ((AnnotationConfigApplicationContext) childApptCtx).register(ChildConfig.class);
        ((AnnotationConfigApplicationContext) childApptCtx).setParent(parentAppCtx);
        ((AnnotationConfigApplicationContext) childApptCtx).refresh();
        Motor motor = (Motor) childApptCtx.getBean("motor");
        motor.runMotor();
    }
}
