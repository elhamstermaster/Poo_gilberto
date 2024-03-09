package edu_gilberto_heredia.reto6.process;

import edu_gilberto_heredia.reto6.data.DatosEmpleados;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase que maneja el registro de empleados y la generación de informes de nómina.
 */
public class RegistroEmpleados {
    /**
     * Lista que almacena los datos de los empleados registrados.
     */
    private ArrayList<DatosEmpleados> Datos = new ArrayList<>(); // Declarar aquí el ArrayList

    /**
     * Método para registrar empleados solicitando información al usuario.
     */
    public void registrarEmpleados() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de empleados: ");
        int cantidadEmpleados = scanner.nextInt();
        scanner.nextLine();  // Consumir la línea en blanco después del entero

        for (int i = 0; i < cantidadEmpleados; i++) {
            System.out.println("Registro del empleado #" + (i + 1));

            // Solicitar al usuario ingresar los datos del empleado
            System.out.print("Nombre completo: ");
            String nombre = scanner.nextLine();

            System.out.print("Horas trabajadas: ");
            int horasTrabajadas = scanner.nextInt();
            scanner.nextLine(); // Consumir la línea en blanco después del entero

            System.out.print("Horas extras trabajadas: ");
            int horasExtrasTrabajadas = scanner.nextInt();
            scanner.nextLine();

            if (horasTrabajadas < 0 || horasExtrasTrabajadas < 0) {
                System.out.println("Error: Las horas trabajadas y las horas extras no pueden ser negativas. Por favor, ingrese nuevamente.");
                i--; // Repetir el registro del mismo empleado
                continue;
            }

            System.out.print("Teléfono: ");
            String telefono = scanner.nextLine();

            System.out.print("Fecha de nacimiento (año): ");
            int fechaNacimiento = scanner.nextInt();
            scanner.nextLine();
            if (fechaNacimiento > 2005 || fechaNacimiento < 1960) {
                System.out.println("Por favor, ingrese nuevamente.");
                i--; //Repetir el registro
                continue;
            }

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
                    System.out.println("Error: Opción de categoría no válida. Por favor, ingrese nuevamente.");
                    i--; // Repetir el registro del mismo empleado
                    continue;
            }

            // Crear una instancia de DatosEmpleados con los datos recopilados
            DatosEmpleados nuevoEmpleado = new DatosEmpleados(categoria, nombre, horasTrabajadas, horasExtrasTrabajadas, 0, 0, telefono, fechaNacimiento);

            // Agregar el nuevo empleado a la lista
            Datos.add(nuevoEmpleado);
        }
        generarInformeNomina();
    }

    /**
     * Método para generar un informe de nómina con datos de la empresa y cada empleado registrado.
     */
    public void generarInformeNomina() {
        System.out.println("--- Reporte de nómina ---\n");

        // Cálculos de datos de la empresa. 2.
        double totalNomina = calcularTotalNomina();
        double totalSueldoNormal = calcularTotalSueldoNormal();
        double totalSueldoExtra = calcularTotalSueldoExtra();
        int totalHorasTrabajadas = calcularTotalHorasTrabajadas();
        int totalEmpleadosConHorasExtra = contarEmpleadosConHorasExtra();
        int totalEmpleadosSinHorasExtra = contarEmpleadosSinHorasExtra();
        int totalHorasExtraTrabajadas = calcularTotalHorasExtraTrabajadas();

        // Mostrar resultados
        System.out.println("CANTIDAD DE EMPLEADOS: " + Datos.size() + "\n");

        // Mostrar datos de cada empleado. 1.
        for (int i = 0; i < Datos.size(); i++) {
            DatosEmpleados empleado = Datos.get(i);
            System.out.println((i + 1) + ". " + empleado.getNombre() + " - Categoría: " + empleado.getCategoria() + "\n" +
                    "Sueldo base: $" + empleado.getSueldoBase() + "\n" +
                    "Horas trabajadas: " + empleado.getHoras() + "\n" +
                    "Horas extra: " + empleado.getHorasExtra() + "\n" +
                    "Pago neto: $" + (empleado.getHoras() * empleado.getSueldoBase() + empleado.getHorasExtra() * empleado.getSueldoExtra()) + "\n");
        }

        // Mostrar datos de la empresa
        System.out.println("\nDATOS DE LA EMPRESA (hacia todos los empleados):\n" +
                "Pago total nómina: $" + totalNomina + "\n" +
                "Pago total horas trabajadas: $" + totalSueldoNormal + "\n" +
                "Pago total horas extra: $" + totalSueldoExtra + "\n" +
                "Total de horas trabajadas: " + totalHorasTrabajadas + "\n" +
                "Total de empleados con horas extra: " + totalEmpleadosConHorasExtra + "\n" +
                "Total de empleados sin horas extra: " + totalEmpleadosSinHorasExtra + "\n" +
                "Total de horas extra trabajadas: " + totalHorasExtraTrabajadas + "\n");
    }

    // Métodos de cálculo
    private double calcularTotalNomina() {
        double totalNomina = 0;
        for (DatosEmpleados empleado : Datos) {
            totalNomina += empleado.getHoras() * empleado.getSueldoBase() + empleado.getHorasExtra() * empleado.getSueldoExtra();
        }
        return totalNomina;
    }

    private double calcularTotalSueldoNormal() {
        double totalSueldoNormal = 0;
        for (DatosEmpleados empleado : Datos) {
            totalSueldoNormal += empleado.getHoras() * empleado.getSueldoBase();
        }
        return totalSueldoNormal;
    }

    private double calcularTotalSueldoExtra() {
        double totalSueldoExtra = 0;
        for (DatosEmpleados empleado : Datos) {
            totalSueldoExtra += empleado.getHorasExtra() * empleado.getSueldoExtra();
        }
        return totalSueldoExtra;
    }

    private int calcularTotalHorasTrabajadas() {
        int totalHorasTrabajadas = 0;
        for (DatosEmpleados empleado : Datos) {
            totalHorasTrabajadas += empleado.getHoras() + empleado.getHorasExtra();
        }
        return totalHorasTrabajadas;
    }

    private int contarEmpleadosConHorasExtra() {
        int totalEmpleadosConHorasExtra = 0;
        for (DatosEmpleados empleado : Datos) {
            if (empleado.getHorasExtra() > 0) {
                totalEmpleadosConHorasExtra++;
            }
        }
        return totalEmpleadosConHorasExtra;
    }

    private int contarEmpleadosSinHorasExtra() {
        return Datos.size() - contarEmpleadosConHorasExtra();
    }

    private int calcularTotalHorasExtraTrabajadas() {
        int totalHorasExtraTrabajadas = 0;
        for (DatosEmpleados empleado : Datos) {
            totalHorasExtraTrabajadas += empleado.getHorasExtra();
        }
        return totalHorasExtraTrabajadas;
    }
}
