# Exercices Classes - Héritage

Ces exercices sont destinés à celles et ceux qui ont terminé le TP4. Ils mettent en pratique ce qu'on a vu en cours : **sous-classes, classes abstraites, interfaces, redéfinition de méthodes, `super(...)` et polymorphisme**.

> On n'a pas encore vu l'**encapsulation** (`private`, getters/setters) : ne vous en préoccupez pas pour l'instant, écrivez vos attributs comme dans le TP4. On y reviendra au prochain cours.

### Prérequis

- Cloner le projet sur votre poste dans le répertoire de votre choix
- Ouvrir le projet :
  * Sur l'écran d'accueil d'IntelliJ, cliquer sur **Open**
  * Sélectionner le dossier de votre projet qui a été copié depuis GitHub puis cliquer sur **OK**
  * Le projet s'ouvre
  * Allez vérifier que le SDK est bien sélectionné dans **File > Project Structure** onglet **Project**

### Utilisation de GIT

- Créer une nouvelle branche **prenomNom**
- Faire **1 commit** par exercice
- Ouvrir une *pull request* sur GitHub :
  * Aller sur votre projet sur GitHub
  * Cliquer sur **New Pull Request**
  * Sélectionner base repository = **harf18/ECUE2-Exos**
  * Sélectionner compare = votre branche **prenomNom**

---

## Boîte à outils

Quelques éléments de la bibliothèque Java dont vous aurez besoin. Pas besoin de tout comprendre en détail, utilisez-les tels quels.

### Les ensembles d'objets : des tableaux

Comme dans la classe `Dessin` du TP4, on stocke les objets dans un **tableau de taille maximale fixe**, avec un **compteur** du nombre d'éléments réellement présents.

```java
Figure[] figures = new Figure[100];   // 100 places au maximum
int nbFigures = 0;                    // aucune figure pour l'instant

// Ajouter (s'il reste de la place)
figures[nbFigures] = new Disque(...);
nbFigures++;

// Parcourir uniquement les cases remplies
for (int i = 0; i < nbFigures; i++) {
    System.out.println(figures[i]);
}
```

Pour **retirer** l'élément à l'indice `k`, on décale tous les éléments suivants d'une case vers la gauche, puis on décrémente le compteur :

```java
for (int i = k; i < nbFigures - 1; i++) {
    figures[i] = figures[i + 1];
}
nbFigures--;
figures[nbFigures] = null;   // on vide la dernière case
```

### Les dates : `LocalDate`

```java
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

LocalDate d = LocalDate.of(2018, 12, 20);                         // 20 décembre 2018
DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
String texte = d.format(format);                                  // "20/12/2018"

d.compareTo(autreDate);   // < 0 si d est avant, 0 si égales, > 0 si d est après
```

---

## Exercice 1 : Centre sportif

Écrivez vos classes dans **net.lecnam.ecue2.revisions.exo1**

Vous devez réaliser une application de gestion d'un centre sportif.

Un centre sportif gère 2 types de joueurs : les **footballeurs** et les **handballeurs**.

Un **Footballeur** possède :

- Un nom (String)
- Une cote, qui correspond à sa valeur sportive (entier)
- On doit pouvoir retourner son salaire avec la formule : salaire = (cote * cote * 10) + 1000
- On doit pouvoir retourner une chaîne qui décrit le joueur

Un **Handballeur** possède :

- Un nom (String)
- Une cote, qui correspond à sa valeur sportive (entier)
- On doit pouvoir retourner son salaire avec la formule : salaire = (cote * 2) + 1000
- On doit pouvoir retourner une chaîne qui décrit le joueur

Un **CentreSportif** gère un ensemble de sportifs (un tableau, 30 au maximum). On doit pouvoir :

- Ajouter un nouveau sportif
- Retirer un sportif grâce à son nom
- Lister les sportifs
- Afficher le total des cotes
- Afficher le coût total des salaires

**Réfléchissez à ce que les deux types de joueurs ont en commun, et à ce qui change de l'un à l'autre.**

Le code de la classe **net.lecnam.ecue2.revisions.exo1.Main** une fois complété doit pouvoir s'exécuter :

```java
public class Main {

    public static void main(String[] args) {

        CentreSportif centre = new CentreSportif("Stade du Cnam");

        // Ajouter 2 footballeurs et 2 handballeurs

        // Lister les sportifs

        // Afficher le total des cotes
        // Afficher le coût total des salaires

        // Retirer un sportif par son nom

        // Lister les sportifs
        // Afficher le coût total des salaires

    }
}
```

> Pensez à faire un commit !!

## Exercice 2 : Employés

Écrivez vos classes dans **net.lecnam.ecue2.revisions.exo2**

On vous demande de réaliser une ébauche d'application pour gérer des employés.

Un **Employe** a :

- Un **nom**
- Une **date de naissance**
- Un **salaire**
- Une **date d'embauche**

Un **Ingenieur** est un employé qui a en plus :

- Un **grade** (entier)

Pour un **Employe** ou un **Ingenieur**, on doit pouvoir :

- Afficher ses caractéristiques, par exemple :
  * `Dupont | 12/03/1985`
- Voir son salaire, sachant que pour un ingénieur, chaque unité de grade augmente le salaire de 100 € (grade 1 : +100 €, grade 2 : +200 €, etc.)
- **Augmenter** son salaire d'un montant donné
- Pour un ingénieur uniquement : **changer de grade**

Les employés et ingénieurs travaillent au sein d'une **Societe** qui possède :

- Un **nom**
- Des **collaborateurs** (un tableau, 50 au maximum)

Dans une société, on doit pouvoir :

- Lister les collaborateurs par **date d'embauche croissante**

**Pour le tri :** Java sait trier un tableau si ses éléments implémentent l'interface `Comparable`. Faites en sorte que `Employe` implémente `Comparable<Employe>` : il faut écrire la méthode `public int compareTo(Employe autre)`, qui compare les dates d'embauche (voir `compareTo` dans la boîte à outils). Ensuite, `Arrays.sort(collaborateurs, 0, nbCollaborateurs)` trie les cases remplies du tableau (import `java.util.Arrays`).

Le code de la classe **net.lecnam.ecue2.revisions.exo2.Main** une fois complété doit pouvoir s'exécuter :

```java
public class Main {

    public static void main(String[] args) {

        // Créer une société

        // Ajouter un employé
        // Ajouter un ingénieur de grade 2
        // (embauchés à des dates différentes, l'ingénieur avant l'employé)

        // Voir le salaire de l'employé
        // Voir le salaire de l'ingénieur

        // Augmenter le salaire de l'employé
        // Augmenter le grade de l'ingénieur

        // Voir le salaire de l'employé
        // Voir le salaire de l'ingénieur

        // Lister les collaborateurs par date d'embauche croissante

    }
}
```

**Question (à répondre en commentaire dans la classe Ingenieur) :** si on augmente le salaire d'un ingénieur de 50 €, est-ce que son bonus de grade change ? Pourquoi ?

> Pensez à faire un commit !!

## Exercice 3 : Médiathèque

Écrivez vos classes dans **net.lecnam.ecue2.revisions.exo3**

On vous demande de réaliser une ébauche d'application pour gérer une médiathèque.

La médiathèque gère des **Medias** qui peuvent être des **Livres** ou des **CD**.

Tous les **Medias** ont :

- Un **titre**
- Un **auteur**
- Une **date de retour**

Un **Livre** a en plus :

- Un nombre de pages

Un **CD** a en plus :

- Un nombre de titres
- Une durée (en secondes)

Un **Emprunteur** a :

- Un **nom**
- Un **prénom**
- Les **médias empruntés** (un tableau, 10 au maximum)

Pour un **Emprunteur**, on doit pouvoir :

- Emprunter un média en donnant une date de retour
- Voir les **médias** empruntés, par exemple :
  * `Livre | Le petit Prince | A. St Exupery | 150 pages | A retourner le : 20/12/2018`
  * `CD | Izia | Izia | 12 titres | 2432 secondes | A retourner le : 20/12/2018`

Le code de la classe **net.lecnam.ecue2.revisions.exo3.Main** une fois complété doit pouvoir s'exécuter :

```java
public class Main {

    public static void main(String[] args) {

        Livre livre = new Livre("Le petit Prince", "A. St Exupery", 150);
        CD cd = new CD("Izia", "Izia", 12, 2432);

        Emprunteur e = new Emprunteur("Arya", "Stark");

        // Emprunter le livre avec une date de retour au 20/12/2018
        // Emprunter le CD avec une date de retour au 20/12/2018

        // Voir les médias empruntés

    }
}
```

**Question (à répondre en commentaire dans la classe Media) :** la date de retour est ici un attribut du média. Que se passe-t-il si le même livre est emprunté par une autre personne le mois suivant ? Comment pourrait-on modéliser ça autrement ?

> Pensez à faire un commit !!

---

## Exercice 4 : Banque (à faire après le cours sur les exceptions)

Écrivez vos classes dans **net.lecnam.ecue2.revisions.exo4**

On vous demande de réaliser une ébauche d'application pour gérer des comptes bancaires.

Une banque a des clients. Chaque client a un nom et peut avoir 1 seul compte courant et 1 ou plusieurs comptes d'épargne. Par défaut, il a un compte de chaque catégorie.

Un compte courant ne rapporte pas d'intérêts, mais on peut avoir une autorisation de découvert.
Un compte d'épargne a un taux d'intérêt et rapporte des intérêts, mais n'a pas d'autorisation de découvert.

Sur un compte, on réalise des opérations : verser de l'argent (opération au montant positif) ou retirer de l'argent (opération au montant négatif). Une exception personnalisée doit être déclenchée si on retire de l'argent au-delà du seuil minimum du compte. Ces opérations doivent être historisées. On doit pouvoir afficher une opération, et afficher le solde d'un compte ainsi que son type.

On doit pouvoir lister les 5 dernières opérations effectuées sur un compte, et la liste des comptes d'un client.

Le code de la classe **net.lecnam.ecue2.revisions.exo4.Main** une fois complété doit pouvoir s'exécuter :

```java
public class Main {

    public static void main(String[] args) {

        // Ajouter un client

        // Ajouter une autorisation de découvert de 300 €

        // Déposer 1000 € sur le compte courant et afficher le solde

        // Retirer 5 fois 100 € et afficher le solde

        // Retirer 1000 € et afficher le solde

        // Lister les comptes du client avec le solde de chaque compte,
        // même si une exception a été levée avant

        // Lister les 5 dernières opérations du compte courant

    }
}
```

> Pensez à faire un commit !!