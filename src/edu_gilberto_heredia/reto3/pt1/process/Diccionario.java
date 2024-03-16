package edu_gilberto_heredia.reto3.pt1.process;

import edu_gilberto_heredia.reto3.pt1.ui.CLI;

import java.util.Scanner;

/** */
public class Diccionario { //Clase del diccionario con respectivos métodos de opción y otro en caso de tener vacío el listado.

    public static String[] palabras = new String[10]; //Array de 10 casillas, contadas del 0 al 9.
                                               //Para accesibilidad.
    public static String[] significados = new String[10];

    public static int i = 0;

    /** */
    public static void enlistarPalabrasA() { //Opción A
        Scanner lectorPalabras = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingresa la palabra #" + (i + 1) + ":"); //Simula debido a que es texto, pero no suma
                                                                       // directamente hasta las siguientes líneas.
            palabras[i] = lectorPalabras.next(); //La casilla 0 es igual a la lectura y así va...
        }
        System.out.println();
        CLI.launchMenuDiccionario();
    }


    public static void buscarCapturarSignificadosB() { //Opción B
        boolean diccionarioVacio = true;

        for (i = 0; i < 10; i++) {
            if (palabras[i] != null) {
                diccionarioVacio = false;
                break;
            }
        }

        if (diccionarioVacio){
            System.out.println("No has llenado tu diccionario de palabras.");
            emptyA();
        }
        else{
            System.out.println("\nEstas son las palabras almacenadas en tu diccionario personal:");
            for (i = 0; i < 10; i++) {
                if (palabras[i] != null) {
                    System.out.println((i + 1) + ": " + palabras[i]);
                }
            }

            System.out.println("Ingresa textualmente la palabra a la que quieras dar un significado.");
            Scanner darSignificadoScanner = new Scanner(System.in);
            String palabraElegida = darSignificadoScanner.next();

            boolean palabraEncontrada = false;

            for (i = 0; i < 10; i++) {
                if (palabraElegida.equalsIgnoreCase(palabras[i])) {
                    palabraEncontrada = true;
                    System.out.println("Se encontró la palabra: \"" + palabras[i] + "\"" + ". Ingresa su significado.");

                    Scanner sigScanner = new Scanner(System.in);
                    significados[i] = sigScanner.next();

                    System.out.println("Significado de la palabra \"" + palabras[i] + "\" procesado. Elige o sal con otra tecla:\n" +
                            "a. Ingresar otro significado.\n" +
                            "b. Regresar al menú.");

                    char opcion = sigScanner.next().toLowerCase().charAt(0);
                    if (opcion == 'a'){
                        buscarCapturarSignificadosB();
                    }
                    else if (opcion == 'b') {
                        CLI.launchMenuDiccionario();
                        break;
                    }
                    else {
                        System.out.println();
                        CLI.launchMenuDiccionario();
                    }
                }
            }

            if (!palabraEncontrada) {
                System.out.println("Teclea una palabra que esté presente, por favor.");
                buscarCapturarSignificadosB();
            }
        }
    }

    public static void detallarC() { //Opción C, detalles
        for (i = 0; i < 10; i++) {
            if (palabras[i] != null && significados[i] != null) {
                int numLetras1 = palabras[i].length();
                int numLetras2 = significados[i].length();
                System.out.printf("\nPalabra %d: %s. %d letras.   -   Significado: %s. %d letras.",
                        (i + 1), palabras[i], numLetras1, significados[i], numLetras2);
                System.out.println();
                //Es lo mismo que  System.out.println("Palabra " + (i + 1) + ": " + palabras[i] + ". "  + numLetras1 + " letras. - " + "Sig: "
                //                                    + significados[i] + ". " + numLetras2 + " letras de significado.");
                //Formato de la cadena:
                //%d: Indica un valor numérico (en este caso, (i + 1)).
                //%s: Indica una cadena (en este caso, palabras[i] y significados[i]).
                //%n: Indica un salto de línea.

            } else if (palabras[i] == null || significados[i] == null) {
                System.out.println("Asegúrate de recabar los datos necesarios primero.");
                CLI.launchMenuDiccionario();
                break;
            }
        }
        System.out.println();
        CLI.launchMenuDiccionario();
    }

    public static void emptyA(){ //Si se selecciona B y A no ha sido llenado.
        try (Scanner emptyAScanner = new Scanner(System.in)) {
            System.out.println("¿Deseas enlistar tus palabras con la opción 'A'? s/n");
            char emptyA = emptyAScanner.next().toLowerCase().charAt(0);

            switch (emptyA) {
                case 's':
                    Diccionario.enlistarPalabrasA();
                    break;
                case 'n':
                    CLI.launchMenuDiccionario();
                    break;
                default:
                    System.out.println("Escribe s o n");
                    emptyA();
            }
        }
        //Cierra el Scanner manualmente
    }

}
