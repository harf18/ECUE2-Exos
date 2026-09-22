package net.lecnam.ecue2.revisions.exo3;

import com.sun.management.UnixOperatingSystemMXBean;

import java.time.LocalDate;

public class Livre extends Medias{

    int nombreDePages;

    public Livre(String titre, String auteur, int nombreDePages) {
        super(titre, auteur);
        this.nombreDePages = nombreDePages;
    }
}
