package com.itcast.config;

//看看bean的生命周期

import com.itcast.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfigofLifeCycle {

    @Bean
    public Car car(){
        return new Car();
    }





}
