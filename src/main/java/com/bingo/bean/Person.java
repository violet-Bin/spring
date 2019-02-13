package com.bingo.bean;

import org.springframework.beans.factory.annotation.Value;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 22:50 2019/2/8
 */
public class Person {

    //@Value赋值
    @Value("张三")
    private String name;
    @Value("#{20-2}")
    private String age;
    @Value("${id}")
    private int id;

    public Person() {
    }

    public Person(String name, String age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", id=" + id +
                '}';
    }
}
