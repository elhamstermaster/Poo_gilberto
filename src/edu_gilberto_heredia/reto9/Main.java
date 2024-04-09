package edu_gilberto_heredia.reto9;

import edu_gilberto_heredia.reto9.ui.CLI;

/**
 * Clase principal que inicia la aplicación.
 */
public class Main {
    /**
     * Método principal que inicia la aplicación.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        try {
            CLI.launchApp(); // Llama al método para iniciar la aplicación en la interfaz de línea de comandos.
        } catch (Exception e) {
            System.out.println("Error" + e); // Captura cualquier excepción y muestra un mensaje de error.
        }
    }
}