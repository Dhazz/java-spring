package DependencyInjectionByConfigClassForServicesExample;

import DependencyInjectionByConfigClassForServicesExample.ApplicationConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependencyInjectionByConfigClassForServicesExample {

    /// Contrairement à l'exemple DependencyInjectionByAnnotation, je configure l'Application Context non pas à partir de cette même classe mais
    /// dans mon fichier de Configuration

    /// Mon bean peut également nous faire un retour. Ce retour peut par exemple être un objet de n'importe quel type. Très pratique pour récupérer un Service
    /// ou un Repository par exemple

    public static void main(String[] args) {
        ApplicationContext appCtxt = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        HelloService helloService = (HelloService) appCtxt.getBean("helloService");

        helloService.sayHello();
    }
}
