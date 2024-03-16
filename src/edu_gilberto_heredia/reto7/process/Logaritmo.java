package edu_gilberto_heredia.reto7.process;
//
public class Logaritmo extends Multiplicacion {
    @Override
    public int calcular(int a, int b) {
        if (a <= 1 || b <= 0) throw new ArithmeticException(
                "El logaritmo no está definido para los valores proporcionados");
        int logaritmo = 1;
        int multiplicacion;
        int potenciaBase = b;

        while (potenciaBase <= a) {
            multiplicacion = super.calcular(potenciaBase, b);
            potenciaBase += multiplicacion;
            logaritmo++;
        }
        int potencia = 1;
        for (int i = 0; i < logaritmo; i++) {
            potencia = super.calcular(potencia, b);
        }
        if (potencia != a) {
            System.out.println("Este logaritmo es una aproximación, donde se muestra el valor " +
                    "entero que más se aproxima a su logaritmo.");
            System.out.println("El argumento exacto que cumple este logaritmo es: " + potencia);
        }
        return logaritmo;
    }
}
