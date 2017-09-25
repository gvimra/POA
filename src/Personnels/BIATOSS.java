package Personnels;

import java.util.Date;

public class BIATOSS extends Personnel {

    private Contrat contrat;

    public BIATOSS(String nom, String prenom, String identifiant, Contrat contrat) {
        super(nom, prenom, identifiant);
        this.contrat = contrat;
    }

    }

}
