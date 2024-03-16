package edu_gilberto_heredia.reto7.process;
//
public class Division extends OperacionAritmetica {
    @Override
    public int calcular(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("División por cero");
        }
        int resultado = 0;
        int signo = (a < 0) ^ (b < 0) ? -1 : 1;
        a = Math.abs(a);
        b = Math.abs(b);
        while (a >= b) {
            a -= b;
            resultado++;
        }
        return signo * resultado;
    }
}
