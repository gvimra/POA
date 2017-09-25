package Personnels;

import java.util.Date;

public class Professeur extends EnseignantPermanent{
    public Professeur(String nom, String prenom, String identifiant, Date daterec, double salaire, String domaineRech) {
        super(nom, prenom, identifiant, daterec, salaire, domaineRech);
    }
}
