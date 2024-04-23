package edu_gilberto_heredia.reto11.ui;

import edu_gilberto_heredia.reto11.process.ContadorPalabras;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Clase que representa la interfaz de línea de comandos (CLI).
 */
public class CLI {
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Método que permite al usuario elegir el idioma y el libro.
     */
    public static void elegirIdiomaYLibro() {
        Scanner idiomaScanner = new Scanner(System.in);

        // Mostrar opciones de idioma
        System.out.println("""
                Seleccione su idioma / Select your language:
                1. Español / Spanish
                2. Inglés / English""");

        String idioma = obtenerIdiomaSeleccionado(idiomaScanner);

        // Obtener instancias de textos según el idioma seleccionado
        Idiomas.getInstance(idioma);

        // Mostrar menú de libros
        mostrarMenuLibros();

        // Obtener nombre del archivo del libro seleccionado
        String nombreArchivo = obtenerNombreArchivo();

        // Iniciar la aplicación con el libro seleccionado
        launchApp(nombreArchivo);
    }

    // Métodos auxiliares

    private static void mostrarMenuLibros() {
        System.out.println(Idiomas.MENU);
        System.out.println(Idiomas.LIBROS);
        System.out.println(Idiomas.El_Hobbit);
        System.out.println(Idiomas.El_principito);
        System.out.println(Idiomas.El_Padrino);
        System.out.println(Idiomas.Libro_1984);
        System.out.println(Idiomas.Rebelion_en_la_granja);
        System.out.println("--------------------------------");
    }

    private static String obtenerIdiomaSeleccionado(Scanner idiomaScanner) {
        int idiomaSeleccionado;
        try {
            idiomaSeleccionado = Integer.parseInt(idiomaScanner.nextLine());
            return getIdioma(idiomaSeleccionado);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(Idiomas.ERROR);
        }
    }

    private static String getIdioma(int idiomaSeleccionado) {
        switch (idiomaSeleccionado) {
            case 1:
                return "ESP"; // Español
            case 2:
                return "ENG"; // Inglés
            default:
                throw new IllegalArgumentException(Idiomas.ERROR);
        }
    }

    private static String obtenerNombreArchivo() {
        int libro;
        try {
            libro = Integer.parseInt(scanner.nextLine());
            switch (libro) {
                case 1:
                    return "el_hobbit.txt";
                case 2:
                    return "el_principito.txt";
                case 3:
                    return "el_padrino.txt";
                case 4:
                    return "1984.txt";
                case 5:
                    return "rebelion_en_la_granja.txt";
                default:
                    throw new IllegalArgumentException("Opción no válida / Invalid option");
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Opción inválida / Invalid option");
        }
    }

    /**
     * Método que inicia la aplicación.
     *
     * @param nombreArchivo El nombre del archivo del libro seleccionado.
     */
    public static void launchApp(String nombreArchivo) {
        ContadorPalabras contador = new ContadorPalabras(); // Instanciar un objeto de la clase ContadorPalabras

        // Mostrar las palabras más frecuentes del libro seleccionado
        System.out.println(Idiomas.PALABRAS_MAS_USADAS + nombreArchivo);
        List<Map.Entry<String, Integer>> listaPalabras = contador.contarPalabras(nombreArchivo);
        for (int i = 0; i < 10 && i < listaPalabras.size(); i++) {
            System.out.println((i + 1) + ". " + listaPalabras.get(i).getKey() + ": " + listaPalabras.get(i).getValue());
        }

        // Contar y mostrar el total de vocales en el libro seleccionado
        long totalVocales = contador.contarVocales(nombreArchivo);
        System.out.println(Idiomas.VOCALES + totalVocales);

        // Mostrar palabras que empiezan con vocal
        System.out.println(Idiomas.VOCALES_INICIO);
        contador.imprimirPalabrasQueEmpiezanConVocal(nombreArchivo);

        // Mostrar palabras con número impar de letras
        System.out.println(Idiomas.IMPAR);
        contador.imprimirPalabrasConNumeroImparDeLetras(nombreArchivo);

        // Encontrar la palabra más larga del libro
        String palabraMasLarga = contador.encontrarPalabraMasLarga(nombreArchivo);
        System.out.println(Idiomas.LARGA + palabraMasLarga);

        // Encontrar la palabra más corta del libro
        System.out.println(Idiomas.CORTA);
        String palabraMasCorta = ContadorPalabras.encontrarPalabraMasCorta(contador.contarPalabras(nombreArchivo).stream().map(Map.Entry::getKey).collect(Collectors.toList()));
        System.out.println(palabraMasCorta != null ? palabraMasCorta : "N/A");

        // Verificar si hay palabras que empiecen y terminen con vocal y tengan al menos 5 letras
        System.out.println(Idiomas.CINCO_LETRAS);
        List<String> palabras = contador.contarPalabras(nombreArchivo).stream().map(Map.Entry::getKey).collect(Collectors.toList());
        List<String> palabrasConVocalAlInicioYFinal = ContadorPalabras.criterioVocales(palabras);
        if (!palabrasConVocalAlInicioYFinal.isEmpty()) {
            palabrasConVocalAlInicioYFinal.forEach(System.out::println);
        } else {
            System.out.println(Idiomas.ERROR);
        }
    }
}

