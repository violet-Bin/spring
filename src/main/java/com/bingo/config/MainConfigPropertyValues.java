package com.bingo.config;

import com.bingo.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 18:48 2019/2/9
 */
@Configuration
//加载外部配置文件
@PropertySource(value = {"classpath:/application.properties"})
public class MainConfigPropertyValues {

    @Bean
    public Person person() {
        return new Person();
    }

}
