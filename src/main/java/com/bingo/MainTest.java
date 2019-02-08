package com.bingo;

import com.bingo.bean.Person;
import com.bingo.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 22:56 2019/2/8
 */
public class MainTest {

    public static void main(String[] args) {
        //配置文件的方式
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        Person person = (Person) context.getBean("person");
//        System.out.println(person);

        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        Person person = (Person) context.getBean("person");
        System.out.println(person);
        String[] namesForType = context.getBeanNamesForType(Person.class);
        for (String str : namesForType) {
            System.out.println(str);
        }
    }
}
