package DependencyInjectionByXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld {
    public static void main(String[] args) {
        ApplicationContext appCtxt = new ClassPathXmlApplicationContext("applicationContext.xml");

        appCtxt.getBean("hello");
    }
}