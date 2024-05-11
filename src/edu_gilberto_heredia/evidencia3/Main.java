package edu_gilberto_heredia.evidencia3;

import edu_gilberto_heredia.evidencia3.process.Juego;
import edu_gilberto_heredia.evidencia3.ui.CLI;

public class Main {
    public static void main(String[] args) {
        boolean unJugador = CLI.seleccionarModoJuego();
        Juego juego = new Juego(unJugador);
        juego.iniciarJuego();
    }
}