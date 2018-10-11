package com.rain.servicefeign.service;

import org.springframework.stereotype.Component;

/**
 * @author ZongXin
 * @create 2018-10-10 15:06
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}