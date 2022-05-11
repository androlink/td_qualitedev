package test;

import src.entree.Genre;
import src.entree.Personne;
import src.entree.Presentation;
import src.entree.Societe;

public class TestPersonne {

    public static void main(String[] args) {
        String[] p={"bob","harry","michel"};
        Personne personne = new Personne("mario",p);
        personne.setFonction("weeeee");
        personne.setSociete(new Societe("BzzBzzFly"));
        personne.setGenre(Genre.HOMME);

        System.out.println(personne.toString(Presentation.ABREGE,null));
        System.out.println(personne.toString(Presentation.SIMPLE,null));
        System.out.println(personne.toString(Presentation.COMPLET,null));

    }
}
