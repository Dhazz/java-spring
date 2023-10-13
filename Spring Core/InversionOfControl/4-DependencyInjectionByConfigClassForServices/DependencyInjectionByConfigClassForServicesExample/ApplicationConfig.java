package DependencyInjectionByConfigClassForServicesExample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/// Cette fois-ci, je définis une classe de @Configuration qui accueillera mes @Beans (c'est plus propre).
@Configuration
public class ApplicationConfig {

    /// Par rapport à l'exemple précédent, nous allons renvoyer ici un service. Nous avons la plupart du temps besoin
    /// besoin d'injecter l'implementation de Services et non une execution direct
    @Bean
    public HelloService helloService(){
        HelloService helloService = new HelloService();
        return helloService;
    }
}
