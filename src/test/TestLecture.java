package src.test;

import src.carnet.Carnet;

public class TestLecture {
    public static void main(String[] args) {
        Carnet carnet = new Carnet();
        carnet.lectureFichier(System.getProperty("user.dir") + "\\src\\test\\test.txt");

        System.out.println(carnet.getEntrees());
    }
}
