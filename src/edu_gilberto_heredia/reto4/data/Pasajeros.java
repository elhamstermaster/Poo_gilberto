package edu_gilberto_heredia.reto4.data;

import java.util.ArrayList;

public class Pasajeros {
    private String nombre;

    // Constructor
    public Pasajeros(String nombre) {
        this.nombre = nombre;
    }

    // Getter para obtener el nombre
    public String getNombre() {
        return nombre;
    }

    // Setter para establecer el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para procesar la lista de pasajeros
    public static void procesarListaPasajeros(ArrayList<Pasajeros> listaPasajeros) {
        // Aquí puedes realizar operaciones con la lista de pasajeros según sea necesario
        for (Pasajeros pasajero : listaPasajeros) {
            System.out.println("Pasajero: " + pasajero.getNombre());
            // Realiza otras operaciones según sea necesario
        }
    }
}
