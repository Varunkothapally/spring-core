package com.blc.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@ToString
@Component
@PropertySource("classpath:app.properties")
public class Calculator {
    private int a;
    private int b;
    private int sum;
    public Calculator(@Value("${a}") int a) {
        this.a = a;
    }
    @PostConstruct
    public void init(){
        this.sum = a + b;
    }
    @Value("${b}")
    public void setB(int b) {
        this.b = b;
    }
    @PreDestroy
    public void postConstruct(){
        a =0;
        b =0;
        sum = 0;
    }

}
