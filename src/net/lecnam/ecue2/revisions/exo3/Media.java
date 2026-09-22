package net.lecnam.ecue2.revisions.exo3;

public abstract class Media {

    String titre, auteur;
    String dateRetour = "";

    public Media(String titre, String auteur){
        this.titre = titre;
        this.auteur = auteur;
    }

    public void changeDateRetour(String dateRet){
        this.dateRetour = dateRet;
    }

    abstract String getInfosMedia();

}
