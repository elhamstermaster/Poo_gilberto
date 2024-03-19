package edu_gilberto_heredia.reto7;

import edu_gilberto_heredia.reto7.ui.CLI;

/**
 * Clase principal que inicia la aplicación y muestra el menú de bienvenida.
 */
public class Main {
    public static void main(String[] args) {
        try {
            CLI.mostrarMenuBienvenida();
        } catch (Exception e){
            System.out.println("Error inesperado... " + e);
        }
    }
}
