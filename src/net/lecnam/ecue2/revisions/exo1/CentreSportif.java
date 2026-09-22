package net.lecnam.ecue2.revisions.exo1;

public class CentreSportif {

    Sportif[] listSportifs = new Sportif[30];
    String nom;
    int nbSportif = 0;

    public CentreSportif(String nom){
        this.nom = nom;
    }

    public void ajoutSportif(Sportif s){
        if(nbSportif < 30){
            listSportifs[nbSportif] = s;
            nbSportif += 1;
        } else {
            System.out.println("Erreur : le complexe ne peut pas accueillir plus de sportifs");
        }
    }

    public void retirerSportif(String name){
        int estRetire = 0;
        for (int i = 0; i < 30; i++){
            if (listSportifs[i] != null) {
                if (listSportifs[i].getNom().equals(name)) {
                    listSportifs[i] = null;
                    estRetire = 1;
                }
            }
        }
        if (estRetire == 1) {
            int espace = 0;
            for (int i = 0; i < 29; i++) {
                if (listSportifs[i] == null){
                    espace = 1;
                }
                listSportifs[i] = listSportifs[i + espace];
            }
            System.out.println("Le joueur a bien été retiré");
        } else {
            System.out.println("Le joueur n'a pas été trouvé");
        }
    }

    public String listerSportif(){
        String infos = "";
        for (int i = 0; i < 30; i++){
            if (this.listSportifs[i] != null) {
                infos += this.listSportifs[i].getDesc() + "\n\n";
            }
        }
        return infos;
    }

    public int getTotalSalaire(){
        int total = 0;
        for (int i = 0; i < 30; i++){
            if (this.listSportifs[i] != null) {
                total += this.listSportifs[i].getSalaire();
            }
        }
        return total;
    }

    public int getTotalCote(){
        int total = 0;
        for (int i = 0; i < 30; i++){
            if (this.listSportifs[i] != null) {
                total += this.listSportifs[i].getCote();
            }
        }
        return total;
    }

}
