package net.lecnam.ecue2.revisions.exo1;

public class Main {

    public static void main(String[] args) {

        CentreSportif centre = new CentreSportif("Stade du Cnam");

        // Ajouter 2 footballeurs et 2 handballeurs
        Sportif h1 = new Handballeur("Josh Hutcherson", 15);
        Sportif h2 = new Handballeur("Mike Tyson", 30);
        Sportif f1 = new Footballeur("Johnny Begood", 45);
        Sportif f2 = new Footballeur("Ratchet Clark", 60);

        CentreSportif complexe = new CentreSportif("Les Inconnus");

        complexe.ajoutSportif(h1);
        complexe.ajoutSportif(h2);
        complexe.ajoutSportif(f1);
        complexe.ajoutSportif(f2);

        // Lister les sportifs
        System.out.println(complexe.listerSportif());

        // Afficher le total des cotes
        System.out.println(complexe.getTotalCote());
        // Afficher le coût total des salaires
        System.out.println(complexe.getTotalSalaire());

        // Retirer un sportif par son nom
        complexe.retirerSportif("Mike Tyson");

        // Lister les sportifs
        System.out.println(complexe.listerSportif());

        // Afficher le total des cotes
        System.out.println(complexe.getTotalCote());
        // Afficher le coût total des salaires
        System.out.println(complexe.getTotalSalaire());

    }
}
