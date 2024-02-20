package edu_gilberto_heredia.reto4.data;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase Boletos representa la información relacionada con la venta de boletos.
 * Permite agregar boletos, procesar la lista de boletos y obtener información sobre los boletos vendidos.
 */
public class Boletos {
    private ArrayList<Integer> numBoletos;

    /**
     * Constructor por defecto de la clase Boletos. Inicializa la lista de boletos.
     */
    public Boletos() {
        this.numBoletos = new ArrayList<>();
    }

    /**
     * Agrega un número específico de boletos a la lista.
     *
     * @param num La cantidad de boletos a agregar.
     */
    public void agregarBoletos(int num) {
        this.numBoletos.add(num);
    }

    /**
     * Procesa la lista de boletos e imprime cada número de boleto en la consola.
     */
    public void procesarListaBoletos() {
        for (int i = 0; i < numBoletos.size(); i++) {
            System.out.println(numBoletos.get(i));
        }
    }

    /**
     * Obtiene el número de boletos vendidos. Si la lista está vacía, devuelve 0.
     *
     * @return El número de boletos vendidos.
     */
    public int getNumBoletos() {
        return !numBoletos.isEmpty() ? numBoletos.getLast() : 0;
    }

    /**
     * Obtiene la lista completa de boletos vendidos.
     *
     * @return Una lista que contiene todos los números de boletos vendidos.
     */
    public List<Integer> getListaBoletos() {
        return new ArrayList<>(numBoletos);
    }
}
