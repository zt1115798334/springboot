package com.example.springboot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 *
 * @author zhang
 * date: 2019/7/6 22:55
 * description:
 */
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String  helloWorld(){
        return "hello world";
    }
}
