package DependencyInjectionByConfigClassExample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/// Cette fois-ci, je définis une classe de @Configuration qui accueillera mes @Beans (c'est plus propre).
@Configuration
public class ApplicationConfig {
    @Bean
    public void sayHello(){
        System.out.println("Hello World pour un Bean dans une classe de Configuration!");
    }
}
