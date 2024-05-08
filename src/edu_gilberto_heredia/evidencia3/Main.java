package edu_gilberto_heredia.evidencia3;
import edu_gilberto_heredia.evidencia3.ui.CLI;
public class Main {
    /**
     * Método principal que inicia la aplicación
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso)
     */
    public static void main(String[] args) {
        try {
            CLI.elegirIdiomaYNombre();
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }
}