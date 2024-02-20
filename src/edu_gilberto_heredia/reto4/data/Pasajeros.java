package edu_gilberto_heredia.reto4.data;

import java.util.List;

/**
 * La clase Pasajeros representa la información relacionada con los pasajeros que han comprado boletos.
 * Permite acceder y manipular el nombre de los pasajeros.
 */
public class Pasajeros {
    private String nombre;

    /**
     * Constructor de la clase Pasajeros.
     * @param nombre El nombre del pasajero.
     */
    public Pasajeros(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el nombre del pasajero.
     *
     * @return El nombre del pasajero.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Procesa una lista de objetos Pasajeros e imprime cada nombre en la consola.
     *
     * @param listaPasajeros La lista de pasajeros a procesar.
     */
    public static void procesarListaPasajeros(List<Pasajeros> listaPasajeros) {
        for (Pasajeros pasajero : listaPasajeros) {
            System.out.println("Pasajero: " + pasajero.getNombre());
        }
    }
}
