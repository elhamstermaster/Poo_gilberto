package edu_gilberto_heredia.reto3;
import edu_gilberto_heredia.reto3.ui.CLI;

public class Main {
    public static void main(String[] args) {
        //Mover los arrays de palabras y significados para acá
        try {
            CLI.launchMenuDiccionario();
        } catch (Exception e) {
            System.out.println("Error inesperado... " + e);
        }
    }
}
