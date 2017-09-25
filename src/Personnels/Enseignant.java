package Personnels;

import java.util.Date;

public abstract class Enseignant extends Personnel{

    public Contrat contrat;

    public Enseignant(String nom, String prenom, String identifiant, Date daterec, double salaire) {
        super(nom, prenom, identifiant);
        this.contrat = contrat;
    }

}

