package src.test;

import src.carnet.Carnet;
import src.entree.Personne;
import src.entree.Societe;

public class TestSelection {


    public static void main(String[] args) {
        Carnet carnet = new Carnet();
        carnet.ajoutEntrée(new Societe("test"));
        String[] s = {"azer","uhgv"};
        carnet.ajoutEntrée(new Personne("lol",s));

        System.out.println(carnet.rechercheSociete("test"));
        System.out.println(carnet.recherchePersonne("uhgv"));
        System.out.println(carnet.recherchePersonne("uhgu"));


    }
}
