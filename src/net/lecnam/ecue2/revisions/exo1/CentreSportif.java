package net.lecnam.ecue2.revisions.exo1;

import java.util.Arrays;

public class CentreSportif {

    String nom;
    Sportif[] sportif;
    int nbSportif;

    public CentreSportif(String nom) {
        this.nom = nom;
        this.sportif = new Sportif[30];
        this.nbSportif = 0;
    }

    public void ajout(Sportif s) {
        if (nbSportif < 30) {
            sportif[nbSportif] = s;
            nbSportif++;
        }
    }

    public void supprimer(String nom) {
        for (int i = 0; i < nbSportif; i++) {
            if (sportif[i].nom.equals(nom)) {
                for (int j = i; j < nbSportif - 1; j++) {
                    sportif[j] = sportif[j + 1];
                }
                sportif[nbSportif - 1] = null;
                nbSportif--;
                break;
            }
        }
    }

    public int totalCote() {
        int totalCote = 0;
        for (int i = 0; i < nbSportif; i++) {
            totalCote += sportif[i].cote;
        }
        return totalCote;
    }

    public int totalSalaire() {
        int totalSalaire = 0;
        for (int i = 0; i < nbSportif; i++) {
            totalSalaire += sportif[i].Salaire();
        }
        return totalSalaire;
    }

    @Override
    public String toString() {
        return "CentreSportif{" +
                "nom='" + nom + '\'' +
                ", sportif=" + Arrays.toString(sportif) +
                ", nbSportif=" + nbSportif +
                '}';
    }
}
