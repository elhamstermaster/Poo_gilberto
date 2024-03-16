package edu_gilberto_heredia.reto7.process;

public class Multiplicacion extends OperacionAritmetica {
    @Override
    public int calcular(int a, int b) {
        int resultado = 0;
        for (int i = 0; i < Math.abs(b); i++) {
            resultado += a;
        }
        return b >= 0 ? resultado : -resultado;
    }
}
