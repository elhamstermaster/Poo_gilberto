package edu_gilberto_heredia.reto11.ui;

import edu_gilberto_heredia.reto11.process.ContadorPalabras;

import java.util.Scanner;

/**
 * Esta clase proporciona una interfaz de línea de comandos (CLI) para interactuar con el programa.
 */
public class CLI {
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Muestra el menú de idiomas para que el usuario elija.
     */
    public static void showIdiomMenu() {
        System.out.println("""
                Seleccione su idioma / Select your language:
                1. Español / Spanish
                2. Inglés / English""");
    }

    /**
     * Muestra el menú de libros disponibles en el idioma seleccionado.
     */
    private static void showBookMenu() {
        System.out.println(Idiomas.MENU);
        System.out.println(Idiomas.LIBROS);
        System.out.println(Idiomas.El_Hobbit);
        System.out.println(Idiomas.El_principito);
        System.out.println(Idiomas.El_Padrino);
        System.out.println(Idiomas.Libro_1984);
        System.out.println(Idiomas.Rebelion_en_la_granja);
        System.out.println("--------------------------------");
    }

    /**
     * Obtiene el nombre del archivo correspondiente al libro elegido por el usuario.
     *
     * @return El nombre del archivo del libro elegido.
     */
    private static String obtenerNombreArchivo() {
        int libro;
        try {
            libro = Integer.parseInt(scanner.nextLine());
            return switch (libro) {
                case 1 -> "el_hobbit.txt";
                case 2 -> "el_principito.txt";
                case 3 -> "el_padrino.txt";
                case 4 -> "1984.txt";
                case 5 -> "rebelion_en_la_granja.txt";
                default -> throw new IllegalArgumentException(Idiomas.ERROR);
            };
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(Idiomas.ERROR);
        }
    }

    /**
     * Método principal que guía al usuario a través del proceso de elegir idioma y libro, y muestra las estadísticas del libro seleccionado.
     */
    public static void elegirIdiomaYLibro() {
        showIdiomMenu();
        String idiomaSeleccionado = scanner.nextLine().toUpperCase();
        Idiomas.getInstance(idiomaSeleccionado);

        showBookMenu();
        String nombreArchivo = obtenerNombreArchivo();

        ContadorPalabras contador = new ContadorPalabras();

        System.out.println(Idiomas.PALABRAS_MAS_USADAS + nombreArchivo + Idiomas.SON);
        contador.contarPalabras.accept(nombreArchivo);

        long totalVocales = contador.contarVocales(nombreArchivo);
        System.out.println(Idiomas.VOCALES + nombreArchivo + Idiomas.SON + totalVocales);

        System.out.println(Idiomas.VOCALES_INICIO + nombreArchivo + Idiomas.SON);
        contador.imprimirPalabrasQueEmpiezanConVocal(nombreArchivo);

        System.out.println(Idiomas.IMPAR + nombreArchivo + Idiomas.SON);
        contador.imprimirPalabrasConNumeroImparDeLetras(nombreArchivo);

        String palabraMasLarga = contador.encontrarPalabraMasLarga(nombreArchivo);
        System.out.println(Idiomas.LARGA + nombreArchivo + "\n" + palabraMasLarga);

        String palabraMasCorta = contador.encontrarPalabraMasCorta(nombreArchivo);
        System.out.println(Idiomas.CORTA + nombreArchivo + "\n" + palabraMasCorta);

        String palabrasEspeciales = contador.criterioVocales(nombreArchivo);
        System.out.println(Idiomas.PALABRA_ESPECIAL + nombreArchivo + Idiomas.SON + "\n" + palabrasEspeciales);
    }
}
