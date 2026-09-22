package net.lecnam.ecue2.revisions.exo2;

import java.time.LocalDate;
import java.util.Date;

public class Ingenieur extends Employe{
    int grade;

    public Ingenieur(String nom, LocalDate dateDeNaissance, int salaire, LocalDate dateDEmbauche, int grade) {
        super(nom, dateDeNaissance, salaire, dateDEmbauche);
        this.grade = grade;
    }

    public int salaire() {
        return salaire + (grade * 100);
    }

    public void changerGrade(int g){
        this.grade = g;
    }

    // 1 - Nom car le bonus de son grade n'est fais que en fonction du rang de son grade et nom en fonction de son salaire avant bonus
}
