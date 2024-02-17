package edu_gilberto_heredia.reto4.data;

import java.util.ArrayList;
import java.util.List;

public class Boletos {
    private List<Integer> numBoletos;

    public Boletos() {
        this.numBoletos = new ArrayList<>();
    }

    public void agregarBoletos(int num) {
        this.numBoletos.add(num);
    }

    public void procesarListaBoletos() {
        for (int i = 0; i < numBoletos.size(); i++) {
            System.out.println("Número de boletos: " + numBoletos.get(i));
        }
    }

    public int getNumBoletos() {
        return numBoletos.size() > 0 ? numBoletos.get(numBoletos.size() - 1) : 0;
    }

    // Nuevo método para obtener la lista completa de boletos
    public List<Integer> getListaBoletos() {
        return new ArrayList<>(numBoletos);
    }
}
