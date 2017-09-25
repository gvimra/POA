package Personnels;

import java.util.Date;

public abstract class Contrat {

    private double salaire;
    private Date debut;

    public Contrat(double salaire, Date debut) {
        this.salaire = salaire;
        this.debut = debut;
    }



}
