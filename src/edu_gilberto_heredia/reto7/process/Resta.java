package edu_gilberto_heredia.reto7.process;

/**
 * Clase que representa la operación de resta.
 */
public class Resta extends OperacionAritmetica {
    /**
     * Calcula la resta de dos números enteros.
     * @param a Primer número (minuendo).
     * @param b Segundo número (sustraendo).
     * @return Resta de los dos números.
     */
    @Override
    public int calcular(int a, int b) {
        return a - b;
    }
}
