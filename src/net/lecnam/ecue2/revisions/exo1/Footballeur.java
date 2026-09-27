package net.lecnam.ecue2.revisions.exo1;

public class Footballeur extends Sportif {



    Footballeur(String nom, int cote) {
        super(nom, cote);
    }

    @Override
    float salaire() {
        return (cote * cote * 10) + 1000;
    }

    @Override
    public String toString() {
        return "Footballeur {Nom du joueur : " + nom + ", Salaire : " + salaire() +" }";
    }

}
