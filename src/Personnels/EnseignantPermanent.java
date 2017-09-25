package Personnels;

import java.util.Date;

public class EnseignantPermanent extends Enseignant{

    private String domaineRech;

    public EnseignantPermanent(String nom, String prenom, String identifiant, Date daterec, double salaire, String domaineRech) {
        super(nom, prenom, identifiant, daterec, salaire);
        this.domaineRech = domaineRech;
    }

    public String getDomaineRech() {
        return domaineRech;
    }
}
