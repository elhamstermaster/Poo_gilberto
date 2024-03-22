package edu_gilberto_heredia.reto8.process;

import edu_gilberto_heredia.reto8.ui.Textos;

public class Logaritmo extends Division {
    @Override
    public int calcular(int a, int b, Textos textos) {

        if (a <= 1 || b <= 0)
            throw new ArithmeticException(textos.logNoDefinido);

        int logaritmo = 0;
        int argumento = a;
        while (argumento > 1) {
            argumento = super.calcular(argumento, b);
            logaritmo++;
        }
        return logaritmo;
    }
}

