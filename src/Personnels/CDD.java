package Personnels;

import java.util.Date;

public class CDD extends Contrat{

    private Date fin;

    public CDD(double salaire, Date debut, Date fin) {
        super(salaire, debut);
        this.fin = fin;
    }

    public Date getFin() {
        return fin;
    }
}
