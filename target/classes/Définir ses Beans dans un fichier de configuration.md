## Définir ses Beans sans un fichier de configuration

---

Dans l'exemple précédent, on définit nos Beans directement dans la classe principale.

On atteint rapidement nos limites car des Beans on peut en avoir beaucoup.

Pour faire plus propre, on va ranger nos définitions de Beans dans une classe de configuration renseignée avec l'annotation
`@Configuration`

* Il suffit de créer une classe de n'importe quel nom: par exemple `MultipleDIByConstructorExample.DependencyInjectionByConstructorExample.ApplicationConfig`
* Renseigner cette classe avec l'annotation `@Configuration`
* On met toutes les définitions de nos `@Bean` dedans
* Quand on instancie `ApplicationContext`, on lui renseigne la classe de Configuration
* On utilise le Contexte d'Application pour aller chercher nos Beans