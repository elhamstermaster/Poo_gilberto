package edu_gilberto_heredia.reto9.process;

import java.io.InputStream;
import java.text.Normalizer;
import java.util.*;

import static edu_gilberto_heredia.reto9.process.OrganizadorPalabras.organizarPalabras;

/**
 * Clase que cuenta las palabras en un archivo de texto
 */
public class ContadorPalabras {
    /**
     * Método que cuenta las palabras en un archivo de texto.
     *
     * @param nombreArchivo El nombre del archivo de texto.
     * @return Una lista de pares (palabra, frecuencia) ordenada por frecuencia descendente.
     */
    public static List<Map.Entry<String, Integer>> contarPalabras(String nombreArchivo) {
        Map<String, Integer> conteoPalabras = new HashMap<>();

        try {
            InputStream inputStream = ContadorPalabras.class.getClassLoader().getResourceAsStream
                    ("edu_gilberto_heredia/reto9/resources/" + nombreArchivo);
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

        return organizarPalabras(conteoPalabras);
    }
}
