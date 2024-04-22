package edu_gilberto_heredia.reto11.ui;

import edu_gilberto_heredia.reto11.process.ContadorPalabras;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Clase que representa la interfaz de línea de comandos (CLI).
 */
public class CLI {
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Método que permite al usuario elegir el idioma.
     */
    public static void elegirIdioma() {
        Scanner idiomaScanner = new Scanner(System.in);

        System.out.println("""
                Seleccione su idioma / Select your language:
                1. Español / Spanish
                2. Inglés / English""");

        String idioma = obtenerIdiomaSelec(idiomaScanner);

        Idiomas idiomas = Idiomas.getInstance(idioma);
        System.out.println(idiomas.getMenu());
    }

    private static String obtenerIdiomaSelec(Scanner idiomaScanner) {
        int idiomaSeleccionado;
        try {
            idiomaSeleccionado = Integer.parseInt(idiomaScanner.nextLine());
            return getIdioma(idiomaSeleccionado);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Opción inválida / Invalid option");
        }
    }

    private static String getIdioma(int idiomaSeleccionado) {
        switch (idiomaSeleccionado) {
            case 1:
                return "ES"; // Español
            case 2:
                return "ENG"; // Inglés
            default:
                throw new IllegalArgumentException("Idioma no disponible / Language not available");
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
     */
    public static void launchApp() {
        elegirIdioma();

        String nombreArchivo = obtenerNombreArchivo();
        ContadorPalabras contador = new ContadorPalabras(); // Instanciar un objeto de la clase ContadorPalabras

        // Mostrar las palabras más frecuentes del libro seleccionado
        System.out.println("Palabras más frecuentes:");
        List<Map.Entry<String, Integer>> listaPalabras = contador.contarPalabras(nombreArchivo);
        for (int i = 0; i < 10 && i < listaPalabras.size(); i++) {
            System.out.println((i + 1) + ". " + listaPalabras.get(i).getKey() + ": " + listaPalabras.get(i).getValue());
        }

        // Contar y mostrar el total de vocales en el libro seleccionado
        long totalVocales = contador.contarVocales(nombreArchivo);
        System.out.println("\nEl total de vocales en el libro es: " + totalVocales);

        // Mostrar palabras que empiezan con vocal
        System.out.println("\nPalabras que empiezan con vocal:");
        contador.imprimirPalabrasQueEmpiezanConVocal(nombreArchivo);

        // Mostrar palabras con número impar de letras
        System.out.println("\nPalabras con número impar de letras:");
        contador.imprimirPalabrasConNumeroImparDeLetras(nombreArchivo);

        // Encontrar la palabra más larga del libro
        String palabraMasLarga = contador.encontrarPalabraMasLarga(nombreArchivo);
        System.out.println("\nLa palabra más larga del libro es: " + palabraMasLarga);

        // Encontrar la palabra más corta del libro
        String palabraMasCorta = contador.encontrarPalabraMasCorta(nombreArchivo);
        System.out.println("\nLa palabra más corta del libro es: " + palabraMasCorta);

        // Verificar si hay palabras que empiecen y terminen con vocal y tengan al menos 5 letras
        List<String> palabrasConVocalAlInicioYFinal = ContadorPalabras.palabrasConVocalAlInicioYFinal(nombreArchivo);
        System.out.println("\nPalabras que empiecen y terminen con vocal y tengan al menos 5 letras:");
        if (!palabrasConVocalAlInicioYFinal.isEmpty()) {
            palabrasConVocalAlInicioYFinal.forEach(System.out::println);
        } else {
            System.out.println("No hay palabras que cumplan con esa condición.");
        }

    }
}
