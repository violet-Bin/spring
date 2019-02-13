package com.bingo.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 18:17 2019/2/9
 */
@Component
public class Dog {

    public Dog() {
        System.out.println("Dog...constructor...");
    }

    //对象创建并赋值之后调用
    @PostConstruct
    public void init() {
        System.out.println("Dog...@PostConstruct...");
    }

    //容器移除对象之前
    @PreDestroy
    public void destroy() {
        System.out.println("Dog...@PreDestroy...");
    }


}
