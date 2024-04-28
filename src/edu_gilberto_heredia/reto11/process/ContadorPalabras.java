package edu_gilberto_heredia.reto11.process;

import java.io.InputStream;
import java.text.Normalizer;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Clase que cuenta las palabras en un archivo de texto.
 */
public class ContadorPalabras {
    /**
     * Método que cuenta las palabras en un archivo de texto.
     *
     * @param nombreArchivo El nombre del archivo de texto.
     * @return Una lista de pares (palabra, frecuencia) ordenada por frecuencia descendente.
     */
    public List<Map.Entry<String, Integer>> contarPalabras(String nombreArchivo) {
        Map<String, Integer> conteoPalabras = new HashMap<>();

        try {
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream
                    ("edu_gilberto_heredia/reto11/resources/" + nombreArchivo);
            if (inputStream != null) {
                Scanner fileScanner = new Scanner(inputStream);
                fileScanner.useDelimiter("[^a-zA-Z]+"); // Delimitador para separar palabras
                while (fileScanner.hasNext()) {
                    String palabra = fileScanner.next().toLowerCase();
                    palabra = Normalizer.normalize(palabra, Normalizer.Form.NFD).replaceAll
                            ("[^\\p{ASCII}]", ""); // Remover acentos
                    if (!palabra.isEmpty()) {
                        conteoPalabras.put(palabra, conteoPalabras.getOrDefault(palabra, 0) + 1);
                    }
                }
                fileScanner.close();
            } else {
                System.out.println("Archivo no encontrado.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return conteoPalabras.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toList());
    }


    /**
     * Método que cuenta el total de todas las vocales disponibles en el libro.
     *
     * @param nombreArchivo El nombre del archivo de texto.
     * @return El total de todas las vocales en el libro.
     */
    public long contarVocales(String nombreArchivo) {
        try {
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream
                    ("edu_gilberto_heredia/reto11/resources/" + nombreArchivo);
            if (inputStream != null) {
                Scanner fileScanner = new Scanner(inputStream);
                return fileScanner.findAll("[aeiou]").count();
            } else {
                System.out.println("Archivo no encontrado.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    /**
     * Método que imprime todas las palabras que empiecen en una vocal ordenadas alfabéticamente.
     *
     * @param nombreArchivo El nombre del archivo de texto.
     */
    public void imprimirPalabrasQueEmpiezanConVocal(String nombreArchivo) throws IllegalArgumentException {
        try {
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream("edu_gilberto_heredia/reto11/resources/" + nombreArchivo);
            if (inputStream != null) {
                Scanner fileScanner = new Scanner(inputStream);
                if (!fileScanner.hasNext()) {
                    throw new IllegalArgumentException("El archivo está vacío");
                }
                fileScanner.findAll("\\b[aeiouAEIOU]\\w*")
                        .map(matchResult -> matchResult.group())
                        .map(String::toLowerCase)
                        .distinct()
                        .sorted()
                        .forEach(System.out::println);
            } else {
                System.out.println("Archivo no encontrado.");
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("Error al procesar el archivo", e);
        }
    }


    public void imprimirPalabrasConNumeroImparDeLetras(String nombreArchivo) {
        try {
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream("edu_gilberto_heredia/reto11/resources/" + nombreArchivo);
            if (inputStream != null) {
                Scanner fileScanner = new Scanner(inputStream);
                fileScanner.findAll("\\b[a-zA-Z]{1,}[aeiouAEIOU]\\b")
                        .map(matchResult -> matchResult.group())
                        .map(String::toLowerCase)
                        .filter(s -> s.length() % 2 != 0)
                        .distinct()
                        .forEach(System.out::println);
            } else {
                System.out.println("Archivo no encontrado.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String encontrarPalabraMasLarga(String nombreArchivo) {
        try {
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream("edu_gilberto_heredia/reto11/resources/" + nombreArchivo);
            if (inputStream != null) {
                Scanner fileScanner = new Scanner(inputStream);
                return fileScanner.findAll("\\b[a-zA-Z]+\\b")
                        .map(matchResult -> matchResult.group())
                        .map(String::toLowerCase)
                        .max(Comparator.comparingInt(String::length))
                        .orElse(null);
            } else {
                System.out.println("Archivo no encontrado.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String encontrarPalabraMasCorta(List<String> palabras) {
        return palabras.stream()
                .min(Comparator.comparingInt(String::length))
                .orElse(null);
    }

    public static List<String> criterioVocales(List<String> palabras) {
        return palabras.stream()
                .filter(p -> p.matches("^[aeiouAEIOU].*[aeiouAEIOU]$") && p.length() >= 5)
                .collect(Collectors.toList());
    }
}
