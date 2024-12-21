package com.sscope.config;

import com.sscope.beans.Sport;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = {"com.sscope.beans"})
public class JavaConfig {
    @Bean
    @Scope("singleton")
    public Sport sport1(){
        return new Sport();
    }
    @Bean
    @Scope("prototype")
    public Sport sport2(){
        return new Sport();
    }
}
