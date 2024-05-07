package edu_gilberto_heredia.evidencia3.data;

import java.io.*;

public class SalonDeLaFama {
    private static final int MAX_JUGADORES = 5;

    public static void actualizar(String nombreJugador1, String nombreJugador2, String rutaArchivo) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));
            String[] nombres = new String[MAX_JUGADORES];
            int[] victorias = new int[MAX_JUGADORES];
            int numJugadores = 0;

            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                nombres[numJugadores] = datos[0];
                victorias[numJugadores] = Integer.parseInt(datos[1]);
                numJugadores++;
            }
            br.close();

            int indiceJugador1 = buscarJugador(nombreJugador1, nombres, numJugadores);
            int indiceJugador2 = buscarJugador(nombreJugador2, nombres, numJugadores);

            if (indiceJugador1 == -1) {
                agregarJugador(nombreJugador1, nombres, victorias, numJugadores);
                indiceJugador1 = numJugadores;
                numJugadores++;
            }

            if (indiceJugador2 == -1) {
                agregarJugador(nombreJugador2, nombres, victorias, numJugadores);
                indiceJugador2 = numJugadores;
                numJugadores++;
            }

            victorias[indiceJugador1]++;
            victorias[indiceJugador2]++;

            ordenarSalonDeLaFama(nombres, victorias, numJugadores);

            BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo));
            for (int i = 0; i < numJugadores && i < MAX_JUGADORES; i++) {
                bw.write(nombres[i] + "," + victorias[i]);
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int buscarJugador(String nombreJugador, String[] nombres, int numJugadores) {
        for (int i = 0; i < numJugadores; i++) {
            if (nombres[i].equals(nombreJugador)) {
                return i;
            }
        }
        return -1;
    }

    private static void agregarJugador(String nombreJugador, String[] nombres, int[] victorias, int numJugadores) {
        if (numJugadores < MAX_JUGADORES) {
            nombres[numJugadores] = nombreJugador;
            victorias[numJugadores] = 0;
        } else {
            // Si el máximo de jugadores ya está alcanzado, se reemplaza al último jugador
            nombres[MAX_JUGADORES - 1] = nombreJugador;
            victorias[MAX_JUGADORES - 1] = 0;
        }
    }

    private static void ordenarSalonDeLaFama(String[] nombres, int[] victorias, int numJugadores) {
        for (int i = 0; i < numJugadores - 1; i++) {
            for (int j = 0; j < numJugadores - i - 1; j++) {
                if (victorias[j] < victorias[j + 1]) {
                    // Intercambiar jugadores
                    String tempNombre = nombres[j];
                    int tempVictorias = victorias[j];

                    nombres[j] = nombres[j + 1];
                    victorias[j] = victorias[j + 1];

                    nombres[j + 1] = tempNombre;
                    victorias[j + 1] = tempVictorias;
                }
            }
        }
    }
}
