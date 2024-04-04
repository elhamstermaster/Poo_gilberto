package edu_gilberto_heredia.reto8.process;

import edu_gilberto_heredia.reto8.ui.Textos;

/**
 * Clase que representa la operación de logaritmo.
 */
public class Logaritmo extends Division {

    /**
     * Calcula el logaritmo de un número entero.
     *
     * @param a      Número sobre el cual se calculará el logaritmo.
     * @param b      Base del logaritmo.
     * @param textos Objeto que contiene los textos para la interfaz de usuario.
     * @return El logaritmo entero calculado.
     * @throws ArithmeticException si el argumento es menor o igual a 1 o la base es menor o igual a 0.
     */
    @Override
    public int calcular(int a, int b, Textos textos) {

        if (a <= 1 || b <= 0)
            throw new ArithmeticException(textos.logNoDefinido);

        int logaritmo = 0;
        int argumento = a;
        while (argumento > 1) {
            argumento = super.calcular(argumento, b);
            logaritmo++;
        }
        return logaritmo;
    }
}
