package com.example.springboot.service.impl;

import com.example.springboot.service.CalculateService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @author zhang
 * date: 2019/7/6 23:17
 * description:
 */
@Profile(value = "java8")
@Service
public class Java8CalculateService implements CalculateService {
    @Override
    public Integer sum(Integer... num) {
        System.out.println("Java8CalculateService.sum");
        return Arrays.stream(num).reduce(0, Integer::sum);
    }
}
