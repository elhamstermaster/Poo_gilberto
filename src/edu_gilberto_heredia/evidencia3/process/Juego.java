package edu_gilberto_heredia.evidencia3.process;

import edu_gilberto_heredia.evidencia3.data.Jugador;
import edu_gilberto_heredia.evidencia3.data.SalonDeLaFama;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Juego {
    private char[][] tablero;
    private Jugador jugador1;
    private Jugador jugador2;
    private boolean unJugador;
    private boolean turnoJugador1;
    private Scanner scanner;
    private SalonDeLaFama salonDeLaFama;
    private static final HashSet<String> simbolosValidos = new HashSet<>(Set.of("@", "#", "$", "%", "&", "X", "0", "?", "+", "="));
    private JuegoComputadora juegoComputadora; // Agrega una instancia de JuegoComputadora

    public Juego(boolean unJugador) {
        this.salonDeLaFama = new SalonDeLaFama();
        this.unJugador = unJugador;
        this.turnoJugador1 = true;
        this.scanner = new Scanner(System.in);
        this.tablero = new char[3][3];
        this.juegoComputadora = new JuegoComputadora(); // Inicializa la instancia de JuegoComputadora
        // Inicializar el tablero
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = '-';
            }
        }
    }

    private boolean cadenaVacia(String cadena) {
        return cadena.trim().isEmpty();
    }

    public void iniciarJuego() {
        System.out.println("¡Bienvenido al juego Tres en Raya!");

        do {
            jugarPartida();

            System.out.println("¿Desean jugar nuevamente? (si/no)");
            String respuesta = scanner.nextLine().toLowerCase();

            // Consumir la nueva línea en blanco después de la respuesta del usuario
            scanner.nextLine();

            while (!respuesta.equals("si") && !respuesta.equals("no")) {
                System.out.println("Respuesta inválida. Por favor, ingrese 'si' para jugar nuevamente o 'no' para terminar.");
                respuesta = scanner.nextLine().toLowerCase();
            }

            if (respuesta.equals("no")) {
                System.out.println("Gracias por jugar. ¡Hasta luego!");
                break;
            }

            // Reiniciar el tablero para una nueva partida
            reiniciarTablero();

        } while (true);
    }

    private void jugarPartida() {
        // Elegir aleatoriamente quién empieza
        turnoJugador1 = new Random().nextBoolean();
        System.out.println("Comencemos una nueva partida...");

        if (unJugador) {
            // Lógica para juego de un jugador
            System.out.print("Ingrese su nombre: ");
            String nombreJugador1 = scanner.nextLine();
            while (cadenaVacia(nombreJugador1)) {
                System.out.println("El nombre no puede estar vacío. Inténtelo de nuevo.");
                System.out.print("Ingrese su nombre: ");
                nombreJugador1 = scanner.nextLine();
            }
            System.out.print("Ingrese su símbolo (@ # $ % & X 0 ? + =): ");
            String simboloJugador1 = scanner.nextLine().toUpperCase();

            while (cadenaVacia(simboloJugador1) || simboloJugador1.length() != 1 || !simbolosValidos.contains(simboloJugador1)) {
                System.out.println("El símbolo no es válido. Inténtelo de nuevo.");
                System.out.print("Ingrese su símbolo (@ # $ % & X 0 ? + =): ");
                simboloJugador1 = scanner.nextLine().toUpperCase();
            }
            jugador1 = new Jugador(nombreJugador1, simboloJugador1);
            jugador2 = new Jugador("Computadora", simboloJugador1.equals("X") ? "O" : "X");

            while (true) {
                if (turnoJugador1) {
                    turnoJugador(jugador1);
                } else {
                    turnoComputadora();
                }

                if (verificarVictoria()) {
                    System.out.println("¡" + (turnoJugador1 ? jugador1.getNombre() : jugador2.getNombre()) + " ha ganado!");
                    break;
                }
                if (tableroLleno()) {
                    System.out.println("¡El tablero está lleno! ¡Es un empate!");
                    break;
                }

                turnoJugador1 = !turnoJugador1;
            }

            // Actualizar el salón de la fama
            if (verificarVictoria()) {
                salonDeLaFama.actualizar(jugador1.getNombre());
            }

        } else {
            // Lógica para juego de dos jugadores
            System.out.print("Ingrese el nombre del jugador 1: ");
            String nombreJugador1 = scanner.nextLine();
            while (cadenaVacia(nombreJugador1)) {
                System.out.println("El nombre no puede estar vacío. Inténtelo de nuevo.");
                System.out.print("Ingrese el nombre del jugador 1: ");
                nombreJugador1 = scanner.nextLine();
            }
            System.out.print("Ingrese el símbolo del jugador 1 (@ # $ % & X 0 ? + =): ");
            String simboloJugador1 = scanner.nextLine().toUpperCase();

            while (cadenaVacia(simboloJugador1) || simboloJugador1.length() != 1 || !simbolosValidos.contains(simboloJugador1)) {
                System.out.println("El símbolo ingresado no es válido. Por favor, elija uno de la lista.");
                System.out.print("Ingrese su símbolo (@ # $ % & X 0 ? + =): ");
                simboloJugador1 = scanner.nextLine().toUpperCase();
            }

            jugador1 = new Jugador(nombreJugador1, simboloJugador1);

            System.out.print("Ingrese el nombre del jugador 2: ");
            String nombreJugador2 = scanner.nextLine();
            while (cadenaVacia(nombreJugador2)) {
                System.out.println("El nombre no puede estar vacío. Inténtelo de nuevo.");
                System.out.print("Ingrese el nombre del jugador 2: ");
                nombreJugador2 = scanner.nextLine();
            }
            // Validar que el símbolo del jugador 2 sea diferente al del jugador 1
            String simboloJugador2;
            System.out.print("Ingrese el símbolo del jugador 2 (diferente a " + simboloJugador1 + "): ");
            simboloJugador2 = scanner.nextLine().toUpperCase();

            while (simboloJugador2.equals(simboloJugador1) || cadenaVacia(simboloJugador2) || simboloJugador2.length() != 1 || !simbolosValidos.contains(simboloJugador2)) {
                System.out.println("Ingrese un símbolo válido. Inténtelo de nuevo.");
                System.out.print("Ingrese el símbolo del jugador 2 (diferente a " + simboloJugador1 + "): ");
                simboloJugador2 = scanner.nextLine().toUpperCase();
            }
            jugador2 = new Jugador(nombreJugador2, simboloJugador2);

            while (true) {
                if (turnoJugador1) {
                    turnoJugador(jugador1);
                } else {
                    turnoJugador(jugador2);
                }

                if (verificarVictoria()) {
                    System.out.println("¡" + (turnoJugador1 ? jugador1.getNombre() : jugador2.getNombre()) + " ha ganado!");
                    break;
                }
                if (tableroLleno()) {
                    System.out.println("¡El tablero está lleno! ¡Es un empate!");
                    break;
                }

                turnoJugador1 = !turnoJugador1;
            }

            // Actualizar el salón de la fama
            if (verificarVictoria()) {
                salonDeLaFama.actualizar(turnoJugador1 ? jugador1.getNombre() : jugador2.getNombre());
            }
        }

        // Mostrar el salón de la fama al final de la partida
        salonDeLaFama.mostrar();
    }

    private void turnoJugador(Jugador jugador) {
        imprimirTablero(); // Mostrar el tablero antes de solicitar la jugada
        System.out.println("Turno de " + jugador.getNombre() + " (" + jugador.getSimbolo() + ")");

        // Solicitar la fila
        int fila;
        do {
            System.out.print("Ingrese la fila (0-2): ");
            fila = scanner.nextInt();
            if (fila < 0 || fila > 2) {
                System.out.println("Fila inválida. Debe ser un número entre 0 y 2.");
            } else if (filaLlena(fila)) {
                System.out.println("La fila seleccionada ya está llena. Por favor, seleccione otra fila.");
            }
        } while (fila < 0 || fila > 2 || filaLlena(fila));

        // Solicitar la columna
        int columna;
        do {
            System.out.print("Ingrese la columna (0-2): ");
            columna = scanner.nextInt();
            if (columna < 0 || columna > 2) {
                System.out.println("Columna inválida. Debe ser un número entre 0 y 2.");
            } else if (columnaLlena(columna)) {
                System.out.println("La columna seleccionada ya está llena. Por favor, seleccione otra columna.");
            }
        } while (columna < 0 || columna > 2 || columnaLlena(columna));

        // Verificar si la casilla está ocupada
        if (tablero[fila][columna] != '-') {
            System.out.println("La casilla seleccionada está ocupada. Intente de nuevo.");
            turnoJugador(jugador); // Solicitar una nueva jugada
        } else {
            // Colocar el símbolo en el tablero
            tablero[fila][columna] = jugador.getSimbolo().charAt(0);
            imprimirTablero();
        }
    }

    private boolean filaLlena(int fila) {
        for (int j = 0; j < 3; j++) {
            if (tablero[fila][j] == '-') {
                return false; // Si encuentra al menos una casilla vacía, la fila no está llena
            }
        }
        return true; // Si no hay casillas vacías, la fila está llena
    }

    private boolean columnaLlena(int columna) {
        for (int i = 0; i < 3; i++) {
            if (tablero[i][columna] == '-') {
                return false; // Si encuentra al menos una casilla vacía, la columna no está llena
            }
        }
        return true; // Si no hay casillas vacías, la columna está llena
    }

    private void turnoComputadora() {
        juegoComputadora.setSimbolo(jugador2.getSimbolo().charAt(0)); // Establece el símbolo de la computadora
        juegoComputadora.jugarTurno(tablero); // Llama al método jugarTurno de JuegoComputadora
        imprimirTablero(); // Mostrar el tablero después de que la computadora juegue
    }

    private boolean verificarVictoria() {
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] != '-' && tablero[i][0] == tablero[i][1] && tablero[i][0] == tablero[i][2]) {
                return true; // Verificación horizontal
            }
            if (tablero[0][i] != '-' && tablero[0][i] == tablero[1][i] && tablero[0][i] == tablero[2][i]) {
                return true; // Verificación vertical
            }
        }
        if (tablero[0][0] != '-' && tablero[0][0] == tablero[1][1] && tablero[0][0] == tablero[2][2]) {
            return true; // Verificación diagonal 1
        }
        if (tablero[0][2] != '-' && tablero[0][2] == tablero[1][1] && tablero[0][2] == tablero[2][0]) {
            return true; // Verificación diagonal 2
        }
        return false;
    }

    private boolean tableroLleno() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    private void reiniciarTablero() {
        // Reiniciar el tablero para una nueva partida
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = '-';
            }
        }
    }

    private void imprimirTablero() {
        System.out.println("Tablero:");
        System.out.println("   0   1   2");
        System.out.println(" ╔═══╦═══╦═══╗");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + "║");
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + tablero[i][j] + " ║");
            }
            System.out.println();
            if (i < 2) {
                System.out.println(" ╠═══╬═══╬═══╣");
            }
        }
        System.out.println(" ╚═══╩═══╩═══╝");
    }

}
