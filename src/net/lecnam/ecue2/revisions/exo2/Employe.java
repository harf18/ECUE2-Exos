package net.lecnam.ecue2.revisions.exo2;

public class Employe implements Comparable {

    String nom, dateNaiss, dateEmb;
    double salaire;

    public Employe(String nom, String dateNaiss, double salaire, String dateEmb){
        this.nom = nom;
        this.dateNaiss = dateNaiss;
        this.salaire = salaire;
        this.dateEmb = dateEmb;
    }

    public double getSalaire(){
        return this.salaire;
    }

    public void augmentation(double argent){
        this.salaire += argent;
    }



    public String getDesc(){
        return this.nom + " | " + this.dateNaiss + " | " +this.getSalaire() + " | " +this.dateEmb;
    }

    @Override
    public int compareTo(Object o) {
        Employe e = (Employe)o;
        return this.dateEmb.compareTo(e.dateEmb);
    }
}
