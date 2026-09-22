package net.lecnam.ecue2.revisions.exo2;

import java.time.LocalDate;

public class Employe implements Comparable<Employe> {

    String nom;
    LocalDate dateDeNaissance;
    int salaire;
    LocalDate dateDEmbauche;

    public Employe(String nom, LocalDate dateDeNaissance, int salaire, LocalDate dateDEmbauche) {
        this.nom = nom;
        this.dateDeNaissance = dateDeNaissance;
        this.salaire = salaire;
        this.dateDEmbauche = dateDEmbauche;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "nom='" + nom + '\'' +
                ", dateDeNaissance=" + dateDeNaissance +
                ", salaire=" + salaire +
                ", dateDEmbauche=" + dateDEmbauche +
                '}';
    }

    public void augSalaire(int a) {
        this.salaire += a;
    }

    public int salaire() {
        return this.salaire;
    }

    public int compareTo(Employe autre) {
        return this.dateDEmbauche.compareTo(autre.dateDEmbauche);
    }
}