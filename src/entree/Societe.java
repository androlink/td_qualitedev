package src.entree;

public class Societe implements  Entree {

    private String raisonSociale;

    public Societe(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    @Override
    public boolean recherche(String n) {
        return n.equals(raisonSociale);
    }

    @Override
    public String toString(Presentation p, Sens s) {
        return raisonSociale;
    }
}
