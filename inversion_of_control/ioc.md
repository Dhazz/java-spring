# Inversion de contrôle (IoC) / Injection de Dépendances (DI)

---

## Définition de l'Injection de Dépendances

Processus dans lequel les objets définissent leurs dépendances via des arguments de constructeurs ou des propriétés sur l'instance de l'objet.


## L'IoC utilise l'Injection de Dépendances

Injecté une dépendance dans notre objet est déjà une meilleure pratique que de l'instancier dans cet objet, mais cela ne suffit pas.
Par exemple, même si on injecte notre dépendance dans le constructeur, cela signifie que l'on va devoir instancier cette dépendance
ailleurs dans notre code et pas forcément de manière optimale.

Une solution a été apporté par Spring: L'Inversion de Contrôle(IoC).

Au lieu que ce soit à nous d'instancier et de gérer le cycle de vie de notre dépendance, on laisse faire un conteneur IoC qui va le faire à notre
place et de manière transparente. Ce conteneur se base sur des métadonnées via des annotations ou des fichiers de configuration.
