package com.nbf.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.nbf.beans","com.nbf.config"})
public class ChildConfig {
}
