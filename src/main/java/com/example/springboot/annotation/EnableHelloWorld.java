package com.example.springboot.annotation;

import com.example.springboot.configuration.HelloWorldConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author zhang
 * date: 2019/7/6 22:28
 * description:
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
//@Import(value = HelloWorldConfiguration.class)
@Import(value = HelloWorldImportSelector.class)
public @interface EnableHelloWorld {
}
