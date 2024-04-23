package edu_gilberto_heredia.reto11;

import edu_gilberto_heredia.reto11.ui.CLI;

/**
 * Clase principal que inicia la aplicación
 */
public class Main {
    /**
     * Método principal que inicia la aplicación.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        try {
            CLI.elegirIdiomaYLibro();
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }
}