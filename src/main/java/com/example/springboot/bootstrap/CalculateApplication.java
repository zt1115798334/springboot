package com.example.springboot.bootstrap;

import com.example.springboot.service.CalculateService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created with IntelliJ IDEA.
 *
 * @author zhang
 * date: 2019/7/6 23:18
 * description:
 */
@SpringBootApplication(scanBasePackages = "com.example.springboot.service")
public class CalculateApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(CalculateApplication.class)
                .web(WebApplicationType.NONE)
                .profiles("java7")
                .run(args);
        CalculateService bean = context.getBean(CalculateService.class);
        System.out.println("bean = " + bean.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        context.close();
    }
}
