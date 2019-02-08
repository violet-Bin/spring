package test;

import com.bingo.bean.Person;
import com.bingo.config.MainConfig;
import com.bingo.config.MainConfig2;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 23:26 2019/2/8
 */
public class IOCTest {

    @SuppressWarnings("resource")
    @Test
    public void test01() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] definitionNames = context.getBeanDefinitionNames();
        for (String str : definitionNames) {
            System.out.println(str);
        }
    }

    @SuppressWarnings("resource")
    @Test
    public void test02() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] definitionNames = context.getBeanDefinitionNames();
        for (String str : definitionNames) {
            System.out.println(str);
        }

        Object person1 = context.getBean("person");
        Object person2 = context.getBean("person");
        System.out.println(person1 == person2);
    }

    @SuppressWarnings("resource")
    @Test
    public void test03() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig2.class);
        String[] namesForType = context.getBeanNamesForType(Person.class);
        for (String name : namesForType) {
            System.out.println(name);
        }
    }

}
