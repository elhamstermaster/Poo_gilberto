package edu_gilberto_heredia.reto8.process;

import edu_gilberto_heredia.reto8.ui.Textos;

/**
 * Clase que representa la operación de módulo
 */
public class Modulo extends Resta {
    /**
     * Calcula el módulo (residuo) de la división de dos números enteros.
     * @param a Dividendo.
     * @param b Divisor.
     * @return Residuo de la división.
     * @throws ArithmeticException si el divisor es cero.
     */
    @Override
    public int calcular(int a, int b, Textos textos) {
        if (b == 0) throw new ArithmeticException(textos.sobreCero);
        int residuo = Math.abs(a);
        while (residuo >= Math.abs(b)) {
            residuo = super.calcular(residuo, b);
        }
        return residuo;
    }
}
