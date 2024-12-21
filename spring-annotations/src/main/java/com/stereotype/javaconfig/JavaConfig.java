package com.stereotype.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.stereotype.javaconfig"})
public class JavaConfig {
    @Bean
    public PowerUnit startPowerUnit(){
        return new PowerUnit();
    }

}
