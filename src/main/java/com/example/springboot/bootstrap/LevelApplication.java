package com.example.springboot.bootstrap;

import com.example.springboot.repository.MyFirstLevelRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created with IntelliJ IDEA.
 *
 * @author zhang
 * date: 2019/7/6 22:33
 * description:
 */
@ComponentScan(value = "com.example.springboot.repository")
public class LevelApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new SpringApplicationBuilder(LevelApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        MyFirstLevelRepository myFirstLevelRepository = applicationContext.getBean("myFirstLevelRepository", MyFirstLevelRepository.class);
        System.out.println("myFirstLevelRepository = " + myFirstLevelRepository);
        applicationContext.close();
    }
}
