package test;

import com.bingo.config.MainConfigOfLifeCycle;
import com.bingo.config.MainConfigPropertyValues;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 17:24 2019/2/9
 */
public class IOCTestPropertyValues {

    @Test
    public void test01() {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigPropertyValues.class);
        printBeans(context);
        System.out.println("---------------");
        System.out.println(context.getBean("person"));
        context.close();

    }

    private void printBeans(AnnotationConfigApplicationContext context) {
        String[] definitionNames = context.getBeanDefinitionNames();
        for (String str : definitionNames) {
            System.out.println(str);
        }
    }


}
