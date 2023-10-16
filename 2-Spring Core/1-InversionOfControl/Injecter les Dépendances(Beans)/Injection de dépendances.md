## Injection de dépendances

---

L'injection de dépendance permet de récupérer les dépendances sans les instancier directement 
dans la classe où l'on en a besoin.
Elle est fait par le conteneur IoC.

Il faut avoir au préalable définir nos beans car ce sont ces objets qui
sont nos dépendances et qui sont gérés par le conteneur IoC

L'injection peut se faire à plusieurs endroits:
* Par un constructeur
* Par une propriété
* Par une méthode

Et de plusieurs manières qui sont apparues au fil du temps:
* par la configuration XML
* par la configuration Java
* par les annotations