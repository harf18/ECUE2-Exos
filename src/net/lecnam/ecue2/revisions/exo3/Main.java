package net.lecnam.ecue2.revisions.exo3;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Livre livre = new Livre("Le petit Prince", "A. St Exupery",150);
        CD cd = new CD("Izia", "Izia", 3,150);

        Emprunteur e = new Emprunteur("Arya", "Stark");

        e.ajout(livre,LocalDate.of(2018, 12, 20));
        e.ajout(cd,LocalDate.of(2018, 12, 20));

        System.out.println(e.toString());
    }

}
