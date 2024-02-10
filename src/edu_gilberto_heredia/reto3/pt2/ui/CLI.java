package edu_gilberto_heredia.reto3.pt2.ui;

import edu_gilberto_heredia.reto3.pt2.process.Interacciones;

import java.util.Scanner;

public class CLI {
    public static void launchMenu() {
        Scanner scanner = new Scanner(System.in);
        Interacciones interacciones = new Interacciones();

        System.out.println("Bienvenido al programa de conteo de números pares e impares en matrices.");
        int filas, columnas;

        do {
            System.out.print("Ingrese la cantidad de filas: ");
            filas = scanner.nextInt();

            System.out.print("Ingrese la cantidad de columnas: ");
            columnas = scanner.nextInt();

            if (filas != columnas) {
                System.out.println("Por favor, ingrese valores iguales para filas y columnas.");
            }

        } while (filas != columnas);

        interacciones.ejecutarProceso(filas, columnas);
    }
}

