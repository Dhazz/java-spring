package BeanDefinitionInConfigClassExample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/// Cette fois-ci, je définis une classe de @Configuration qui accueillera mes @Beans (c'est plus propre).
@Configuration
public class ApplicationConfig {
    @Bean
    public void sayHello(){
        System.out.println("Hello World pour un Bean dans une classe de Configuration!");
    }

    // Cette définition va nous créer un objet (qui est donc un Bean) et nous le renvoyer. C'est la base de l'injection de dépendance que nous allons voir.
    @Bean
    public HelloServiceOnlyId helloServiceOnlyId(){
        HelloServiceOnlyId helloServiceOnlyId = new HelloServiceOnlyId();
        return helloServiceOnlyId;
    }

    @Bean
    public HelloServiceIdAndClass helloServiceIdAndClass(){
        HelloServiceIdAndClass helloServiceIdAndClass = new HelloServiceIdAndClass();
        return helloServiceIdAndClass;
    }

    @Bean
    public HelloServiceOnlyClass helloServiceOnlyClass(){
        HelloServiceOnlyClass helloServiceOnlyClass = new HelloServiceOnlyClass();
        return helloServiceOnlyClass;
    }
}
