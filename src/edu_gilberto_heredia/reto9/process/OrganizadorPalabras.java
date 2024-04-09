package edu_gilberto_heredia.reto9.process;

import java.util.*;

/**
 * Clase que organiza las palabras según su frecuencia de aparición
 */
public class OrganizadorPalabras {
    /**
     * Método que organiza las palabras según su frecuencia de aparición.
     *
     * @param conteoPalabras Un mapa que contiene las palabras y su frecuencia de aparición.
     * @return Una lista de pares (palabra, frecuencia) ordenada por frecuencia descendente.
     */
    public static List<Map.Entry<String, Integer>> organizarPalabras(Map<String, Integer> conteoPalabras) {
        List<Map.Entry<String, Integer>> listaPalabras = new ArrayList<>(conteoPalabras.entrySet());
        listaPalabras.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        return listaPalabras;
    }
}