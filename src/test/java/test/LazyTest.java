package test;

import com.bingo.config.LazyConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 17:17 2019/2/15
 */
public class LazyTest {

    @SuppressWarnings("resource")
    @Test
    public void LazyTest() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LazyConfig.class);
        System.out.println("容器启动完成。。。");
//        Map<String, Fruit> map = context.getBeansOfType(Fruit.class);
//        System.out.println(map);

    }

}
