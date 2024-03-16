package edu_gilberto_heredia.reto7.process;

/**
 * Clase que representa la operación de potencia
 */
public class Potencia extends Multiplicacion{
    /**
     * Calcula la potencia de un número entero.
     * @param valor1 Base.
     * @param b Exponente.
     * @return Resultado de la potencia.
     * @throws ArithmeticException si el exponente es negativo.
     */
    @Override
    public int calcular(int valor1, int b) {
        if (b < 0) throw new ArithmeticException("No uses exponentes negativos");
        int potencia = 1;
        for (int i = 0; i < Math.abs(b); i++) {
            potencia = super.calcular(potencia, Math.abs(valor1));
        }
        int residuo = Math.abs(b);
        while (residuo >= 2) {
            residuo -= 2;
        }
        if (valor1 < 0 && residuo != 0) {
            potencia = -potencia;
        }
        return potencia;
    }
}