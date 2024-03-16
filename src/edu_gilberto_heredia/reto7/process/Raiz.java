package edu_gilberto_heredia.reto7.process;

public class Raiz extends OperacionAritmetica {

    public Raiz() {
    }

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
