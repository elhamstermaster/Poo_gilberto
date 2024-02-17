package edu_gilberto_heredia.reto4.ui;

import edu_gilberto_heredia.reto4.process.Venta_boletos_a;

import java.util.Scanner;

public class CLI {
    //El arraylist simula una lista enlazada. El arrayist se comporta como lista pero tiene un arreglo
    //internamente.
    public static void launchProgVentaBoletos(){
        System.out.println("""
                Venta de boletos de unidades de transporte. El costo actual de los boletos es de $1250.50 MXN.
                ---------------------------
                A. Realizar venta de boleto.
                B. Mostrar datos de la lista de ventas.
                S. Finalizar programa.""");

        //Leer opción
        Scanner opcionScanner = new Scanner(System.in);
        char opcion = opcionScanner.next().toUpperCase().charAt(0);

        switch (opcion) {
            case 'A':
                try {
                    //Realizar venta de boleto
                    Venta_boletos_a.solicitarDatos();

                } catch (Exception e) {
                    System.out.println("Error: Ingresa un número entero válido.");
                    //();
                }
                break;
            case 'B':
                //B. Mostrar datos de la lista de ventas
                //();
                break;
            case 'S':
                //Finalizar programa
                System.out.println("Gracias por usar el programa, vuelva pronto.");
                break;
            default:
                //Al escribir una letra no válida
                System.out.println("Escribe A, B o S.");
                launchProgVentaBoletos();
        }

    }

}
