## Définir ses Beans par des Annotations

---

Spring utilise désormais beaucoup les Annotations. La plus basique étant l'annotation `@Bean` pour signifier que ce que l'on définit en code Java est un Bean.

Il n'y a donc plus besoin de fichier XML

* On doit toujours instancier le `ApplicationContext` puisqu'il est au coeur de la gestion des Beans, mais cette
fois-ci on ne lui renseigne pas de fichier XML mais la classe ou se situe les Beans annotés
* Avec `ApplicationContext` on va chercher nos Beans et on en fait ce que l'on veut