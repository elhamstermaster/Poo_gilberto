package edu_gilberto_heredia.reto7.process;
/**
 * Clase que representa la operación de división.
 */
public class Division extends Resta {
    /**
     * Calcula la división de dos números enteros.
     * @param a Dividendo.
     * @param b Divisor.
     * @return Cociente de la división.
     * @throws ArithmeticException si el divisor es cero.
     */
    @Override
    public int calcular(int a, int b) {
        int division = 0;
        int residuo = Math.abs(a);
        while (residuo >= Math.abs(b)) {
            residuo = super.calcular(residuo, b);
            division++;

        if (b == 0) {
            throw new ArithmeticException("No divida sobre 0.");
            }
        }

        if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
            division = -division;
        }
        return division;
    }
}
