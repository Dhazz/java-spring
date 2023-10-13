package BeanDefinitionByXMLExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanDefinitionByXMLExample {
    public static void main(String[] args) {
        ApplicationContext appCtxt = new ClassPathXmlApplicationContext("applicationContext.xml");

        appCtxt.getBean("hello");
    }
}