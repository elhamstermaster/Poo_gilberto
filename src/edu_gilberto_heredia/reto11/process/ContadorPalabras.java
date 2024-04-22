package edu_gilberto_heredia.reto11.process;

import java.io.InputStream;
import java.text.Normalizer;
import java.util.*;

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
                while (fileScanner.hasNext()) {
                    String palabra = fileScanner.next().toLowerCase();
                    palabra = Normalizer.normalize(palabra, Normalizer.Form.NFD).replaceAll
                            ("[^\\p{ASCII}]", ""); // Remover acentos
                    palabra = palabra.replaceAll("[^a-zA-Z]", ""); // Remover caracteres no alfabéticos
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

        OrganizadorPalabras organizador = new OrganizadorPalabras();
        return organizador.organizarPalabras(conteoPalabras);
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
    public void imprimirPalabrasQueEmpiezanConVocal(String nombreArchivo) {
        try {
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream("edu_gilberto_heredia/reto11/resources/" + nombreArchivo);
            if (inputStream != null) {
                Scanner fileScanner = new Scanner(inputStream);
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
            e.printStackTrace();
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

    public String encontrarPalabraMasCorta(String nombreArchivo) {
        try {
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream("edu_gilberto_heredia/reto11/resources/" + nombreArchivo);
            if (inputStream != null) {
                Scanner fileScanner = new Scanner(inputStream);
                return fileScanner.findAll("\\b[a-zA-Z]+\\b")
                        .map(matchResult -> matchResult.group())
                        .map(String::toLowerCase)
                        .min(Comparator.comparingInt(String::length))
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
     * Método que devuelve una lista de palabras que empiezan y terminan con vocal y tienen al menos 5 letras.
     *
     * @param nombreArchivo El nombre del archivo de texto.
     * @return Una lista de palabras que cumplen con las condiciones especificadas.
     */
    public static List<String> palabrasConVocalAlInicioYFinal(String nombreArchivo) {
        List<String> palabras = new ArrayList<>();
        try {
            InputStream inputStream = ContadorPalabras.class.getClassLoader().getResourceAsStream
                    ("edu_gilberto_heredia/reto11/resources/" + nombreArchivo);
            if (inputStream != null) {
                Scanner fileScanner = new Scanner(inputStream);
                fileScanner.findAll("\\b[aeiouAEIOU]\\w*[aeiouAEIOU]\\b")
                        .map(String.class::cast)
                        .map(String::toLowerCase)
                        .filter(s -> s.length() >= 5)
                        .distinct()
                        .forEach(palabras::add);
            } else {
                System.out.println("Archivo no encontrado.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return palabras;
    }

}
