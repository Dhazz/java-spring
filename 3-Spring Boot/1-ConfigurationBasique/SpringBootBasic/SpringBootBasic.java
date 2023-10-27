package SpringBootBasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

// On utilise cette nouvelle annotation qui remplace
// @Configuration : L'annotation pour déclarer une classe de configuration. Spring Boot n'a plus besoin des classes de configuration (mais reste utilisable)
// @EnableAutoConfiguration : Annotation appartenant à Spring Boot. Configure automatiquement le Contexte d'Application
// @ComponentScan : Annotation qui "scanne" les différents @Composants Spring Bean du package
@SpringBootApplication
public class SpringBootBasic {


    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootBasic.class, args);
        HelloService helloService = ctx.getBean(HelloService.class);
        helloService.sayHello();
    }
}
