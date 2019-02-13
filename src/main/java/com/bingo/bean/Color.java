package com.bingo.bean;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 16:06 2019/2/9
 */
public class Color {

    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Color [car=" + car + "]";
    }

}
