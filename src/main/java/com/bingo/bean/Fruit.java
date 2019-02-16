package com.bingo.bean;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 17:14 2019/2/15
 */
public class Fruit {

    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Fruit() {
    }

    public Fruit(String id, String name) {
        System.out.println("Constructor...");
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
