package net.lecnam.ecue2.revisions.exo1;

public class CentreSportif {

    Sportif[] sportifs = new Sportif[30];
    int nbSportifs = 0;
    String nomDuStade;

    void ajout(Sportif sportif){
        sportifs[nbSportifs]=sportif;
        nbSportifs++;
    }

    CentreSportif(String nomDuStade){
        this.nomDuStade = nomDuStade;
    }



    int totalCotes() {
        int total = 0;
        for (int i = 0; i < nbSportifs; i++) {
            total += sportifs[i].cote;
        }
        return total;
    }

    float totalSalaires() {
        float total = 0;
        for (int i = 0; i < nbSportifs; i++) {
            total += sportifs[i].salaire();
        }
        return total;
    }

    void retirer(String nom) {
        int index = -1;
        for (int i = 0; i < nbSportifs; i++) {
            if (sportifs[i].nom.equals(nom)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return;
        }
        for (int i = index; i < nbSportifs - 1; i++) {
            sportifs[i] = sportifs[i + 1];
        }
        nbSportifs--;
        sportifs[nbSportifs] = null;
    }

}
