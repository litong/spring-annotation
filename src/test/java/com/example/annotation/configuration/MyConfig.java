package com.example.annotation.configuration;

import com.example.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author litong
 */
@Configuration
public class MyConfig {

    @Bean
    public Person person () {
        return new Person("John", 20);
    }
}
