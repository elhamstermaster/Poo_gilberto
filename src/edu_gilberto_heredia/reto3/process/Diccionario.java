package edu_gilberto_heredia.reto3.process;

import edu_gilberto_heredia.reto3.ui.CLI;

import java.util.Scanner;


public class Diccionario {
    public static String[] palabras = new String[10]; //Array de 10 casillas, contadas del 0 al 9.
                                               //Para accesibilidad.


    public static void enlistarPalabrasA() {
        Scanner lectorPalabras = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingresa la palabra " + (i + 1) + ":"); //Simula debido a que es texto, pero no suma
                                                                       // directamente hasta las siguientes líneas.
            palabras[i] = lectorPalabras.next(); //La casilla 0 es igual a la lectura y así va...
        }
        CLI.launchMenuDiccionario();

    }


    public static void buscarCapturarSignificadosB(){
        String[] significados = new String [10]; //Array de 10 significados
        if (palabras.length == 0){
            emptyA();
        }
        else{
            System.out.println("Palabras almacenadas en el arreglo:");
            for (int i = 0; i < 10; i++) {
                System.out.println("Palabra " + (i + 1) + ": " + palabras[i]); //Igual...
                //Solo hice static el array de palabras porque se hará uso de eso que es externo aquí.
            }
        }

        /*
        solicitar al usuario que capture la palabra de la cual necesita su significado; si el usuario indica una palabra
        que no se encuentre en la lista, el programa deberá mostrar un mensaje donde se indique que la palabra no existe,
        en caso contrario, se deberá mostrar el significado de la palabra (segundo vector).
         */

        //Buscar la palabra, revisar si tiene significado ya o no y ponérselo, seguir revisando mañana.

        Scanner lectorSignificados = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingresa el significado de la palabra " + "\"" + palabras[i] + "\"" + ":"); //Despliega la palabra directamente
            significados[i] = lectorSignificados.next(); //La casilla 0 es igual a la lectura y así va...
        }

    }

    //public static void detallarC

    public static void emptyA(){ //Si se selecciona B y A no ha sido llenado.
            System.out.println("El array está vacío.");

            Scanner emptyAScanner = new Scanner(System.in);
            try {
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
            finally {
                //Cierra el Scanner manualmente
                emptyAScanner.close();
            }


    }


}
