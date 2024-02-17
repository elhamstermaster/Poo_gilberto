package edu_gilberto_heredia.reto4.ui;
import edu_gilberto_heredia.reto4.process.VentaBoletosA;
import java.util.Scanner;
public class CLI {

    /**
     * Método de opciones.
     * En A se muestra la venta y se compra el boleto, al final se muestra el importe y descripción personal.
     * En B se muestran los datos recabados de todos los pasajeros registrados.
     * Con S se finaliza el programa, o desde otro método con cualquier otra tecla se finaliza.
     */
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
                default:
                    System.out.println("Escribe A, B o S.");
            }
        } while (true);
    }

    /**
     * Nueva función para mostrar datos desde la clase de venta de boletos en process, se llama arriba
     */
    private static void mostrarDatos() {
        VentaBoletosA.mostrarDatos();
    }
}
