package DependencyInjectionByConfigClassExample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependencyInjectionByConfigClassExample {
    /// Objectif: dire "Hello World !" sur la console

    /// Contrairement à l'exemple 'Dependency Injection By Bean Annotation', je configure l'Application Context non pas à partir de cette même classe mais
    /// dans mon fichier de Configuration

    public static void main(String[] args) {
        AnnotationConfigApplicationContext appCtxt = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        // Une fois l'ApplicationContext récupéré, j'execute mon Bean qui est un simple println.
        appCtxt.getBean("sayHello");
    }
}
