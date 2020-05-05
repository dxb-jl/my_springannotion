package com.itcast;

import com.itcast.bean.Person;
import com.itcast.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

    public static void main(String[] args) {
        //通过配置文件的形式
       /* ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Person person= (Person) context.getBean("person");
        System.out.println("person:"+person);*/

        //通过注解的形式
        ApplicationContext context=new AnnotationConfigApplicationContext(MainConfig.class);
        Person person= (Person) context.getBean(Person.class);
        System.out.println("person:"+person);

        String [] names=context.getBeanNamesForType(Person.class);
        for (int i=0;i<names.length;i++){
            System.out.println("name:"+names[i]);
        }
    }








}
