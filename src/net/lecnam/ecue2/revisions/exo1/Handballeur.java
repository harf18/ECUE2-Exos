package net.lecnam.ecue2.revisions.exo1;

public class Handballeur extends Sportif {

    String nom;
    int cote;

    public Handballeur(String nom, int cote){
        this.nom = nom;
        this.cote = cote;
    }

    int getSalaire(){
        return (this.cote * 2) + 1000;
    }

    String getDesc(){
        return "Sport pratiqué : Handball \nNom : " + this.nom + " \nCote : " + this.cote + "\nSalaire : " + this.getSalaire();
    }

    String getNom(){
        return this.nom;
    }

    int getCote(){
        return this.cote;
    }

}
