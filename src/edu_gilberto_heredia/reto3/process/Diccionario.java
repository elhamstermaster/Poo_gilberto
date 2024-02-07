package edu_gilberto_heredia.reto3.process;

import java.util.Scanner;

public class Diccionario {
    public static void enlistarPalabrasA() {
        String[] palabras = new String[10]; //Array de 10 casillas, contadas del 0 al 9.
        Scanner lectorPalabras = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingresa la palabra " + (i + 1) + ":"); //Simula debido a que es texto, pero no suma
                                                                       // directamente hasta las siguientes líneas.
            palabras[i] = lectorPalabras.next(); //La casilla 0 es igual a la lectura y así va...
        }

        System.out.println("Palabras almacenadas en el arreglo:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Palabra " + (i + 1) + ": " + palabras[i]); //Igual...
        }
    }


    public static void buscarCapturarSignificadosB(){
        String [] significados = new String [9];
    }

    //public static void detallarC

}
