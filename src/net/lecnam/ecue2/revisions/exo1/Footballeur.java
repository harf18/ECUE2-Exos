package net.lecnam.ecue2.revisions.exo1;

public class Footballeur extends Sportif {

    String nom;
    int cote;

    public Footballeur(String nom, int cote){
        this.nom = nom;
        this.cote = cote;
    }

    int getSalaire(){
        return (this.cote * this.cote * 1) + 1000;
    }

    String getDesc(){
        return "Sport pratiqué : Football \nNom : " + this.nom + " \nCote : " + this.cote + "\nSalaire : " + this.getSalaire();
    }

    String getNom(){
        return this.nom;
    }

    int getCote(){
        return this.cote;
    }

}
