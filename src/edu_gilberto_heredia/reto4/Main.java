package edu_gilberto_heredia.reto4;
import edu_gilberto_heredia.reto4.ui.CLI;
//Recordar meter comentarios a javadocs
public class Main {
    public static void main(String[] args) {
        try {
            CLI.launchProgVentaBoletos();
        } catch (Exception e) {
            System.out.println("Error inesperado... " + e);
        }

    }
}