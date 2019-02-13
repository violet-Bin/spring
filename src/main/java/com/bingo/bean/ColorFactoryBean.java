package com.bingo.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @Author: jiangjiabin
 * @Description: 实现spring定义的FactoryBean
 * @Date: Create in 17:04 2019/2/9
 */
public class ColorFactoryBean implements FactoryBean {

    //返回一个Color对象, 这个对象会添加到容器中
    @Override
    public Object getObject() throws Exception {
        return new Color();
    }

    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }

    //单例？
    @Override
    public boolean isSingleton() {
        return true;
    }
}
