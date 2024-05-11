package edu_gilberto_heredia.evidencia3.data;

import java.util.HashMap;
import java.util.Map;

public class SalonDeLaFama {
    private static final int MAX_JUGADORES = 5;
    private Map<String, Integer> jugadores;

    public SalonDeLaFama(){
        this.jugadores = new HashMap<>();
    }

    public void actualizar(String nombreGanador){
        if (!jugadores.containsKey(nombreGanador)) {
            if (jugadores.size() < MAX_JUGADORES) {
                jugadores.put(nombreGanador, 1);
            } else {
                String ultimoJugador = jugadores.entrySet().stream()
                        .min(Map.Entry.comparingByValue())
                        .orElseThrow()
                        .getKey();
                jugadores.remove(ultimoJugador);
                jugadores.put(nombreGanador, 1);
            }
        } else {
            jugadores.put(nombreGanador, jugadores.get(nombreGanador) + 1);
        }
    }

    public void mostrar() {
        System.out.println("Salón de la Fama:");
        jugadores.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue() + " victorias"));
    }
}