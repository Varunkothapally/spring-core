package com.nbf.config;

import com.nbf.beans.FuelTank;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:com/nbf/config/app-config.properties")
public class ParentConfig {
    @Bean
    public FuelTank createFuelTank(
            @Value("${fuelType}") String fuelType,
            @Value("${fuelCapacity}") int fuelCapacity) {
        FuelTank fuelTank = new FuelTank();
        fuelTank.setFuelCapacity(fuelCapacity);
        fuelTank.setFuelType(fuelType);
        return fuelTank;
    }
}
