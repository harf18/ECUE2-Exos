package net.lecnam.ecue2.revisions.exo3;

import net.lecnam.ecue2.revisions.exo2.Employe;

import java.time.LocalDate;
import java.util.Arrays;

public class Emprunteur {
    String nom;
    String prenom;
    Medias[] medias;
    int nbMedias;

    public Emprunteur(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.medias = new Medias[10];
        this.nbMedias = 0;
    }

    @Override
    public String toString() {
        return "Emprunter{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", medias=" + Arrays.toString(medias) +
                '}';
    }

    public void ajout(Medias m, LocalDate dateDeRetour){
        if (nbMedias < 10) {
            m.setDateDeRetour(dateDeRetour);
            medias[nbMedias] = m;
            nbMedias++;
        }
    }

}
