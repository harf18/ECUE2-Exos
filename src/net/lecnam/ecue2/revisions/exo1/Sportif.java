package net.lecnam.ecue2.revisions.exo1;

public abstract class Sportif {
    String nom;
    int cote;
    String description;

    public Sportif(String nom, int cote, String description) {
        this.nom = nom;
        this.cote = cote;
        this.description = description;
    }

    public abstract int Salaire();
}
