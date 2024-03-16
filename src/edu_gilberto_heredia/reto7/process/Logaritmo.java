package edu_gilberto_heredia.reto7.process;

public class Logaritmo extends OperacionAritmetica {
    private int base;

    public Logaritmo(int base) {
        if (base <= 0 || base == 1) {
            throw new IllegalArgumentException("Los valores del argumento y la base deben ser mayores que uno, y la base no puede ser igual a uno");
        }
        this.base = base;
    }

    @Override
    public int calcular(int a, int b) {
        if (a <= 0) {
            throw new IllegalArgumentException("El valor del argumento debe ser mayor que uno");
        }
        if (base <= 1) {
            throw new IllegalArgumentException("El valor de la base debe ser mayor que uno y no puede ser igual a uno");
        }

        int resultado = 0;
        int potencia = 1; // Inicializamos la potencia en 1, ya que estamos calculando el logaritmo

        // Incrementamos la potencia multiplicando por la base hasta que sea mayor que 'a'
        while (potencia <= a) {
            potencia = sumar(potencia, base); // Sumamos la base a la potencia
            resultado = sumar(resultado, 1); // Incrementamos el resultado en cada iteración
        }

        // Decrementamos el resultado si la potencia excede 'a'
        if (potencia > a) {
            resultado = restar(resultado, 1); // Restamos 1 al resultado
        }

        return resultado;
    }

    // Método para realizar la suma utilizando solo operaciones de suma
    private int sumar(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }

    // Método para realizar la resta utilizando solo operaciones de suma
    private int restar(int a, int b) {
        b = sumar(~b, 1); // Negamos 'b' y sumamos 1 para obtener el complemento a 2
        return sumar(a, b);
    }
}
