package edu_gilberto_heredia.reto5;
import edu_gilberto_heredia.reto5.ui.CLI;

public class Main {
    public static void main(String[] args) {
        try {
            CLI.launchProgFarmacia();
        } catch (Exception e) {
            System.out.println("Error inesperado... " + e.getMessage());
        }
    }
}
