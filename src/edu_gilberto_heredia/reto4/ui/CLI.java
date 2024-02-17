package edu_gilberto_heredia.reto4.ui;

import edu_gilberto_heredia.reto4.process.VentaBoletosA;

import java.util.Scanner;

public class CLI {

    public static void launchProgVentaBoletos() {
        Scanner opcionScanner = new Scanner(System.in);

        do {
            System.out.println("""
                    Venta de boletos de unidades de transporte. El costo actual de los boletos es de $1250.50 MXN.
                    ---------------------------
                    A. Realizar venta de boleto.
                    B. Mostrar datos de la lista de ventas.
                    S. Finalizar programa.""");

            char opcion = opcionScanner.next().toUpperCase().charAt(0);

            switch (opcion) {
                case 'A':
                    try {
                        VentaBoletosA.solicitarDatos();
                    } catch (Exception e) {
                        System.out.println("Error: Ingresa un número entero válido.");
                    }
                    break;
                case 'B':
                    mostrarDatos();
                    break;
                case 'S':
                    System.out.println("Gracias por usar el programa, vuelva pronto.");
                    System.exit(0);
                default:
                    System.out.println("Escribe A, B o S.");
            }
        } while (true);
    }

    // Nueva función para mostrar datos
    private static void mostrarDatos() {
        VentaBoletosA.mostrarDatos();
    }
}
