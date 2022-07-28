package com.example.xml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author litong
 */
public class MyTest {


    @Test
    public void test() {
        ApplicationContext app = new ClassPathXmlApplicationContext("application.xml");

        Object object = app.getBean("person");

        System.out.println("object = " + object);

    }
}
