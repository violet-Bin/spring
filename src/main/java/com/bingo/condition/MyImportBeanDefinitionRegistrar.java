package com.bingo.condition;

import com.bingo.bean.RainBow;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 16:48 2019/2/9
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    /**
     * @param annotationMetadata     当前类的注解信息
     * @param beanDefinitionRegistry BeanDefinition注册类
     *                               把需要添加到容器中的bean,
     *                               调用BeanDefinitionRegistry.registerBeanDefinition手工注册进来
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata,
                                        BeanDefinitionRegistry beanDefinitionRegistry) {
        boolean red = beanDefinitionRegistry.containsBeanDefinition("com.bingo.bean.Red");
        boolean blue = beanDefinitionRegistry.containsBeanDefinition("com.bingo.bean.Blue");
        if (red && blue) {
            //指定bean定义信息（bean的类型等。。。）
            RootBeanDefinition beanDefinition = new RootBeanDefinition(RainBow.class);
            //注册一个bean,指定bean名
            beanDefinitionRegistry.registerBeanDefinition("rainBow", beanDefinition);
        }

    }
}
