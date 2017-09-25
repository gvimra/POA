package Personnels;

import java.util.Date;

public class EnseignantTemporaire  extends Enseignant{

    public EnseignantTemporaire(String nom, String prenom, String identifiant, CDD Contrat) {
        super(nom, prenom, identifiant, contrat);
    }

    public Date fin() { return ((CDD)contrat).getfin();}
}
