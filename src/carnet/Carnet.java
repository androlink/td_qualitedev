package src.carnet;

import src.entree.Entree;
import src.entree.Personne;
import src.entree.Societe;
import src.entree.Genre;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

import java.util.ArrayList;

public class Carnet {



    private final ArrayList<Entree> entrees;
    private final ArrayList<Entree> selectionnees;

    public Carnet() {
        entrees = new ArrayList<>();
        selectionnees = new ArrayList<>();
    }
  
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

    public ArrayList<Entree> getEntrees() {
        return entrees;
    }

    public ArrayList<Entree> getSelectionnees() {
        return selectionnees;
    }

    public void lectureFichier(String path) {
        File file;
        BufferedReader bufferedReader;

        try {
            file = new File(path);
            bufferedReader = new BufferedReader(new FileReader(file));
        } catch(Exception e) {
            System.out.println("Erreur lors de l'ouverture du fichier.");
            return;
        }

        String read;
        try {
            while((read = bufferedReader.readLine()) != null) {
                parseLine(read);
            }
        } catch (Exception e) {
            System.out.println("Erreur lors de l'extraction des données.");
        }
    }

    private void parseLine(String line) {
        String[] splitted;
        splitted = line.split(";");

        if (splitted[1].equals("PERSONNE")) {
            Personne personne = new Personne(splitted[3], splitted[2].split(","));
            personne.setGenre(parseGenre(splitted[4]));
            personne.setFonction(splitted[7]);

            entrees.add(personne);
        } else {
            Societe societe = new Societe(splitted[2]);
            entrees.add(societe);
        }
    }

    private Genre parseGenre(String genre) {
        Genre toReturn = null;

        if (genre.equals("H")) {
            toReturn = Genre.HOMME;
        }
        if (genre.equals("F")) {
            toReturn = Genre.FEMME;
        }

        return toReturn;
    }
}
