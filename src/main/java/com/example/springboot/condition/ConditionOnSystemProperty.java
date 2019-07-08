package com.example.springboot.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author zhang
 * date: 2019/7/7 10:56
 * description:
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(value = OnSystemPropertyCondition.class)
public @interface ConditionOnSystemProperty {

    String value();

    String name();
}
