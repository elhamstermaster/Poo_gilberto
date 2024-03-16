package edu_gilberto_heredia.reto7.process;

/**
 * Clase que representa la operación de suma.
 */
public class Suma extends OperacionAritmetica {
    /**
     * Calcula la suma de dos números enteros.
     * @param a Primer número.
     * @param b Segundo número.
     * @return Suma de los dos números.
     */
    @Override
    public int calcular(int a, int b) {
        return a + b;
    }
}
