package BeanDefinitionInConfigClassExample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanDefinitionInConfigClassExample {
    /// Objectif: dire "Hello World !" sur la console

    /// Contrairement à l'exemple 'Dependency Injection By Bean Annotation', je configure l'Application Context non pas à partir de cette même classe mais
    /// dans mon fichier de Configuration

    public static void main(String[] args) {
        AnnotationConfigApplicationContext appCtxt = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        // Une fois l'ApplicationContext récupéré, j'execute mon Bean qui est un simple println.
        appCtxt.getBean("sayHello");

        // Je vais chercher un autre bean qui est un objet et j'execute une de ses méthodes
        HelloServiceOnlyId helloServiceOnlyId = (HelloServiceOnlyId) appCtxt.getBean("helloServiceOnlyId");
        helloServiceOnlyId.sayHello();

        /// Plusieurs autres façons d'aller chercher un bean
        // sans caster, en renseignant directement la classe
        HelloServiceIdAndClass helloServiceIdAndClass = appCtxt.getBean("helloServiceIdAndClass", HelloServiceIdAndClass.class);
        helloServiceIdAndClass.sayHello();

        // [RECOMMANDE par Spring] Si le type est unique on peut directement appelé via le type
        HelloServiceOnlyClass helloServiceOnlyClass = appCtxt.getBean(HelloServiceOnlyClass.class);
        helloServiceOnlyClass.sayHello();
    }
}
