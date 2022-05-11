package src.entree;

public class Personne implements Entree{

    String nom="mac";
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
    public void setGenre(Genre g){
        this.genre=genre;
    }
    public Genre getGenre() {
        return genre;
    }

    @Override
    public String toString(Presentation p,Sens s) {

        String res="";
        switch (p) {
            case ABREGE -> {
                for (int i = 0; i < prenom.length; i++) res += prenom[i].toUpperCase().toCharArray()[0]+". ";
                res+=nom;
            }
            case SIMPLE -> {
                res+=genre+". ";
                res+=prenom[0]+" ";
                for (int i = 1; i < prenom.length; i++) res += prenom[i].toUpperCase().toCharArray()[0]+". ";
                res+=nom+" ";
                if(societe!=null)res+="("+societe+")";
            }
            case COMPLET -> {
                res+=genre+". ";
                for (int i = 0; i < prenom.length; i++) res += prenom[i]+" ";
                res+=nom+"\n";
                res+="societe: "+societe+"\n";
                res+="fonction: "+fonction;
            }
        }
        return res;
    }
}
