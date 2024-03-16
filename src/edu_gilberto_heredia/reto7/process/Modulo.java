package edu_gilberto_heredia.reto7.process;
/**
 * Clase que representa la operación de módulo
 */
public class Modulo extends Resta {
    /**
     * Calcula el módulo (residuo) de la división de dos números enteros.
     * @param valor1 Dividendo.
     * @param b Divisor.
     * @return Residuo de la división.
     * @throws ArithmeticException si el divisor es cero.
     */
    @Override
    public int calcular(int valor1, int b) {
        if (b == 0) throw new ArithmeticException("No divida sobre 0.");
        int residuo = Math.abs(valor1);
        while (residuo >= Math.abs(b)) {
            residuo = super.calcular(residuo, b);
        }
        return residuo;
    }
}
