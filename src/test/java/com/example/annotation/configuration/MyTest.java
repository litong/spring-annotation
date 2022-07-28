package com.example.annotation.configuration;

import com.example.entity.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author litong
 */
public class MyTest {

    @Test
    public void test() {
        ApplicationContext app = new AnnotationConfigApplicationContext(MyConfig.class);

        Object bean1 = app.getBean("person");
        Object bean2 = app.getBean("person");

        System.out.println("bean1 == bean2 = " + (bean1 == bean2));

        Object person = app.getBean(Person.class);

        System.out.println("person = " + person);

    }
}
