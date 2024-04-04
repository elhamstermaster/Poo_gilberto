package edu_gilberto_heredia.reto8.ui;

import edu_gilberto_heredia.reto7.process.*;

import java.util.Scanner;

/**
 * Esta clase proporciona una interfaz de línea de comandos para interactuar con las operaciones aritméticas
 */
public class CLI {
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Permite al usuario elegir el idioma del programa e inicia la aplicación.
     */
    public static void elegirIdioma() {
        System.out.println("""
                Selecciona el idioma del programa.
                Select the language of the program.
                a. Español.
                b. English.""");

        char idioma = scanner.next().charAt(0);

        if (idioma == 'a') {
            espanol();
        } else if (idioma == 'b') {
            english();
        } else {
            System.out.println("Idioma no reconocido. Language not recognized.");
            CLI.elegirIdioma();
        }
    }

    private static void espanol() {
        Textos textos = new Espanol();
        mostrarMenuBienvenida(textos);
    }

    private static void english() {
        Textos textos = new Ingles();
        mostrarMenuBienvenida(textos);
    }

    private static void mostrarMenuBienvenida(Textos textos) {
        System.out.println(textos.menu);
        mostrarMenuCalculadora(textos);
    }

    private static void mostrarMenuCalculadora(Textos textos) {
        System.out.println(textos.operaciones);
        char operacion = scanner.next().charAt(0);

        switch (operacion) {
            case 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h':
                realizarOperacion(operacion, textos);
                break;
            default:
                System.out.println(textos.opcionNoValida);
                mostrarMenuBienvenida(textos);
        }
    }

    private static void realizarOperacion(char operacion, Textos textos) {
        int a, b;
        if (operacion != 'g' && operacion != 'h') {
            a = obtenerNumero(textos.valorX, textos);
            b = obtenerNumero(textos.valorY, textos);
        } else if (operacion == 'g') {
            a = obtenerNumero(textos.radical, textos);
            b = obtenerNumero(textos.radicando, textos);
        } else { // Logaritmo
            a = obtenerNumero(textos.argumento, textos);
            System.out.println(textos.base);
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
                System.out.println(textos.resultado + resultado);
            } else {
                System.out.println(textos.operacionNoValida);
            }
        } catch (Exception e) {
            System.out.println(textos.error + e.getMessage());
        } finally {
            System.out.println(textos.elegirDeNuevoSalir);
            char elegirSalir = scanner.next().charAt(0);
            if (elegirSalir == 'n') {
                System.out.println(textos.gracias);
            } else if (elegirSalir == 's') {
                mostrarMenuCalculadora(textos);
            }
        }
    }

    private static int obtenerNumero(String mensaje, Textos textos) {
        System.out.println(mensaje);
        while (!scanner.hasNextInt()) {
            System.out.println(textos.numValido);
            scanner.next();
        }
        return scanner.nextInt();
    }
}
