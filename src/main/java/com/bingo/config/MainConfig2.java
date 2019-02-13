package com.bingo.config;

import com.bingo.bean.Color;
import com.bingo.bean.ColorFactoryBean;
import com.bingo.bean.Person;
import com.bingo.bean.Red;
import com.bingo.condition.LinuxCondition;
import com.bingo.condition.MyImportBeanDefinitionRegistrar;
import com.bingo.condition.MyImportSelector;
import com.bingo.condition.WindowsCondition;
import org.springframework.context.annotation.*;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 1:17 2019/2/9
 */
@Configuration
@Import({Color.class, Red.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})
public class MainConfig2 {

    /**
     * singleton 默认单例
     * prototype 多实例
     * request：同一次请求创建一个实例
     * session：同一个session创建一个实例
     * <p>
     * 懒加载：
     * 单实例bean：默认在容器启动的时候创建对象
     * 懒加载：容器启动不创建对象。第一次使用(获取)Bean创建对象,并初始化
     */
    @Bean
//    @Scope("prototype")
    @Lazy
    public Person person() {
        return new Person("张三", "17");
    }

    /**
     * @return
     * @Conditional 按照一定的条件进行判断, 满足条件给容器中注册bean
     */
    @Bean("bill")
    @Conditional({WindowsCondition.class})
    public Person person01() {
        return new Person("Bill", "60");
    }

    @Bean("linus")
    @Conditional({LinuxCondition.class})
    public Person person02() {
        return new Person("Linus", "48");
    }

    /**
     * 给容器中注册组件：
     * 1）：包扫描+组件标注注解（4个注解）
     * 2）：@Bean [导入到第三方包里面的组件]
     * 3）：Import [快速给容器中导入一个组件]
     *      (1):@Import(要导入到容器中的组件); 容器中就会自动注册这个组件,id默认是全类名
     *      (2):ImportSelector:返回需要导入的组件全类名数组
     *      (3):ImportBeanDefinitionRegistrar:手动注册bean到容器中
     * 4）：使用spring提供的FactoryBean(工厂Bean)
     *      (1)、默认获取到的是工厂Bean调用getObject创建的对象
     *      (2)、要获取工厂Bean本身, 需要给ID前面加一个&
     *          &colorFactoryBean
     */

    @Bean
    public ColorFactoryBean colorFactoryBean() {
        return new ColorFactoryBean();
    }

}
