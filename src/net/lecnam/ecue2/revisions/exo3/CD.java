package net.lecnam.ecue2.revisions.exo3;

public class CD extends Media {

    int nbTitres, duree;

    public CD(String titre, String auteur, int nbTitres, int duree){
        super(titre, auteur);
        this.nbTitres = nbTitres;
        this.duree = duree;
    }

    public String getInfosMedia(){
        return "CD | " + super.titre + " | " + super.auteur + " | " + this.nbTitres + " titres | " + this.duree + "secondes | A retourner le : " + super.dateRetour;
    }

}
