package DIByAnnotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// Avec les annotations, plus besoin de définir ses beans dans un fichier de configuration, mais on a quand même besoin
// de l'association de @Configuration et de l'annotation @ComponentScan qui comme son nom l'indique va scanner tous les
// fichier tager @Component du classpath. Il faut donc aller annoter nos beans par @Component.
@Configuration
@ComponentScan
public class ApplicationConfig {
}
