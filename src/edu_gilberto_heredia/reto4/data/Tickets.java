package edu_gilberto_heredia.reto4.data;

import java.util.ArrayList;
import java.util.List;

public class Tickets {
    private List<Pasajeros> listaPasajeros;
    private List<Boletos> listaBoletos;

    public Tickets() {
        this.listaPasajeros = new ArrayList<>();
        this.listaBoletos = new ArrayList<>();
    }

    public void agregarPasajero(Pasajeros pasajero, Boletos boletos) {
        listaPasajeros.add(pasajero);
        listaBoletos.add(boletos);
    }

    public void mostrarListaPasajeros() {
        Pasajeros.procesarListaPasajeros(listaPasajeros);
    }

    public double calcularImporteTotal() {
        double importeTotal = 0;
        for (Boletos boleto : listaBoletos) {
            importeTotal += boleto.getNumBoletos() * 1250.50;
        }
        return importeTotal;
    }

    public int getCantidadPasajeros() {
        return listaPasajeros.size();
    }

    public Boletos getBoletos(int index) {
        return listaBoletos.get(index - 1);
    }
}
