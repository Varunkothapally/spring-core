package com.fbs.config;

import com.fbs.helper.CalendarFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"com.fbs.beans"})
@PropertySource("classpath:app.properties")
public class JavaConfig {
    @Bean
    public CalendarFactoryBean calendarFactoryBean(@Value("${year}") int year, @Value("${month}") int month,
                                                   @Value("${day}") int day, @Value("${hour}") int hour,
                                                   @Value("${minute}") int minute) {
        CalendarFactoryBean calendarFactoryBean = new CalendarFactoryBean(year, month,day, hour, minute);
        return calendarFactoryBean;
    }
}
