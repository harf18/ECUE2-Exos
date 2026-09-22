package net.lecnam.ecue2.revisions.exo1;

public class CentreSportif {
    String nom;
    Sportif[] sportifs = new Sportif[30];
    int nbSportifs = 0;

    public CentreSportif(String nom) {
        this.nom = nom;
    }

    void ajout(Sportif sportif) {
        if (sportif == null) return;
        if (nbSportifs >= 30) return;
        for (int i = 0; i < 30;i++) {
            if (sportifs[i] == null) {
                sportifs[i] = sportif;
                break;
            };
        }
        nbSportifs++;
    }

    void retire(String nom) {
        for (int i = 0; i < 30;i++) {
            if (sportifs[i].nom.equals(nom)) {
                sportifs[i] = null;
                break;
            };
        }
        nbSportifs--;
    }

    double sommeCote() {
        double sumCote = 0;
        for (Sportif sportif : sportifs) {
            if (sportif != null) {
                sumCote += sportif.cote;
            }
        }
        return sumCote;
    }

    double sommeSalaire() {
        double sumSalaire = 0;
        for (Sportif sportif : sportifs) {
            if (sportif != null) {
                sumSalaire += sportif.retourneSalaire();
            }
        }
        return sumSalaire;
    }

    @Override
    public String toString() {
        String sportifsPresent = "";
        for (Sportif sportif : sportifs) {
            if (sportif != null) {
                sportifsPresent += sportif + "\n";
            }
        }
        return sportifsPresent;
    }
}
