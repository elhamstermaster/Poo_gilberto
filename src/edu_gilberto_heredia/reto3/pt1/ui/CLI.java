package edu_gilberto_heredia.reto3.pt1.ui;

import edu_gilberto_heredia.reto3.pt1.process.Diccionario;

import java.util.Scanner;
//
public class CLI {
    public static void launchMenuDiccionario(){ //Arrancar el diccionario y opciones
        System.out.println("""
                Elige una opción:
                A. Enlistar palabras del diccionario.
                B. Buscar palabras en el diccionario.
                C. Detalle del diccionario.
                S. Finalizar programa.""");

            Scanner opcionScanner = new Scanner(System.in);
            char opcion = opcionScanner.next().toUpperCase().charAt(0);

            switch (opcion){
                case 'A':
                    System.out.println("\nTu diccionario está conformado por 10 palabras.");
                    Diccionario.enlistarPalabrasA();
                    break;
                case 'B':
                    Diccionario.buscarCapturarSignificadosB();
                    break;
                case 'C':
                    Diccionario.detallarC();
                    break;
                case 'S':
                    System.out.print("Gracias por hacer uso de tu diccionario personal, nos vemos luego.");
                    break;
                default:
                    System.out.println("Ingresa una opción válida.");
                    CLI.launchMenuDiccionario();
            }
    }
}
