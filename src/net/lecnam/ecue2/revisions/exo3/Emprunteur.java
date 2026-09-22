package net.lecnam.ecue2.revisions.exo3;

public class Emprunteur {

    Media[] emprunt = new Media[10];
    String nom, prenom;
    int nbEmprunt = 0;

    public Emprunteur (String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }

    public void emprunter(Media m, String dateRet){
        m.changeDateRetour(dateRet);
        this.emprunt[this.nbEmprunt] = m;
        this.nbEmprunt++;
    }

    public void listerEmprunt(){
        for (int i = 0; i < nbEmprunt; i++){
            System.out.println(emprunt[i].getInfosMedia());
        }
    }

}
