package net.lecnam.ecue2.revisions.exo1;

public abstract class Sportif {
    String nom;
    double cote;

    public Sportif(String nom, double cote) {
        this.nom = nom;
        this.cote = cote;
    }

    abstract double retourneSalaire();

    @Override
    public String toString() {
        return String.format("%s : %s, cote : %f, salaire : %f", this.getClass().getName(), nom, cote, retourneSalaire());
    }
}
