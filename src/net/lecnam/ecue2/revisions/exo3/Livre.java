package net.lecnam.ecue2.revisions.exo3;

public class Livre extends Media {

    int nbPages;

    public Livre(String titre, String auteur, int nbPages){
        super(titre, auteur);
        this.nbPages = nbPages;
    }

    public String getInfosMedia(){
        return "Livre | " + super.titre + " | " + super.auteur + " | " + this.nbPages + " pages | A retourner le : " + super.dateRetour;
    }

}
