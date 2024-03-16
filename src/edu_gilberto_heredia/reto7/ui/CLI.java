package edu_gilberto_heredia.reto7.ui;

import edu_gilberto_heredia.reto7.process.*;

import java.util.Scanner;

public class CLI {
    private static final Scanner scanner = new Scanner(System.in);

    public static void mostrarMenuBienvenida() {
        System.out.println("-----CALCULADORA ARITMÉTICA-----\n" +
                "Bienvenido. Elija una de las opciones:\n" +
                "a. Suma\n" +
                "b. Resta\n" +
                "c. Multiplicación\n" +
                "d. División\n" +
                "e. Módulo (residuo)\n" +
                "f. Potencia\n" +
                "g. Raíz\n" +
                "h. Logaritmo\n" +
                "-------------------------------");
        mostrarMenuCalculadora();
    }

    public static void mostrarMenuCalculadora() {
        System.out.println("Operación aritmética:");
        char operacion = scanner.next().charAt(0);

        switch (operacion) {
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
                realizarOperacion(operacion);
                break;
            default:
                System.out.println("Ingresa una opción válida.");
                mostrarMenuBienvenida();
        }
    }

    private static void realizarOperacion(char operacion) {
        int a, b;
        if (operacion != 'g' && operacion != 'h') {
            a = obtenerNumero("Ingrese el primer valor: ");
            b = obtenerNumero("Ingrese el segundo valor: ");
        } else {
            a = obtenerNumero("Ingrese el valor del argumento: ");
            b = 0; // Para la raíz cuadrada y el logaritmo, el segundo valor es irrelevante
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
                int baseLogaritmo = obtenerNumero("Ingrese el valor de la base del logaritmo: ");
                calculadora = new Logaritmo(baseLogaritmo);
                break;
        }

        try {
            int resultado = calculadora.calcular(a, b);
            System.out.println("El resultado de su operación es: " + resultado);
            System.out.println("\nElija de nuevo con 's', o presione 'n' para salir de la aplicación.");
            char elegirSalir = scanner.next().charAt(0);
            if (elegirSalir == 'n') {
                System.out.println("Gracias por usar el programa, vuelva pronto.");
            } else if (elegirSalir == 's') {
                mostrarMenuCalculadora();
            }
        } catch (Exception e) {
            System.out.println("Error al realizar la operación: " + e.getMessage());
        }
    }

    private static int obtenerNumero(String mensaje) {
        System.out.println(mensaje);
        while (!scanner.hasNextInt()) {
            System.out.println("Ingresa un número válido:");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        mostrarMenuBienvenida();
    }
}
