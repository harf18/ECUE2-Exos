package net.lecnam.ecue2.revisions.exo2;

public class Main {

    public static void main(String[] args) {

        // Créer une société
        Societe soc = new Societe("Les restes du coeur");

        // Ajouter un employé
        Employe emp = new Employe("Jonathan Cohu", "1982/12/12", 1455.12, "2025/12/01");
        // Ajouter un ingénieur de grade 2
        Ingenieur ing = new Ingenieur("Marion Coton de Ricard", "1983/05/11", 2855.12, "2023/11/04", 5);
        // (embauchés à des dates différentes, l'ingénieur avant l'employé)

        // Voir le salaire de l'employé
        System.out.println(emp.getSalaire());
        // Voir le salaire de l'ingénieur
        System.out.println(ing.getSalaire());

        // Augmenter le salaire de l'employé
        emp.augmentation(500);
        // Augmenter le grade de l'ingénieur
        ing.changeGrade(1);

        // Voir le salaire de l'employé
        System.out.println(emp.getSalaire());
        // Voir le salaire de l'ingénieur
        System.out.println(ing.getSalaire());

        // Lister les collaborateurs par date d'embauche croissante
        soc.add(emp);
        soc.add(ing);
        System.out.println(soc.triEmploye());

    }

}
