package edu_gilberto_heredia.reto7.process;

/**
 * Clase abstracta que define una operación aritmética básica
 */
public abstract class OperacionAritmetica {
    /**
     * Método abstracto para realizar una operación aritmética.
     * @param a Primer operando.
     * @param b Segundo operando.
     * @return Resultado de la operación.
     */
    public abstract int calcular(int a, int b);
}
