package edu_gilberto_heredia.reto2.process;

import java.util.Scanner;

public class OperacionesCaja {

    // Costo caja básica.
    public static double costoCaja = 50, monto = 10_000;

    // a, b
    public static double egresosCompras, ingresosVentas;

    // c
    public static int numVentas, numCompras;

    // d
    public static int numOperaciones; // Final del programa

    // Método para opción a. Negocio compra a proveedor.
    public static double sacarCostoCompraCajas(double cajasPorComprar, double costoCaja) {
        return cajasPorComprar * costoCaja;
    }

    // Método para opción b. Negocio vende a cliente.
    public static double sacarCostoVentaCajas(double cajasPorVender, double costoCaja) {
        return cajasPorVender * costoCaja;
    }

    // Método para realizar la compra de cajas
    public static void comprarCajas() {
        Scanner numCompraScanner = new Scanner(System.in);

        System.out.println("Número de cajas por comprar al proveedor (c/u vale $50 MXN):");
        int cajasPorComprar = numCompraScanner.nextInt(); // Solo se pueden comprar cajas enteras

        // Cajas compradas
        System.out.println("Has ingresado: " + cajasPorComprar + " cajas.");

        double montoCompra = sacarCostoCompraCajas(cajasPorComprar, costoCaja);

        Scanner confirmarScannerA = new Scanner(System.in);
        System.out.println("¿Confirma que efectuará su compra? s/n");
        char confirmarA = confirmarScannerA.next().toLowerCase().charAt(0); // De minúsculas a mayúsculas

        switch (confirmarA) {
            case 's':
                System.out.printf("La compra realizada por %d cajas al costo de $50 MXN c/u es igual a $%.2f MXN\n", cajasPorComprar, montoCompra);
                monto -= montoCompra; // monto = monto - montoCompra;
                numCompras++;
                egresosCompras += montoCompra; // egresosCompras = egresosCompras + montoCompra;
                selectAgain();
                break;
            case 'n':
                launchCalculadoraCompraVenta();
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    // Otros métodos y clases necesarios

    // Ejemplo de método para seleccionar nuevamente
    public static void selectAgain() {
        //Implementa lógica para seleccionar nuevamente
    }

    // Ejemplo de método para lanzar la calculadora de compra y venta
    public static void launchCalculadoraCompraVenta() {
        // Implementa lógica para lanzar la calculadora de compra y venta
    }
}
