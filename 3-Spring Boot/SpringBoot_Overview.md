## Spring Boot

---
**Spring Boot n'est pas un module de Spring**

Spring Boot est un projet/outil qui permet de simplifier et d'accélerer la création d'application web en Java Spring.

Il va souvent de pair avec le projet Spring Initializr par Stephane Nicoll: [Spring Initializr](http://start.spring.io).

Il permet:
* Une configuration automatique de Spring via de nouvelles annotations
* Une gestion des dépendances externes et internes encore plus simplifié (grâce à des starter "clés en main")
* La création d'une application autonome que l'on peut directement éxecuté (fat JAR incluant toutes les dépendances + Tomcat)
* La création d'une image container pour les plate-formes Cloud (ex: Docker)
* Une configuration simplifiée pour les tests d'integration

---

**Pour la base du pack, il faut ajouter dans les dépendances (maven ou gradle):** 
* `spring-boot-starter`
* `spring-boot-starter-parent` par héritage (parent)

---

La plupart de la configuration de base de Spring peut désormais être raccourcie avec l'annotation `@SpringBootApplication` sur la classe principale.

