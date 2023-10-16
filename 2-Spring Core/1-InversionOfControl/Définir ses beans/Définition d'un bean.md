## Définition d'un bean

---

Nos objets qui ont besoin de dépendance ou qui seront des dépendances ont besoin
d'être défini comme des Beans.

Le Bean est un objet manipulé par Spring et son conteneur IoC.

Il y a plusieurs façons de définir nos Beans. Elles sont apparus au fil du temps:
* Définition dans un fichier XML
* Définition dans le code Java via l'annotation @Bean
* Définition directement sur la classe en question via l'annotation @Component (A voir dans le 
chapitre sur l'Injection des Dépendances)