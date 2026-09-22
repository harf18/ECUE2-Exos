package net.lecnam.ecue2.revisions.exo1;

public class Main {

    public static void main(String[] args) {
        CentreSportif centre = new CentreSportif("Stade du Cnam");

        // Ajouter 2 footballeurs et 2 handballeurs
        centre.ajout(new Footballeur("Andy Goal", 50));
        centre.ajout(new Footballeur("Clark kent", 250));
        centre.ajout(new Handballeur("Randy But", 200));
        centre.ajout(new Handballeur("Stacy Oblige", 750));


        // Lister les sportifs
        System.out.println(centre);

        // Afficher le total des cotes
        System.out.println("Affiche total cote : " + centre.sommeCote());

        // Afficher le coût total des salaires
        System.out.println("Affiche total cote : " + centre.sommeSalaire());

        // Retirer un sportif par son nom
        centre.retire("Randy But");

        // Lister les sportifs
        System.out.println(centre);

        // Afficher le coût total des salaires
        System.out.println("Affiche total cote : " + centre.sommeSalaire());

    }

}
