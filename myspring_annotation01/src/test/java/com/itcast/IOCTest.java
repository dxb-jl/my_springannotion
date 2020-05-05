package com.itcast;

import com.itcast.config.MainConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest {

    @Test
    public void  test01(){
        ApplicationContext context=new AnnotationConfigApplicationContext(MainConfig.class);
        String [] beanNames=context.getBeanDefinitionNames();
        for (int i=0;i<beanNames.length;i++){
            System.out.println("beanName:"+beanNames[i]);
        }



    }








}
