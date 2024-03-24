package edu_gilberto_heredia.reto8.process;

import edu_gilberto_heredia.reto8.ui.Textos;

/**
 * Clase que representa la operación de división.
 */
public class Division extends Resta {
    /**
     * Calcula la división de dos números enteros.
     * @param a Dividendo.
     * @param b Divisor.
     * @return Cociente de la división.
     * @throws ArithmeticException si el divisor es cero
     */
    @Override
    public int calcular(int a, int b, Textos textos) {
        int division = 0;
        int residuo = Math.abs(a);
        while (residuo >= Math.abs(b)) {
            residuo = super.calcular(residuo, b);
            division++;

        if (b == 0) {
            throw new ArithmeticException(textos.sobreCero);
            }
        }

        if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
            division = -division;
        }
        return division;
    }
}
