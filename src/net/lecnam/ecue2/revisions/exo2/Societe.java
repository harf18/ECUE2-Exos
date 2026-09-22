package net.lecnam.ecue2.revisions.exo2;

import java.util.Arrays;

public class Societe {

    String nom;
    Employe[] employe;
    int nbEmploye;

    public Societe(String nom) {
        this.nom = nom;
        this.employe = new Employe[50];
        this.nbEmploye = 0;
    }

    public void ajout(Employe e) {
        if (nbEmploye < 50) {
            employe[nbEmploye] = e;
            nbEmploye++;
        }
    }

    @Override
    public String toString() {
        return "Societe{" +
                "nom='" + nom + '\'' +
                ", employe=" + Arrays.toString(employe) +
                ", nbEmploye=" + nbEmploye +
                '}';
    }

    public void trierParDateEmbauche() {
        Arrays.sort(employe, 0, nbEmploye);
    }
}
