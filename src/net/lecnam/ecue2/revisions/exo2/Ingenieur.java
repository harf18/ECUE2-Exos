package net.lecnam.ecue2.revisions.exo2;

public class Ingenieur extends Employe {

    int grade;

    public Ingenieur(String nom, String dateNaiss, double salaire, String dateEmb, int grade){
        super(nom, dateNaiss, salaire, dateEmb);
        this.grade = grade;
    }

    @Override
    public double getSalaire(){
        return super.salaire + this.grade * 100;
    }

    public void changeGrade(int newGrade){
        this.grade = newGrade;
    }

}

// Non car le salaire change indépendamment du bonus du grade