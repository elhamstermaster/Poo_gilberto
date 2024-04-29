package edu_gilberto_heredia.reto11.process;

import edu_gilberto_heredia.reto11.ui.Idiomas;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Consumer;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
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
    public Consumer<String> contarPalabras = (nombreArchivo) -> {
        try {
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream("edu_gilberto_heredia/reto11/resources/" + nombreArchivo);
            if (inputStream != null) {
                // Resto del código para contar las palabras
            } else {
                throw new FileNotFoundException("Archivo no encontrado: " + nombreArchivo);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e); // Lanzar la excepción hacia afuera
        } catch (Exception e) {
            e.printStackTrace();
        }
    };


    /**
     * Método que cuenta el total de todas las vocales disponibles en el libro.
     *
     * @param nombreArchivo El nombre del archivo de texto.
     * @return El total de todas las vocales en el libro.
     */
    public long contarVocales(String nombreArchivo) {
        try {
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream("edu_gilberto_heredia/reto11/resources/" + nombreArchivo);
            if (inputStream != null) {
                Scanner fileScanner = new Scanner(inputStream);
                return fileScanner.findAll("[aeiouAEIOU]").count();
            } else {
                throw new Exception("Archivo no encontrado: " + nombreArchivo);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
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
                throw new Exception("Archivo no encontrado: " + nombreArchivo);
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("Error al procesar el archivo", e);
        }
    }

    /**
     * Método que imprime todas las palabras que empiecen en una vocal ordenadas alfabéticamente.
     *
     * @param nombreArchivo El nombre del archivo de texto.
     * @throws IllegalArgumentException Si el archivo está vacío.
     */
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


    /**
     * Encuentra la palabra más larga en el archivo de texto especificado.
     *
     * @param nombreArchivo El nombre del archivo de texto.
     * @return La palabra más larga en el archivo de texto o null si el archivo no se encuentra o está vacío.
     */
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

    /**
     * Encuentra la palabra más corta en el archivo de texto especificado.
     *
     * @param nombreArchivo El nombre del archivo de texto.
     * @return La palabra más corta en el archivo de texto o null si el archivo no se encuentra o está vacío.
     */
    public String encontrarPalabraMasCorta(String nombreArchivo) {
        try {
            InputStream inputStream = getClass().getClassLoader()
                    .getResourceAsStream("edu_gilberto_heredia/reto11/resources/" + nombreArchivo);
            if (inputStream != null) {
                Scanner fileScanner = new Scanner(inputStream);
                return fileScanner.findAll("\\b[a-zA-Z]+\\b")
                        .map(matchResult -> matchResult.group())
                        .map(String::toLowerCase)
                        .min(Comparator.comparingInt(String::length))
                        .orElse(null);
            } else {
                System.out.println(Idiomas.ERROR);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Encuentra palabras únicas que cumplen un criterio específico en el archivo de texto especificado.
     *
     * @param nombreArchivo El nombre del archivo de texto.
     * @return Una cadena con las palabras únicas que cumplen el criterio, ordenadas alfabéticamente,
     *         separadas por salto de línea; o null si el archivo no se encuentra o está vacío.
     */
    public String criterioVocales(String nombreArchivo) {
        try {
            InputStream inputStream = getClass().getClassLoader()
                    .getResourceAsStream("edu_gilberto_heredia/reto11/resources/" + nombreArchivo);
            if (inputStream != null) {
                Scanner fileScanner = new Scanner(inputStream);
                if (!fileScanner.hasNext()) {
                    return null; // Devolver null si el archivo está vacío
                }
                String contenido = fileScanner.useDelimiter("\\A").next();
                String contenidoFiltrado = contenido.replaceAll("[^a-zA-Z\\s]", "").toLowerCase();
                Set<String> palabrasUnicas = new HashSet<>();
                Pattern.compile("\\b[aieou][a-zA-Z]{3,10}[aieou]\\b")
                        .matcher(contenidoFiltrado)
                        .results()
                        .map(MatchResult::group)
                        .forEach(palabrasUnicas::add);
                if (palabrasUnicas.isEmpty()) {
                    throw new Exception(Idiomas.NO_HAY_PALABRAS + nombreArchivo + Idiomas.CUMPLAN_CONDICION);
                }
                return palabrasUnicas.stream()
                        .sorted()
                        .collect(Collectors.joining("\n"));
            } else {
                throw new Exception(Idiomas.ERROR);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
