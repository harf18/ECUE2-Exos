package net.lecnam.ecue2.revisions.exo3;

import java.time.LocalDate;

public class Medias {
    String titre;
    String auteur;
    LocalDate dateDeRetour;

    public Medias(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
    }

    @Override
    public String toString() {
        return "Medias{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", date de retour= '" + dateDeRetour +
                '}';
    }

    public void setDateDeRetour(LocalDate dateDeRetour) {
        this.dateDeRetour = dateDeRetour;
    }
}
