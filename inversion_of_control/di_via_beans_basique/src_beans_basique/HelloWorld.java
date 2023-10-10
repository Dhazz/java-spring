package src_beans_basique;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class HelloWorld {

    /// Je definis un Bean via l'annotation @Bean du module de Contexte de Spring

    @Bean
    public void sayHello(){
        System.out.println("Hello World pour un Bean basique!");
    }


    /// Ce coup-ci, je vais chercher l'Application Context via une configuration par annotation (pour chercher les @Bean). J'utilise donc
    /// AnnotationConfigApplicationContext, comme son nom l'indique, et je lui passe le fichier qui correspond au
    /// fichier de Configuration de mes beans (dans cet exemple, lui-même, puisque mon Bean est ici)

    /// Une fois l'ApplicationContext récupéré, j'execute mon Bean qui est un simple println.

    public static void main(String[] args) {
        AnnotationConfigApplicationContext appCtxt = new AnnotationConfigApplicationContext(HelloWorld.class);

        appCtxt.getBean("sayHello");
    }
}
