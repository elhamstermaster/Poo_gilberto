package edu_gilberto_heredia.reto8.process;

import edu_gilberto_heredia.reto8.ui.Textos;

/**
 * Clase que representa la operación de potencia.
 */
public class Potencia extends Multiplicacion {
    /**
     * Calcula la potencia de un número entero.
     * @param a Base.
     * @param b Exponente.
     * @return Resultado de la potencia.
     * @throws ArithmeticException si el exponente es negativo
     */
    @Override
    public int calcular(int a, int b, Textos textos) {
        if (b < 0) throw new ArithmeticException(textos.expNegativo);
        int potencia = 1;
        for (int i = 0; i < Math.abs(b); i++) {
            potencia = super.calcular(potencia, Math.abs(a));
        }
        int residuo = Math.abs(b);
        while (residuo >= 2) {
            residuo -= 2;
        }
        if (a < 0 && residuo != 0) {
            potencia = -potencia;
        }
        return potencia;
    }
}