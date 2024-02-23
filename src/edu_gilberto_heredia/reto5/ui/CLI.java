package edu_gilberto_heredia.reto5.ui;

import edu_gilberto_heredia.reto5.data.Usuario;
import edu_gilberto_heredia.reto5.process.Medicamentos;

import java.util.Scanner;

import static edu_gilberto_heredia.reto5.Main.listaMedicamentos;

public class CLI {
    private static Usuario usuario;

    public static void launchProgFarmacia() {
        System.out.println("Bienvenido al programa de control de productos de farmacia.");

        usuario = Usuario.registrarUsuario();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Registrar Medicamento");
            System.out.println("2. Mostrar Medicamentos");
            System.out.println("3. Salir");

            String input = scanner.nextLine();

            if (input.matches("\\d+")) {
                int opcion = Integer.parseInt(input);
                procesarOpcion(opcion);
            } else {
                System.out.println("Por favor, ingrese un número válido.");
            }
        }
    }

    private static void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                registrarMedicamento();
                break;
            case 2:
                for (Medicamentos medicamento : listaMedicamentos) {
                    System.out.println("Registrado por: " + medicamento.getRegistradoPor());
                    medicamento.mostrarInformacion();
                    System.out.println("=============================");
                }
                break;
            case 3:
                System.out.println("Saliendo del programa. ¡Hasta luego!");
                System.exit(0);
                break;
            default:
                System.out.println("Opción no válida. Intente de nuevo.");
        }
    }

    private static void registrarMedicamento() {
        // Implementación del método registrarMedicamento
    }
}
