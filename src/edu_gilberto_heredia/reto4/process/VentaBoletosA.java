package edu_gilberto_heredia.reto4.process;

import edu_gilberto_heredia.reto4.data.Boletos;
import edu_gilberto_heredia.reto4.data.Pasajeros;
import edu_gilberto_heredia.reto4.data.Tickets;
import edu_gilberto_heredia.reto4.ui.CLI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VentaBoletosA {
    private static int iNumPasajero = 1;
    private static Tickets tickets = new Tickets();

    public static void solicitarDatos() {
        System.out.println("Bienvenido a la solicitud de datos. Ingrese lo que se le pida a continuación.");

        Scanner compradoresScanner = new Scanner(System.in);
        System.out.printf("Comprador %d, ingrese su nombre: ", iNumPasajero);
        String nombreComprador = compradoresScanner.next();

        Pasajeros comprador = new Pasajeros(nombreComprador);
        Boletos boletosComprador = new Boletos();

        Scanner boletosScanner = new Scanner(System.in);
        System.out.println("Ingresa tu número de boletos a comprar:");
        int numBoletos = boletosScanner.nextInt();
        boletosComprador.agregarBoletos(numBoletos);

        tickets.agregarPasajero(comprador, boletosComprador);
        ticketImporte(nombreComprador, iNumPasajero);

        Scanner otroCompradorScanner = new Scanner(System.in);
        System.out.println("¿Hay otro comprador? s (sí) / n (continuar en menú) / otra tecla para salir.");
        char siNoOtroComprador = otroCompradorScanner.next().toLowerCase().charAt(0);

        if (siNoOtroComprador == 's') {
            System.out.println();
            iNumPasajero++;
            solicitarDatos();
        } else if (siNoOtroComprador == 'n') {
            CLI.launchProgVentaBoletos();
        } else {
            System.out.println("Gracias por usar el programa, vuelva pronto.");
            System.exit(0);
        }
    }

    public static void ticketImporte(String nombreComprador, int iNumPasajero) {
        double precioTotal = tickets.getBoletos(iNumPasajero).getNumBoletos() * 1250.50;
        System.out.printf("""
                Importe de su operación:
                Nombre: %s.
                Pasajero núm: %d.
                Boletos adquiridos: %s.
                Precio a pagar: $%.2f.
                """, nombreComprador, iNumPasajero, tickets.getBoletos(iNumPasajero).getListaBoletos(), precioTotal);
    }

    // Nueva función para mostrar datos
    public static void mostrarDatos() {
        System.out.println("Lista de pasajeros registrados:");
        tickets.mostrarListaPasajeros();

        double importeTotal = tickets.calcularImporteTotal();
        int totalPasajeros = tickets.getCantidadPasajeros();

        for (int i = 1; i <= totalPasajeros; i++) {
            Boletos boletosComprador = tickets.getBoletos(i);
            System.out.printf("Boletos del pasajero %d: %s\n", i, boletosComprador.getListaBoletos());
        }

        System.out.println("Importe total de la lista de boletos: $" + importeTotal);
        System.out.println("Cantidad total de pasajeros registrados: " + totalPasajeros);
    }
}
