package com.bingo.config;

import com.bingo.bean.Fruit;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 17:16 2019/2/15
 */
@Configuration
public class LazyConfig {

    @Bean
//    @Lazy
    public Fruit fruit() {
        return new Fruit("11", "apple");
    }

}
