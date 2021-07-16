package com.example.testproject.singleton;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MyBean getBeanName(){
        return new MyBeanImpl();
    }
}
