package edu_gilberto_heredia.reto7.process;
/**
 * Clase que representa la operación de multiplicación
 */
public class Multiplicacion extends Suma{
    /**
     * Calcula la multiplicación de dos números enteros.
     * @param a Primer número.
     * @param b Segundo número.
     * @return Multiplicación de los dos números.
     */
    @Override
    public int calcular(int a, int b) {
        int multiplicacion = 0;
        for (int i = 0; i < Math.abs(b); i++) {
            multiplicacion = super.calcular(multiplicacion, Math.abs(a));
        }
        if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
            multiplicacion = -multiplicacion;
        }
        return multiplicacion;
    }
}
