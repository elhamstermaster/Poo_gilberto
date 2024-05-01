package edu_gilberto_heredia.reto12_tests;

import edu_gilberto_heredia.reto7.process.OperacionAritmetica;
import edu_gilberto_heredia.reto7.process.Suma;
import org.junit.Assert;
import org.junit.Test;

public class ContarPalabrasTest {

    @Test
    public void contarPalabrasTest() {
        OperacionAritmetica operacionAritmetica  = new Suma();
        final int op1 = 5;
        final int op2 = 6;

        int resultado = operacionAritmetica.calcular(op1, op2);

        Assert.assertEquals(op1 + op2, resultado);
    }
}
