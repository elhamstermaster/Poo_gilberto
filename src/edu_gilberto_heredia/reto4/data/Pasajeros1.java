package edu_gilberto_heredia.reto4.data;
import java.util.List;


public class Pasajeros1 {
    private String nombre;

    //Constructor
    public Pasajeros1(String nombre) {
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
    public static void procesarListaPasajeros(List<Pasajeros1> listaPasajeros) {
        // Aquí puedes realizar operaciones con la lista de pasajeros según sea necesario
        for (Pasajeros1 pasajero : listaPasajeros) {
            System.out.println("Pasajero: " + pasajero.getNombre());
            // Realiza otras operaciones según sea necesario
        }
    }
}
