package net.lecnam.ecue2.revisions.exo1;

public class Handballeur extends Sportif {

    Handballeur(String nom, int cote) {
        super(nom, cote);
    }

    @Override
    float salaire() {
        return (cote * 2) + 1000;
    }

    @Override
    public String toString() {
        return "Handballeur {Nom du joueur : " + nom + ", Salaire : " + salaire() +" }";
    }
}
