package edu_gilberto_heredia.reto8.process;


import edu_gilberto_heredia.reto8.ui.Textos;

/**
 * Clase que representa la operación de raíz cuadrada.
 */
public abstract class Raiz extends Multiplicacion {

    @Override
    public int calcular(int a, int b, Textos textos) {
        if (a < 0) throw new ArithmeticException(textos.numValido);

        if (b < 0) throw new ArithmeticException(textos.numValido);

        int raiz;
        int potencias = 0;
        int validar = 0;
        int aprox = 1;

        while (potencias < a) {
            validar = aprox;
            potencias = 1;
            for (int i = 0; i < b; i++) {
                potencias = super.calcular(potencias, aprox);
            }
            aprox++;
        }
        raiz = validar;

        return raiz;
    }
}