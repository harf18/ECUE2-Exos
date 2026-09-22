package net.lecnam.ecue2.revisions.exo1;

public class Footballeur extends Sportif{

    public Footballeur(String nom, int cote, String description) {
        super(nom, cote, description);
    }

    public int Salaire() {
        return (cote*cote*10) + 100;
    }
}
