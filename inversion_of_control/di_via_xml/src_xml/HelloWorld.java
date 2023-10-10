package src_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld {
    public static void main(String[] args) {
        ApplicationContext appCtxt = new ClassPathXmlApplicationContext("/di_via_xml/resources/applicationContext.xml");

        appCtxt.getBean("hello");
    }
}