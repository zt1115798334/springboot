package com.example.springboot.service.impl;

import com.example.springboot.service.CalculateService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @author zhang
 * date: 2019/7/6 23:16
 * description:
 */
@Profile(value = "java7")
@Service
public class Java7CalculateService implements CalculateService {
    @Override
    public Integer sum(Integer... num) {
        System.out.println("Java7CalculateService.sum");
        Integer sum = 0;
        for (Integer integer : num) {
            sum += integer;
        }
        return sum;
    }
}
