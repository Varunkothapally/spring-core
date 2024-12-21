package com.ai.beans;

import com.ai.helper.SetTopBox;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Television implements ApplicationContextAware {

    private ApplicationContext applicationContext;
    private SetTopBox setTopBox;
    public void play() {
        setTopBox = applicationContext.getBean("airtelSetTopBox", SetTopBox.class);
        setTopBox.onSetTopBox();
        System.out.println("Television played");

    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
