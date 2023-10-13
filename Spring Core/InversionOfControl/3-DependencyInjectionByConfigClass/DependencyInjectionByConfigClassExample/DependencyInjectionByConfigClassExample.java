package DependencyInjectionByConfigClassExample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependencyInjectionByConfigClassExample {
    /// Objectif: dire "Hello World !" sur la console

    /// Contrairement à l'exemple DependencyInjectionByAnnotation, je configure l'Application Context non pas à partir de cette même classe mais
    /// dans mon fichier de Configuration

    /// Une fois l'ApplicationContext récupéré, j'execute mon Bean qui est un simple println.

    public static void main(String[] args) {
        AnnotationConfigApplicationContext appCtxt = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        appCtxt.getBean("sayHello");
    }
}
