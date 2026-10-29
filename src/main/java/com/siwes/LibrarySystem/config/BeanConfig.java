package com.siwes.LibrarySystem.config;

import com.siwes.LibrarySystem.demo.MyFirstClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public MyFirstClass myFirstClass(){
        return new MyFirstClass("Bean 1");
    }

    @Bean("bean2")
    public MyFirstClass mySecondClass(){
        return new MyFirstClass("Bean 2");
    }
}
