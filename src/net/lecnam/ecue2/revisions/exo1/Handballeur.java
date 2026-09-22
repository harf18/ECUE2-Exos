package net.lecnam.ecue2.revisions.exo1;

public class Handballeur extends Sportif{
    public Handballeur(String nom, double cote) {
        super(nom, cote);
    }

    @Override
    double retourneSalaire() {
        return  (cote * 2) + 1000;
    }
}
