package edu_gilberto_heredia.evidencia3.ui;

import java.util.Scanner;

public class CLI {
    public static boolean seleccionarModoJuego(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al juego de tres en raya!");
        System.out.println("Seleccione una opcion: ");
        System.out.println("1. Jugar contra otra persona");
        System.out.println("2. Jugar contra la computadora");

        int opcion = scanner.nextInt();

        if (opcion == 1){
            return false;
        } else if (opcion == 2) {
            return true;
        }else {
            System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            return seleccionarModoJuego();
        }
    }
}