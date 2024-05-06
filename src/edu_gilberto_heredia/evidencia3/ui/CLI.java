package edu_gilberto_heredia.evidencia3.ui;

import edu_gilberto_heredia.evidencia3.process.Tablero;

import java.util.Scanner;

public class CLI {
    private static final Scanner scanner = new Scanner(System.in);

    public static void mostrarMenuIdiomas() {
        System.out.println("""
                --------------------------------------------------------------------------
                Seleccione su idioma / Select your language / あなたが使う言語を選んでください:
                ESP: Español / Spanish / スペイン語
                ENG: Inglés / English / 英語
                JAP: Japonés / Japanese / 日本語""");
    }

    public static void mostrarMenuJuego(String nombreJugador1, String nombreJugador2, char simboloJugador1, char simboloJugador2) {
        do {
            Tablero tablero = new Tablero();
            char jugadorActual = simboloJugador1;

            System.out.println(Idiomas.BIENVENIDA);

            // Ciclo principal del juego
            while (true) {
                // Mostrar el tablero
                tablero.mostrarTablero();

                // Obtener la entrada del jugador
                System.out.println("Jugador " + nombreJugadorActual(jugadorActual, nombreJugador1, nombreJugador2) + " (" + simboloJugadorActual(jugadorActual, simboloJugador1, simboloJugador2) + "), ingresa la fila y la columna (ejemplo: 1 2):");
                int fila = scanner.nextInt() - 1;
                int columna = scanner.nextInt() - 1;

                // Colocar la marca en el tablero si es una posición válida
                if (tablero.colocarMarca(fila, columna, jugadorActual)) {
                    // Verificar si hay un ganador
                    if (tablero.hayGanador()) {
                        tablero.mostrarTablero();
                        System.out.println("¡" + nombreJugadorActual(jugadorActual, nombreJugador1, nombreJugador2) + " ha ganado!");
                        break;
                    }
                    // Verificar empate
                    if (tablero.tableroLleno()) {
                        tablero.mostrarTablero();
                        System.out.println(Idiomas.EMPATE);
                        break;
                    }
                    // Cambiar al siguiente jugador
                    jugadorActual = (jugadorActual == simboloJugador1) ? simboloJugador2 : simboloJugador1;
                } else {
                    System.out.println(Idiomas.POSICION_INVALIDA);
                }
            }
            System.out.println("¿Quieren jugar de nuevo? (si/no)");
        } while (scanner.nextLine().equalsIgnoreCase("si"));
    }

    public static String nombreJugadorActual(char jugadorActual, String nombreJugador1, String nombreJugador2) {
        return (jugadorActual == 'X') ? nombreJugador1 : nombreJugador2;
    }

    public static char simboloJugadorActual(char jugadorActual, char simboloJugador1, char simboloJugador2) {
        return (jugadorActual == 'X') ? simboloJugador1 : simboloJugador2;
    }

    public static void elegirIdiomaYNombre() {
        mostrarMenuIdiomas();
        String idiomaSeleccionado = scanner.nextLine().toUpperCase();
        Idiomas.getInstance(idiomaSeleccionado);

        System.out.println(Idiomas.NOMBRES);
        String nombreJugador1 = scanner.nextLine();
        String nombreJugador2 = scanner.nextLine();

        System.out.println(Idiomas.SIMBOLOS);
        char simboloJugador1 = scanner.next().charAt(0);
        char simboloJugador2 = scanner.next().charAt(0);

        System.out.println("¡Hola " + nombreJugador1 + " y " + nombreJugador2 + "!");

        mostrarMenuJuego(nombreJugador1, nombreJugador2, simboloJugador1, simboloJugador2);
    }
}
