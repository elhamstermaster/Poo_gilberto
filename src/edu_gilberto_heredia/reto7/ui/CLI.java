package edu_gilberto_heredia.reto7.ui;

import edu_gilberto_heredia.reto7.process.*;

import java.util.Scanner;

/**
 * Clase que maneja la interfaz de línea de comandos (CLI) para la aplicación de la calculadora.
 */
public class CLI {
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Muestra el menú de bienvenida y llama al método para mostrar el menú de la calculadora.
     */
    public static void mostrarMenuBienvenida() {
        System.out.println("""
                -----CALCULADORA ARITMÉTICA-----
                Bienvenido. Elija una de las opciones:
                a. Suma
                b. Resta
                c. Multiplicación
                d. División
                e. Módulo (residuo)
                f. Potencia
                g. Raíz
                h. Logaritmo
                -------------------------------""");
        mostrarMenuCalculadora();
    }

    /**
     * Muestra el menú de la calculadora y recoge la entrada del usuario.
     */
    public static void mostrarMenuCalculadora() {
        System.out.println("Operación aritmética:");
        char operacion = scanner.next().charAt(0);

        switch (operacion) {
            case 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h':
                realizarOperacion(operacion);
                break;
            default:
                System.out.println("Ingresa una opción válida.");
                mostrarMenuBienvenida();
        }
    }

    /**
     * Realiza la operación aritmética seleccionada por el usuario.
     * @param operacion Operación aritmética seleccionada.
     */
    private static void realizarOperacion(char operacion) {
        int a, b;
        if (operacion != 'g' && operacion != 'h') {
            a = obtenerNumero("Ingrese el primer valor: ");
            b = obtenerNumero("Ingrese el segundo valor: ");
        } else if (operacion == 'g') {
            a = obtenerNumero("Ingrese el valor del argumento: ");
            b = 0;
        }
        else { //Logaritmo
            a = obtenerNumero("Ingrese el valor del argumento: ");
            System.out.println("Ingrese el valor de la base:");
            b = scanner.nextInt();
        }

        OperacionAritmetica calculadora = null;
        switch (operacion) {
            case 'a':
                calculadora = new Suma();
                break;
            case 'b':
                calculadora = new Resta();
                break;
            case 'c':
                calculadora = new Multiplicacion();
                break;
            case 'd':
                calculadora = new Division();
                break;
            case 'e':
                calculadora = new Modulo();
                break;
            case 'f':
                calculadora = new Potencia();
                break;
            case 'g':
                calculadora = new Raiz();
                break;
            case 'h':
                calculadora = new Logaritmo();
                break;
        }

        try {
            if (calculadora != null) {
                int resultado = calculadora.calcular(a, b);
                System.out.println("El resultado de su operación es: " + resultado);
            } else {
                System.out.println("Operación no válida.");
            }
        } catch (Exception e) {
            System.out.println("Error al realizar la operación: " + e.getMessage());
        } finally {
            System.out.println("\nElija de nuevo con 's', o presione 'n' para salir de la aplicación.");
            char elegirSalir = scanner.next().charAt(0);
            if (elegirSalir == 'n') {
                System.out.println("Gracias por usar el programa, vuelva pronto.");
            } else if (elegirSalir == 's') {
                mostrarMenuCalculadora();
            }
        }
    }

    /**
     * Obtiene un número entero válido del usuario.
     * @param mensaje Mensaje que solicita el número al usuario.
     * @return Número entero ingresado por el usuario.
     */
    private static int obtenerNumero(String mensaje) {
        System.out.println(mensaje);
        while (!scanner.hasNextInt()) {
            System.out.println("Ingresa un número válido:");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
