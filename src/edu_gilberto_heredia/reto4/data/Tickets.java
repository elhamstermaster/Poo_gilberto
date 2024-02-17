package edu_gilberto_heredia.reto4.data;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase Tickets representa la información relacionada con las ventas de boletos.
 * Permite agregar pasajeros y sus respectivos boletos, así como realizar cálculos sobre las ventas.
 */
public class Tickets {
    private List<Pasajeros> listaPasajeros;
    private List<Boletos> listaBoletos;

    /**
     * Constructor por defecto de la clase Tickets. Inicializa las listas de pasajeros y boletos.
     */
    public Tickets() {
        this.listaPasajeros = new ArrayList<>();
        this.listaBoletos = new ArrayList<>();
    }

    /**
     * Agrega un pasajero y sus boletos a las listas.
     *
     * @param pasajero El objeto Pasajeros que representa al pasajero.
     * @param boletos  El objeto Boletos que representa los boletos del pasajero.
     */
    public void agregarPasajero(Pasajeros pasajero, Boletos boletos) {
        listaPasajeros.add(pasajero);
        listaBoletos.add(boletos);
    }

    /**
     * Muestra la lista de pasajeros en la consola.
     */
    public void mostrarListaPasajeros() {
        Pasajeros.procesarListaPasajeros(listaPasajeros);
    }

    /**
     * Calcula el importe total de todas las ventas de boletos.
     *
     * @return El importe total de las ventas.
     */
    public double calcularImporteTotal() {
        double importeTotal = 0;
        for (Boletos boleto : listaBoletos) {
            importeTotal += boleto.getNumBoletos() * 1250.50;
        }
        return importeTotal;
    }

    /**
     * Obtiene la cantidad total de pasajeros registrados.
     *
     * @return La cantidad total de pasajeros registrados.
     */
    public int getCantidadPasajeros() {
        return listaPasajeros.size();
    }

    /**
     * Obtiene los boletos de un pasajero en un índice específico.
     *
     * @param index El índice del pasajero (1-indexed).
     * @return El objeto Boletos correspondiente al pasajero en el índice dado.
     */
    public Boletos getBoletos(int index) {
        return listaBoletos.get(index - 1);
    }
}
