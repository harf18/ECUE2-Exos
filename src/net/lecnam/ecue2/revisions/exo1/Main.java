package net.lecnam.ecue2.revisions.exo1;

public class Main {

    public static void main(String[] args) {

        CentreSportif centre = new CentreSportif("Stade du Cnam");

        // Ajouter 2 footballeurs et 2 handballeurs

        Sportif f1 = new Footballeur("Jean", 10);
        Sportif f2 = new Footballeur("René", 12);
        Sportif h1 = new Handballeur("Louis", 13);
        Sportif h2 = new Handballeur("Rémi", 8);

        centre.ajout(f1);
        centre.ajout(f2);
        centre.ajout(h1);
        centre.ajout(h2);

        // Lister les sportifs

        for (int i = 0; i < centre.nbSportifs; i++) {
            System.out.println(centre.sportifs[i]);
        }

        // Afficher le total des cotes
        System.out.println("Total des cotes : " + centre.totalCotes());

        // Afficher le coût total des salaires
        System.out.println("Coût total des salaires : " + centre.totalSalaires());

        // Retirer un sportif par son nom
        centre.retirer("René");

        // Lister les sportifs
        for (int i = 0; i < centre.nbSportifs; i++) {
            System.out.println(centre.sportifs[i]);
        }

        // Afficher le coût total des salaires
        System.out.println("Coût total des salaires : " + centre.totalSalaires());
    }
}