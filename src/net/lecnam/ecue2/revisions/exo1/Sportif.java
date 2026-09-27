package net.lecnam.ecue2.revisions.exo1;

public abstract class Sportif {

    String nom;
    int cote;

    Sportif(String nom, int cote) {
        this.nom = nom;
        this.cote = cote;
    }

    abstract float salaire();


}
