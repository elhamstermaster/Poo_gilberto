package edu_gilberto_heredia.reto8.process;

/**
 * Clase que representa la operación de raíz cuadrada.
 */
public class Raiz extends OperacionAritmetica {

    /**
     * Calcula la raíz cuadrada entera de un número entero.
     * @param a Número del cual se calculará la raíz.
     * @param b Este parámetro se ignora, es usado para mantener la consistencia en la interfaz.
     * @return Raíz cuadrada entera del número.
     */
    @Override
    public int calcular(int a, int b) {
        int resultado = 0;
        int i = 1;

        while (a > 0) {
            a -= i;
            i += 2;
            if (a >= 0) resultado++;
        }

        return resultado;
    }
}
