package Personnels;

public abstract class Personnel {

    private String nom;
    private String prenom;
    private String identifiant;

    public Personnel(String nom, String prenom, String identifiant) {
        this.nom = nom;
        this.prenom = prenom;
        this.identifiant = identifiant;
    }

    @Override
    public String toString() {
        return prenom + " " + nom;
    }

    public String getNom() {
        return nom;
    }


    public String getPrenom() {
        return prenom;
    }

    public String getIdentifiant() {
        return identifiant;
    }

}
