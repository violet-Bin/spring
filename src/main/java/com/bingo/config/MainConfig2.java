package com.bingo.config;

import com.bingo.bean.Person;
import org.springframework.context.annotation.*;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 1:17 2019/2/9
 */
@Configuration
public class MainConfig2 {

    /**
     * singleton 默认单例
     * prototype 多实例
     * request：同一次请求创建一个实例
     * session：同一个session创建一个实例
     *
     * 懒加载：
     *      单实例bean：默认在容器启动的时候创建对象
     *      懒加载：容器启动不创建对象。第一次使用(获取)Bean创建对象,并初始化
     */
    @Bean
//    @Scope("prototype")
    @Lazy
    public Person person() {
        return new Person("张三", "17");
    }

    /**
     * @Conditional 按照一定的条件进行判断,满足条件给容器中注册bean
     * @return
     */
    @Bean("bill")
    public Person person01() {
        return new Person("Bill", "60");
    }

    @Bean("linus")
    public Person person02() {
        return new Person("Linus", "48");
    }


}
