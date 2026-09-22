package net.lecnam.ecue2.revisions.exo1;

public class Footballeur extends Sportif{
    public Footballeur(String nom, double cote) {
        super(nom, cote);
    }

    @Override
    double retourneSalaire() {
        return (cote * cote * 10) + 1000;
    }
}
