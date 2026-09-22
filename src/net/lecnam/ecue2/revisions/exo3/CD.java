package net.lecnam.ecue2.revisions.exo3;

import java.time.LocalDate;

public class CD extends Medias{

    int nombreDeTitres;
    int dureeSeconde;

    public CD(String titre, String auteur, int nombreDeTitres, int dureeSeconde) {
        super(titre, auteur);
        this.nombreDeTitres = nombreDeTitres;
        this.dureeSeconde = dureeSeconde;
    }
}
