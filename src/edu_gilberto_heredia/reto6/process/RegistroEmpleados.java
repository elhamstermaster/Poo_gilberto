package edu_gilberto_heredia.reto6.process;


import edu_gilberto_heredia.reto6.data.DatosEmpleados;

import java.util.ArrayList;

import java.util.Scanner;

public class RegistroEmpleados {
    private static ArrayList<DatosEmpleados> Datos = new ArrayList<>();

    public static void registrarEmpleados() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de empleados: ");
        int cantidadEmpleados = scanner.nextInt();
        scanner.nextLine();  //Consumir la línea en blanco después del entero

        for (int i = 0; i < cantidadEmpleados; i++) {
            System.out.println("Registro del empleado #" + (i + 1));

            // Solicitar al usuario ingresar los datos del empleado
            System.out.print("Nombre completo: ");
            String nombre = scanner.nextLine();

            System.out.print("Horas trabajadas: ");
            int horasTrabajadas = scanner.nextInt();
            scanner.nextLine(); //Consumir la línea en blanco después del entero

            System.out.print("Horas extras trabajadas: ");
            int horasExtrasTrabajadas = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Teléfono: ");
            int telefono = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Fecha de nacimiento (año): ");
            int fechaNacimiento = scanner.nextInt();
            scanner.nextLine();

            // Elegir la categoría del empleado
            System.out.println("Elija la categoría del empleado:");
            System.out.println("1. Empleado ventas");
            System.out.println("2. Administrador");
            System.out.println("3. Gerente");
            int opcionCategoria = scanner.nextInt();
            scanner.nextLine();  // Consumir la línea en blanco después del entero

            String categoria = "";

            switch (opcionCategoria) {
                case 1:
                    categoria = "EMPLEADO_VENTAS";
                    break;
                case 2:
                    categoria = "ADMINISTRADOR";
                    break;
                case 3:
                    categoria = "GERENTE";
                    break;
                default:
                    System.out.println("Opción no válida. Se asignará la categoría por defecto.");
                    // Puedes manejar la asignación de una categoría por defecto o lanzar una excepción, según tu diseño.
                    break;
            }

            // Crear una instancia de DatosEmpleados con los datos recopilados
            DatosEmpleados nuevoEmpleado = new DatosEmpleados(categoria, nombre, horasTrabajadas, horasExtrasTrabajadas, 0, 0, telefono, fechaNacimiento);

            // Agregar el nuevo empleado a la lista
            Datos.add(nuevoEmpleado);
        }

    // ...
    }
}
