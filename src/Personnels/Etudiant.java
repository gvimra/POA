package Personnels;

public class Etudiant extends Personnel{

    private String bourse;

    Etudiant(String nom, String prenom, String identifiant) {
        super(nom, prenom, identifiant);
        this.bourse = bourse;
    }

    public String getBourse() {
        return bourse;
    }

    public void setBourse(String bourse) {
        this.bourse = bourse;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "bourse='" + bourse + '\'' +
                '}';
    }

}
