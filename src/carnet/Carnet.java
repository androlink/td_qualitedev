package src.carnet;

import src.entree.Entree;
import src.entree.Personne;
import src.entree.Societe;

import java.util.ArrayList;

public class Carnet {

    private final ArrayList<Entree> entrees = new ArrayList<>();

    public void ajoutEntrée(Entree e){
        entrees.add(e);
    }

    public boolean recherchePersonne(String s){
        boolean res=false;
        for(Entree e : entrees)if(e instanceof Personne)if(e.recherche(s))res = true;
        return res;
    }
    public boolean rechercheSociete(String s){
        boolean res=false;
        for(Entree e : entrees)if(e instanceof Societe)if(e.recherche(s))res= true;
        return res;
    }

}
