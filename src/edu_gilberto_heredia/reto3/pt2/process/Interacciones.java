package edu_gilberto_heredia.reto3.pt2.process;

import java.util.Random;

// Clase que realiza las interacciones y procesos del programa
public class Interacciones {
    //Método que ejecuta el proceso principal
    public void ejecutarProceso(int filas, int columnas) {
        // Genera una matriz aleatoria con valores entre 1 y 100
        int[][] matriz = generarMatrizAleatoria(filas, columnas);

        mostrarMatriz(matriz);

        //Realiza el conteo de números pares e impares por filas y columnas
        contarParesImparesFilas(matriz);
        contarParesImparesColumnas(matriz);

        //Muestra la suma total de la matriz
        mostrarSumaMatriz(matriz);
    }

    //Método para generar una matriz aleatoria
    private int[][] generarMatrizAleatoria(int filas, int columnas) {
        int[][] matriz = new int[filas][columnas];
        Random random = new Random();

        // Rellena la matriz con valores aleatorios entre 1 y 100
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(100) + 1;
            }
        }

        return matriz;
    }

    // Método para mostrar la matriz
    private void mostrarMatriz(int[][] matriz) {
        System.out.println("\nMatriz generada:");

        // Recorre la matriz y muestra cada elemento
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }
    }

    // Método para contar números pares e impares por filas
    private void contarParesImparesFilas(int[][] matriz) {
        System.out.println("\nConteo de números pares e impares por filas:");

        // Recorre cada fila de la matriz
        for (int i = 0; i < matriz.length; i++) {
            int pares = 0, impares = 0;

            // Cuenta los números pares e impares en cada fila
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }

            // Muestra el resultado del conteo por fila
            System.out.println("Fila " + (i + 1) + ": Pares = " + pares + ", Impares = " + impares);
        }
    }

    // Método para contar números pares e impares por columnas
    private void contarParesImparesColumnas(int[][] matriz) {
        System.out.println("\nConteo de números pares e impares por columnas:");

        // Recorre cada columna de la matriz
        for (int j = 0; j < matriz[0].length; j++) {
            int pares = 0, impares = 0;

            // Cuenta los números pares e impares en cada columna
            for (int[] ints : matriz) {
                if (ints[j] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }

            // Muestra el resultado del conteo por columna
            System.out.println("Columna " + (j + 1) + ": Pares = " + pares + ", Impares = " + impares);
        }
    }

    // Método para mostrar la suma total de la matriz
    private void mostrarSumaMatriz(int[][] matriz) {
        int sumaTotal = 0;

        // Suma todos los elementos de la matriz
        for (int[] fila : matriz) {
            for (int valor : fila) {
                sumaTotal += valor;
            }
        }

        // Muestra la suma total de la matriz
        System.out.println("\nLa suma total de la matriz es: " + sumaTotal);
    }
}
