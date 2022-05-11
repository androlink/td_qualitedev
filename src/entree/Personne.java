package src.entree;

public class Personne implements Entree{

    String nom="mac";
    //fixme tableau to arrayList
    String[] prenom={"big"};
    Genre genre;
    Personne conjoin;
    String societe;
    String fonction;

    public Personne(){
    }
    public Personne(String nom,String[] prenom){
        this.nom=nom;
        this.prenom=prenom;
    }

    @Override
    public boolean recherche(String n) {
        return false;
    }
    public void setSociete(String societe){
        this.societe=societe;
    }
    public void setFonction(String fonction){
        this.fonction=fonction;
    }

    @Override
    public String toString(Presentation p,Sens s) {
        String nom="";
        String prenoms="";
        String res="";
        switch (p) {
            case ABREGE -> {
                for (int i = 0; i < prenom.length; i++) prenoms += prenom[i].toUpperCase().toCharArray()[0]+". ";
                res=prenoms+nom;
            }
            case SIMPLE -> {
                res+=genre+". ";
                res+=prenom[0]+" ";
                for (int i = 1; i < prenom.length; i++) prenoms += prenom[i].toUpperCase().toCharArray()[0]+". ";
                res+=nom+" ";
                if(societe!=null)res+="("+societe+")";
            }
            case COMPLET -> {
                res+=genre+". ";
                for (int i = 0; i < prenom.length; i++) prenoms += prenom[i]+" ";
                res+=nom+" ";
                res+="societe "+societe;
                res+="fonction"+fonction;
            }
        }
        return res;
    }
}
