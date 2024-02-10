package edu_gilberto_heredia.reto3;
import edu_gilberto_heredia.reto3.ui.CLI;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----Bienvenido al menú de tu diccionario personal-----");
        try {
            CLI.launchMenuDiccionario();
        } catch (Exception e) {
            System.out.println("Error inesperado... " + e);
        }
    }
}
