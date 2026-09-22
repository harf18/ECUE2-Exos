package net.lecnam.ecue2.revisions.exo1;

public class Handballeur extends Sportif {

    public Handballeur(String nom, int cote, String description) {
        super(nom, cote, description);
    }

    public int Salaire(){
        return (cote*2)+1000;
    }
}
