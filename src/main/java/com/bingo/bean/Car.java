package com.bingo.bean;

import org.springframework.stereotype.Component;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 17:21 2019/2/9
 */
@Component
public class Car {

    public Car() {
        System.out.println("car constructor...");
    }

    public void init() {
        System.out.println("car...init...");
    }

    public void destroy() {
        System.out.println("car...destroy...");
    }

}
