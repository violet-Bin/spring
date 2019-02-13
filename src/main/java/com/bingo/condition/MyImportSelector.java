package com.bingo.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author: jiangjiabin
 * @Description: 自定义逻辑返回需要导入的组件
 * @Date: Create in 16:36 2019/2/9
 */
public class MyImportSelector implements ImportSelector {

    //返回值就是导入到容器中的组件全类名
    //AnnotationMetadata 当前标注@Import注解的类的所有注解信息
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
//        annotationMetadata
        //不要返回null
        return new String[]{"com.bingo.bean.Blue", "com.bingo.bean.Yellow"};
    }
}
