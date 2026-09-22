package net.lecnam.ecue2.revisions.exo3;

public class Main {

    public static void main(String[] args) {

        Livre livre = new Livre("Le petit Prince", "A. St Exupery", 150);
        CD cd = new CD("Izia", "Izia", 12, 2432);

        Emprunteur e = new Emprunteur("Arya", "Stark");

        // Emprunter le livre avec une date de retour au 20/12/2018
        e.emprunter(livre, "20/12/2018");
        // Emprunter le CD avec une date de retour au 20/12/2018
        e.emprunter(cd, "20/12/2018");

        // Voir les médias empruntés
        e.listerEmprunt();

    }
}
