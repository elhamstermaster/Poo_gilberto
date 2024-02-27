// CLI.java
package edu_gilberto_heredia.reto5.ui;

import edu_gilberto_heredia.reto5.data.Usuario;
import edu_gilberto_heredia.reto5.process.Medicamentos;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * La clase CLI proporciona una interfaz de línea de comandos para interactuar con el sistema de control de productos de farmacia.
 */
public class CLI {
    public static final Scanner scanner = new Scanner(System.in);

    /**
     * Inicia el programa de control de productos de farmacia y maneja las interacciones con el usuario.
     *
     * @param listaMedicamentos La lista de medicamentos registrados.
     * @param usuario           El usuario actual que utiliza el programa.
     */
    public static void launchProgFarmacia(List<Medicamentos> listaMedicamentos, Usuario usuario) {
        int opcion;
        do {
            mostrarMenu();
            opcion = obtenerOpcion();

            switch (opcion) {
                case 1:
                    registrarMedicamento(listaMedicamentos, usuario);
                    break;
                case 2:
                    mostrarMedicamentosRegistrados(listaMedicamentos, usuario);
                    break;
                case 3:
                    generarReporteFinal(listaMedicamentos, usuario);
                    System.out.println("Saliendo del registro. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción correcta.");
            }
        } while (opcion != 3);
    }

    /**
     * Muestra el menú de opciones disponibles en la interfaz de línea de comandos.
     */
    private static void mostrarMenu() {
        System.out.println("Seleccione una opción:");
        System.out.println("1. Registrar Medicamento");
        System.out.println("2. Mostrar Medicamentos Registrados");
        System.out.println("3. Salir del Registro");
    }

    /**
     * Obtiene la opción ingresada por el usuario.
     *
     * @return La opción seleccionada.
     */
    private static int obtenerOpcion() {
        System.out.print("Ingrese su elección: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Por favor, ingrese un número válido: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    /**
     * Registra un nuevo medicamento en la lista de medicamentos.
     *
     * @param listaMedicamentos La lista de medicamentos registrados.
     * @param usuario           El usuario que realiza el registro.
     */
    private static void registrarMedicamento(List<Medicamentos> listaMedicamentos, Usuario usuario) {
        // Código para registrar un nuevo medicamento...
    }

    /**
     * Muestra la información de los medicamentos registrados.
     *
     * @param listaMedicamentos La lista de medicamentos registrados.
     * @param usuario           El usuario que realiza la consulta.
     */
    private static void mostrarMedicamentosRegistrados(List<Medicamentos> listaMedicamentos, Usuario usuario) {
        // Código para mostrar la información de los medicamentos...
    }

    /**
     * Genera y muestra el reporte final de medicamentos registrados.
     *
     * @param listaMedicamentos La lista de medicamentos registrados.
     * @param usuario           El usuario que genera el reporte.
     */
    private static void generarReporteFinal(List<Medicamentos> listaMedicamentos, Usuario usuario) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String fechaGeneracion = dateFormat.format(new Date());

        System.out.println("Generando reporte final...");
        System.out.println("Reporte generado el " + fechaGeneracion);
        System.out.println("Registrado por: " + usuario.getNombreUsuario());
        System.out.println("Cantidad de productos en la lista: " + listaMedicamentos.size());

        for (Medicamentos medicamento : listaMedicamentos) {
            System.out.println("=============================");
            medicamento.mostrarInformacion();
            System.out.println("Precio de Venta: " + medicamento.getPrecioVenta());
            System.out.println("Registrado por: " + medicamento.getRegistradoPor());
        }
    }
}
