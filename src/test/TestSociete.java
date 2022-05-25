package src.test;

import src.entree.Presentation;
import src.entree.Sens;
import src.entree.Societe;

public class TestSociete {
    public static void main(String[] args) {
        Societe societe = new Societe("954dfdz9dsd1");

        System.out.println(societe.toString());
        System.out.println(societe.toString(Presentation.COMPLET, Sens.PRENOMS_NOM));
        System.out.println(societe.getRaisonSociale());
        System.out.println(societe.recherche("4"));
    }
}
