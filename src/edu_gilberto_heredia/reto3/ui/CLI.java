package edu_gilberto_heredia.reto3.ui;

import edu_gilberto_heredia.reto3.process.Diccionario;

import java.util.Scanner;

public class CLI {
    public static void launchMenuDiccionario(){//
        System.out.println("""
                -----Bienvenido al menú de tu diccionario personal-----
                A. Enlistar palabras del diccionario.
                B. Buscar palabras en el diccionario.
                C. Detalle del diccionario.
                S. Finalizar programa.
                
                Selecciona una opción:\s""");

            Scanner opcionScanner = new Scanner(System.in);
            char opcion = opcionScanner.next().toUpperCase().charAt(0);

            switch (opcion){
                case 'A':
                    System.out.println("Tu diccionario está conformado por 10 palabras.");
                    Diccionario.enlistarPalabrasA();
                    break;
                case 'B':
                    Diccionario.buscarCapturarSignificadosB();
                    break;
            }
    }
}
