package edu_gilberto_heredia.reto4.data;

import java.util.List;

public class Pasajeros {
    private String nombre;

    public Pasajeros(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public static void procesarListaPasajeros(List<Pasajeros> listaPasajeros) {
        for (Pasajeros pasajero : listaPasajeros) {
            System.out.println("Pasajero: " + pasajero.getNombre());
        }
    }
}
