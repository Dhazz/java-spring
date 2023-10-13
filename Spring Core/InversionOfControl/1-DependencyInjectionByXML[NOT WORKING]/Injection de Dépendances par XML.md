## Injection de dépendances par XML

---

### Dépendance = Création d'un bean

Un bean est simplement un objet. En l'occurence il s'agit d'un objet crée et geré par Spring et son conteneur IoC.


### Méthode historique d'injection des beans/dépendances dans notre code: XML

* On crée un fichier XML où l'on définit nos Beans via des balises
* Dans notre code Java, on instancie le Contexte d'Application (`ApplicationContext`) de Spring qui nous sert à référencer et gérer les Beans.
On lui renseigne le fichier XML. Il va donc baser sa configuration dessus.
* Avec cette ApplicationContext, on va chercher nos beans et on peut ensuite les utiliser comme bon nous semble


Cette méthode n'est plus utilisée sur les standards actuels.