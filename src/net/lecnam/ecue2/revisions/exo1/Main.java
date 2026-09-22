package net.lecnam.ecue2.revisions.exo1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        CentreSportif centre = new CentreSportif("Stade du Cnam");

        Sportif foot1 = new Footballeur("Robin Van Persie", 100, "Le GOAT");
        Sportif foot2 = new Footballeur("Declan Rice", 1000, "Triple poumons");

        Sportif hand1 = new Handballeur("Nikola Karabatic", 10, "Le GOAL");
        Sportif hand2 = new Handballeur("Valentin Porte", 50, "Le GOAL");

        centre.ajout(foot1);
        centre.ajout(foot2);
        centre.ajout(hand1);
        centre.ajout(hand2);

        System.out.println(Arrays.toString(centre.sportif));
        System.out.println(centre.totalSalaire());

        centre.supprimer("Nikola Karabatic");

        System.out.println(Arrays.toString(centre.sportif));
        System.out.println(centre.totalSalaire());



    }

}
