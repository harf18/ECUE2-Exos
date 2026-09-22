package net.lecnam.ecue2.revisions.exo2;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Societe societe = new Societe("Le CNAM");

        Employe employe1 = new Employe("Zackarie", LocalDate.of(2006, 1, 15), 800, LocalDate.of(2026, 9, 4));
        Employe employe2 = new Ingenieur("Yannis", LocalDate.of(2003, 11, 20), 1400, LocalDate.of(2026, 9, 3),2);

        societe.ajout(employe1);
        societe.ajout(employe2);

        System.out.println(societe.toString());

        System.out.println(employe1.salaire());
        System.out.println(employe2.salaire());

        employe1.augSalaire(2000);
        employe2.augSalaire(6000);

        System.out.println(employe1.salaire());
        System.out.println(employe2.salaire());

        societe.trierParDateEmbauche();

        System.out.println(societe.toString());
    }
}