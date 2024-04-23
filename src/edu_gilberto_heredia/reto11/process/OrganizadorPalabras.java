package edu_gilberto_heredia.reto11.process;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

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
    public List<Map.Entry<String, Integer>> organizarPalabras(Map<String, Integer> conteoPalabras) {
        List<Map.Entry<String, Integer>> listaPalabras = new ArrayList<>(conteoPalabras.entrySet());
        listaPalabras.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        return listaPalabras;
    }
}
