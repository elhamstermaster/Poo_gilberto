package edu_gilberto_heredia.evidencia3.ui;

import edu_gilberto_heredia.evidencia3.data.SalonDeLaFama;
import edu_gilberto_heredia.evidencia3.process.Tablero;

import java.util.Random;
import java.util.Scanner;

public class CLI {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String RUTA_ARCHIVO_SALON_DE_LA_FAMA = "salon_de_la_fama.txt";

    public static void mostrarMenuIdiomas() {
        System.out.println("""
                --------------------------------------------------------------------------
                Seleccione su idioma / Select your language / あなたが使う言語を選んでください:
                ESP: Español / Spanish / スペイン語
                ENG: Inglés / English / 英語
                JAP: Japonés / Japanese / 日本語""");
    }

    public static void mostrarMenuJuego(String nombreJugador1, String nombreJugador2, char simboloJugador1, char simboloJugador2) {
        boolean jugarDeNuevo = true;

        while (jugarDeNuevo) {
            Tablero tablero = new Tablero();
            char jugadorActual = (new Random().nextInt(2) == 0) ? simboloJugador1 : simboloJugador2;

            System.out.println("¡Bienvenido al juego del gato!");

            // Ciclo principal del juego
            while (!tablero.hayGanador() && !tablero.tableroLleno()) {
                tablero.mostrarTablero();

                if (!nombreJugadorActual(jugadorActual, nombreJugador1, nombreJugador2).equals("Computadora")) {
                    // Turno del jugador humano
                    turnoJugadorHumano(tablero, jugadorActual, nombreJugador1, nombreJugador2, simboloJugador1, simboloJugador2);
                } else {
                    // Turno de la computadora
                    turnoComputadora(tablero, jugadorActual);
                }

                // Cambiar al siguiente jugador
                jugadorActual = (jugadorActual == simboloJugador1) ? simboloJugador2 : simboloJugador1;
            }

            tablero.mostrarTablero();

            if (tablero.hayGanador()) {
                System.out.println("¡" + nombreJugadorActual(jugadorActual, nombreJugador1, nombreJugador2) + " ha ganado!");
            } else {
                System.out.println("¡Empate!");
            }

            System.out.println("¿Desea jugar de nuevo?");
            String respuesta = scanner.next();
            jugarDeNuevo = respuesta.equalsIgnoreCase("si");
        }

        if (!nombreJugador2.equals("Computadora")) {
            SalonDeLaFama.actualizar(nombreJugador1, nombreJugador2, RUTA_ARCHIVO_SALON_DE_LA_FAMA);
        }
    }

    public static String nombreJugadorActual(char jugadorActual, String nombreJugador1, String nombreJugador2) {
        return (jugadorActual == 'X') ? nombreJugador1 : nombreJugador2;
    }

    public static char simboloJugadorActual(char jugadorActual, char simboloJugador1, char simboloJugador2) {
        return (jugadorActual == 'X') ? simboloJugador1 : simboloJugador2;
    }

    public static void elegirModoJuego() {
        mostrarMenuIdiomas();

        String idioma = scanner.next();

        switch (idioma.toLowerCase()) {
            case "esp":
                Idiomas.getInstance("ESP");
                break;
            case "eng":
                Idiomas.getInstance("ENG");
                break;
            case "jap":
                Idiomas.getInstance("JAP");
                break;
            default:
                System.out.println("Idioma no válido. Seleccionando Español por defecto.");
                Idiomas.getInstance("ESP");
                break;
        }

        System.out.println(Idiomas.JUGAR);

        int modoJuego = scanner.nextInt();

        switch (modoJuego) {
            case 1:
                // Modo de juego contra la computadora
                // Aquí puedes llamar a la función correspondiente para iniciar el juego contra la computadora
                break;
            case 2:
                // Modo de juego 1v1
                System.out.println(Idiomas.NOMBRES);
                System.out.print("Elige tu nombre: ");
                String nombreJugador1 = scanner.next();
                System.out.print("Elige el nombre del segundo jugador: ");
                String nombreJugador2 = scanner.next();
                System.out.println("Elige tu propio símbolo, hay 10 disponibles: \n" +
                        "@ # $ % & X 0 ? + =");
                System.out.print(nombreJugador1 + ", ");
                char simboloJugador1 = scanner.next().charAt(0);
                System.out.print(nombreJugador2 + ", ");
                char simboloJugador2 = scanner.next().charAt(0);

                mostrarMenuJuego(nombreJugador1, nombreJugador2, simboloJugador1, simboloJugador2);
                break;
            default:
                System.out.println("Opción no válida. Volviendo al menú principal.");
                break;
        }
    }

    private static void turnoJugadorHumano(Tablero tablero, char jugadorActual, String nombreJugador1, String nombreJugador2, char simboloJugador1, char simboloJugador2) {
        System.out.println("Jugador " + nombreJugadorActual(jugadorActual, nombreJugador1, nombreJugador2) + " (" + simboloJugadorActual(jugadorActual, simboloJugador1, simboloJugador2) + "), ingresa la fila y la columna (ejemplo: 1 2):");
        int fila = scanner.nextInt() - 1;
        int columna = scanner.nextInt() - 1;

        if (tablero.colocarMarca(fila, columna, jugadorActual)) {
            // El movimiento fue válido
        } else {
            System.out.println(Idiomas.POSICION_INVALIDA);
            turnoJugadorHumano(tablero, jugadorActual, nombreJugador1, nombreJugador2, simboloJugador1, simboloJugador2);
        }
    }

    private static void turnoComputadora(Tablero tablero, char jugadorActual) {
        int fila;
        int columna;
        do {
            fila = new Random().nextInt(3);
            columna = new Random().nextInt(3);
        } while (!tablero.colocarMarca(fila, columna, jugadorActual));
    }
}
