package edu_gilberto_heredia.reto7.process;

public class Potencia extends OperacionAritmetica {
    @Override
    public int calcular(int a, int b) {
        if (b < 0) {
            throw new IllegalArgumentException("Exponente negativo no permitido");
        }
        int resultado = 1;
        for (int i = 0; i < b; i++) {
            resultado *= a;
        }
        return resultado;
    }
}
