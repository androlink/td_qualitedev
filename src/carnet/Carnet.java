package src.carnet;

import src.entree.Entree;
import src.entree.Personne;
import src.entree.Societe;

import java.util.ArrayList;

public class Carnet {

    ArrayList<Entree> entrees = new ArrayList<>();

    public void ajoutEntrée(Entree e){
        entrees.add(e);
    }
    public Personne recherchePersonne(String s){
        for(Entree e : entrees)if(e instanceof Personne)if(e.recherche(s))return (Personne)e;
        return null;
    }
    public Societe rechercheSociete(String s){
        for(Entree e : entrees)if(e instanceof Societe)if(e.recherche(s))return (Societe)e;
        return null;
    }


}
