package edu_gilberto_heredia.reto3.process;

import edu_gilberto_heredia.reto3.ui.CLI;

import java.util.Scanner;


public class Diccionario {
    //Private string...?
    public static String[] palabras = new String[10]; //Array de 10 casillas, contadas del 0 al 9.
                                               //Para accesibilidad.
    public static String[] significados = new String[10];

    public static void enlistarPalabrasA() {
        //Para ver la opción de decirle al usuario que su diccionario está lleno ya.

        Scanner lectorPalabras = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingresa la palabra " + (i + 1) + ":"); //Simula debido a que es texto, pero no suma
                                                                       // directamente hasta las siguientes líneas.
            palabras[i] = lectorPalabras.next(); //La casilla 0 es igual a la lectura y así va...
        }
        CLI.launchMenuDiccionario();

    }


    public static void buscarCapturarSignificadosB(){
        if (palabras[0] == null){
            System.out.println("No has llenado tu diccionario de palabras.");
            emptyA();
        }
        else{
            System.out.println("Estas son las palabras almacenadas en tu diccionario personal:");
            for (int i = 0; i < 10; i++) {
                System.out.println((i + 1) + ": " + palabras[i]); //Igual...
                //Solo hice static el array de palabras porque se hará uso de eso que es externo aquí.
            }
        }

        /*
        solicitar al usuario que capture la palabra de la cual necesita su significado; si el usuario indica una palabra
        que no se encuentre en la lista, el programa deberá mostrar un mensaje donde se indique que la palabra no existe,
        en caso contrario, se deberá mostrar el significado de la palabra (segundo vector).
         */

        //Buscar la palabra, revisar si tiene significado ya o no y ponérselo, seguir revisando mañana.
        System.out.println("Ingresa textualmente la palabra a la que quieras dar un significado.");
        Scanner darSignificadoScanner =  new Scanner(System.in);
        String palabraElegida = darSignificadoScanner.next();


        for (int i = 0; i < 10; i++) {
            if (palabraElegida.equalsIgnoreCase(palabras[i])) {
                //Acciones específicas para la palabra encontrada en la posición i
                System.out.println("Se encontró la palabra: " + "\"" + palabras[i] + "\"");

                Scanner sigScanner = new Scanner(System.in);
                    System.out.println("Ingresa el significado de la palabra " + "\"" + palabras[i] + "\"" + ":"); //Despliega la palabra directamente
                    significados[i] = sigScanner.next();
                System.out.println("Significado de la palabra " + palabras[i] + " procesado. Elige una opción.\n" +
                        "a. Ingresar otro significado.\n" +
                        "b. Regresar al menú.");

                char otroSigScanner = sigScanner.next().toLowerCase().charAt(0);
                if(otroSigScanner == 'a'){
                    buscarCapturarSignificadosB();
                }
                else if(otroSigScanner == 'b'){
                    CLI.launchMenuDiccionario();
                }

                if(!palabraElegida.equalsIgnoreCase(palabras[i])){
                    System.out.println("Teclea una palabra que esté presente, por favor.");
                    buscarCapturarSignificadosB();
                }

            }//if dentro de for

        }//for

    }

    public static void detallarC(){ //Falta retocar, el ciclo for puede dar problemas, quiero que salga el print primero en caso de ser validada
                                    //la opción, y que si no es válida, saque un mensaje de error y redirija, el ciclo for ostruye eso un poco.
        // Imprimir palabra, definición y num de letras de cada palabra
        for (int i = 0; i < 10; i++) {
            if (palabras[i] != null && significados[i] != null) {
                int numeroLetras = palabras[i].length();
                System.out.println((i + 1) + ": " + palabras[i] + " - "  + significados[i] + " - " + numeroLetras + ".");
            }
            else if(palabras[i] == null || significados[i] == null){
                CLI.launchMenuDiccionario();
            }
        }

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

    public static void filledA(){

    }

    public static void palabraElegida(){

    }


}
