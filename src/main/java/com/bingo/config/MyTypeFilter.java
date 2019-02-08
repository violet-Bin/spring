package com.bingo.config;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 1:05 2019/2/9
 */
public class MyTypeFilter implements TypeFilter {

    /**
     * @param metadataReader        读取到的当前正在扫描的类的信息
     * @param metadataReaderFactory 可以获取其他任何类信息
     * @return
     * @throws IOException
     */
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        //获取当前类注解的信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        //获取当前正在扫描的类的类信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        //获取获取当前类资源
        Resource resource = metadataReader.getResource();

        String className = classMetadata.getClassName();
        System.out.println("---->" + className);
        if (className.contains("er")) {
            return true;
        }
        return false;
    }
}
