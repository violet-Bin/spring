package com.bingo.config;

import com.bingo.bean.Person;
import com.bingo.service.BookService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @Author: jiangjiabin
 * @Description: 配置类
 * @Date: Create in 23:04 2019/2/8
 */
@Configuration
@ComponentScan(value = "com.bingo",
        includeFilters = {
//                @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class}),
//                @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = BookService.class),
                @ComponentScan.Filter(type = FilterType.CUSTOM, classes = MyTypeFilter.class)},
        useDefaultFilters = false)
//@ComponentScan value:指定要扫描的包
//excludeFilters = Filter[] : 指定扫描的时候按照什么规则排除哪些组件
//includeFilters = Filter[] ：指定扫描的时候只需要哪些组件
public class MainConfig {

    //给容器中注册一个bean;类型为返回值类型, id默认是方法名作为id
    @Bean("person")
    public Person person01() {
        return new Person("lisi", "21");
    }


}
