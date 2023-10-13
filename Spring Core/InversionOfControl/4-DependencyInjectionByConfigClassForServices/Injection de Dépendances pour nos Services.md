## Injection de dépendances pour nos Services

---

Dans l'exemple précédent on a injecté un `@Bean` qui execute un println. On peut bien entendu retourner un objet que l'on pourra se servir.

***C'est l'utilisation la plus courante de l'injection d'un Bean: Injecter un Service ou un Repository***

Dans cet exemple on injecte un Service `HelloService` et on appelle une de ses méthodes.