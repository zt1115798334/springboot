package com.example.springboot.bootstrap;

import com.example.springboot.condition.ConditionOnSystemProperty;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created with IntelliJ IDEA.
 *
 * @author zhang
 * date: 2019/7/7 10:58
 * description:
 */
@ConditionOnSystemProperty(value = "value", name = "ddddd")
public class ConditionBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ConditionBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        context.close();
    }
}
