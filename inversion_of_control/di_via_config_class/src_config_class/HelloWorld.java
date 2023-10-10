package src_config_class;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import src_config_class_complex.ApplicationConfig;

public class HelloWorld {

    /// Contrairement à l'exemple basique, je configure l'Application Context non pas à partir de cette même classe mais
    /// dans mon fichier de Configuration

    /// Une fois l'ApplicationContext récupéré, j'execute mon Bean qui est un simple println.

    public static void main(String[] args) {
        AnnotationConfigApplicationContext appCtxt = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        appCtxt.getBean("sayHello");
    }
}
