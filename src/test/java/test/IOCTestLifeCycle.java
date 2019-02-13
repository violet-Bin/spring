package test;

import com.bingo.config.MainConfigOfLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 17:24 2019/2/9
 */
public class IOCTestLifeCycle {

    @Test
    public void test01() {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
        System.out.println("容器创建完成...");
        context.close();

    }



}
