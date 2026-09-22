package net.lecnam.ecue2.revisions.exo2;

import java.util.Arrays;

public class Societe {

    String nom;
    Employe[] collaborateur = new Employe[50];
    int nbEmp = 0;

    public Societe(String nom){
        this.nom = nom;
    }

    public void add(Employe e){
        this.collaborateur[this.nbEmp] = e;
        nbEmp ++;
    }

    public String triEmploye(){
        String listeTri = "";
        Arrays.sort(collaborateur, 0, nbEmp);
        System.out.println(collaborateur[0]);
        for (int i = 0; i < nbEmp; i++){
            listeTri += collaborateur[i].getDesc() + "\n";
        }
        return listeTri;
    }

}
