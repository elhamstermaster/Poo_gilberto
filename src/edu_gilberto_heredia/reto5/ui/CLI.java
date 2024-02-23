// CLI.java
package edu_gilberto_heredia.reto5.ui;

import edu_gilberto_heredia.reto5.data.Usuario;
import edu_gilberto_heredia.reto5.process.Medicamentos;

import java.util.Scanner;

import static edu_gilberto_heredia.reto5.Main.listaMedicamentos;

public class CLI {
    public static void launchProgFarmacia() {
        System.out.println("Bienvenido al programa de control de productos de farmacia.");

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Registrar/Iniciar Sesión");
            System.out.println("2. Mostrar Medicamentos");
            System.out.println("3. Salir");

            Scanner scanner = new Scanner(System.in);
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Usuario usuario = Usuario.registrarUsuario();
                    // Al registrar el usuario, almacenar su nombre en cada medicamento
                    for (Medicamentos medicamento : listaMedicamentos) {
                        medicamento.setRegistradoPor(usuario.getNombreUsuario());
                    }
                    break;
                case 2:
                    // Mostrar información de medicamentos
                    for (Medicamentos medicamento : listaMedicamentos) {
                        System.out.println("Registrado por: " + medicamento.getRegistradoPor());
                        medicamento.mostrarInformacion();
                        System.out.println("=============================");
                    }
                    break;
                case 3:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
