package edu_gilberto_heredia.evidencia3;

import edu_gilberto_heredia.evidencia3.ui.CLI;

public class Main {
    public static void main(String[] args) {
        try {
            CLI.elegirModoJuego();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
