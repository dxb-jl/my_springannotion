package com.itcast.config;

import com.itcast.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "com.itcast")
public class MainConfig {

    @Bean("person")
    public Person getPerson(){
        return new Person("大华",17);
    }










}
