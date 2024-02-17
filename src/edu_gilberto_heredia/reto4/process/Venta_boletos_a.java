package edu_gilberto_heredia.reto4.process;

import edu_gilberto_heredia.reto4.data.Boletos;
import edu_gilberto_heredia.reto4.ui.CLI;
import edu_gilberto_heredia.reto4.data.Pasajeros;

import java.util.ArrayList;
import java.util.Scanner;

public class Venta_boletos_a {
    public static void solicitarDatos() {
        System.out.println("Bienvenido a la solicitud de datos. Ingrese lo que se le pida a continuación.");

        //Crear un ArrayList para almacenar objetos Pasajeros
        ArrayList<Pasajeros> listaPasajeros = new ArrayList<>();

        //Primer comprador
        Scanner compradoresScanner = new Scanner(System.in);
        System.out.println("Comprador, ingresa tu nombre: ");
        String nombreComprador = compradoresScanner.next();

        //Crear un objeto Pasajeros para el comprador
        Pasajeros comprador = new Pasajeros(nombreComprador);
        //Agregar el comprador a la lista
        listaPasajeros.add(comprador);


        //Crear un ArrayList para almacenar objetos Boletos
        ArrayList<Boletos> listaBoletos = new ArrayList<>();

        //2. Boletos a comprar
        Scanner boletosScanner = new Scanner(System.in);
        System.out.println("Ingresa tu número de boletos a comprar:");
        int numBoletos = boletosScanner.nextInt();

        //Número de pasajero
        System.out.println("Ingresa tu número de pasajero:");
        int numPasajero = boletosScanner.nextInt();

        //Crear un objeto Boletos para el comprador
        Boletos boletosComprador = new Boletos(numBoletos, numPasajero);
        //Agregar los boletos del comprador a la lista
        listaBoletos.add(boletosComprador);

        int precioTotal = numBoletos * 1250;
        System.out.printf("Importe de su operación:\n" +
                "Nombre: %s.\n" +
                "Pasajero núm: %d.\n" +
                "Boletos adquiridos: %d.\n" +
                "Precio a pagar: $%d.\n", nombreComprador, numPasajero, numBoletos, precioTotal);

        //Preguntar si hay otro comprador
        Scanner otroCompradorScanner = new Scanner(System.in);
        System.out.println("¿Hay otro comprador? s (sí) / n (continuar en menú) / otra tecla para salir.");
        char siNoOtroComprador = otroCompradorScanner.next().toLowerCase().charAt(0);


        // Recursivamente solicitar nombres (s), o continuar (n), o salir (cualquier otra tecla)
        if (siNoOtroComprador == 's') {
            System.out.println();
            solicitarDatos();
        } else if (siNoOtroComprador == 'n') {
            CLI.launchProgVentaBoletos();
        } else {
            System.out.println("Gracias por usar el programa, vuelva pronto.");
        }
    }
}
