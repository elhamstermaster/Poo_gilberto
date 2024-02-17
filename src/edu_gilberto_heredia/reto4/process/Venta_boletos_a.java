package edu_gilberto_heredia.reto4.process;
import edu_gilberto_heredia.reto4.ui.CLI;
import edu_gilberto_heredia.reto4.data.Pasajeros1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Venta_boletos_a {
    public static void solicitarDatos() {
        System.out.println("Bienvenido a la solicitud de datos. Ingrese lo que se le pida a continuación.");

        //Crear una lista para almacenar objetos Pasajeros1
        List<Pasajeros1> listaPasajeros = new ArrayList<>();

        //Nombre de compradores
        Scanner compradoresScanner = new Scanner(System.in);
        System.out.println("Comprador, ingresa tu nombre: ");
        String nombreComprador = compradoresScanner.next();

        //Crear un objeto Pasajero1 para el comprador
        Pasajeros1 comprador = new Pasajeros1(nombreComprador);
        comprador.setNombre(nombreComprador);

        //Agregar el comprador a la lista
        listaPasajeros.add(comprador);

        //Preguntar si hay otro comprador
        Scanner otroCompradorScanner = new Scanner(System.in);
        System.out.println("¿Hay otro comprador? s/otra tecla para salir.");
        char siNoOtroComprador = otroCompradorScanner.next().toLowerCase().charAt(0);

        //Recursivamente solicitar datos para otro comprador si la respuesta es 's'
        if (siNoOtroComprador == 's') {
            solicitarDatos();
        } else {
            CLI.launchProgVentaBoletos();
        }

    }
}
