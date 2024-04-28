package edu_gilberto_heredia.reto12_tests;

import edu_gilberto_heredia.reto11.process.ContadorPalabras;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.assertThrows;

public class ImprimirPalabrasQueEmpiezanConVocalTest {
    @Test
    public void imprimirPalabrasQueEmpiezanConVocalTest() {
        ContadorPalabras contadorPalabras = new ContadorPalabras();
        String nombreArchivo = "vacio.txt";

        // Redirigir la entrada estándar para que apunte al archivo vacío
        ByteArrayInputStream emptyInput = new ByteArrayInputStream(new byte[0]);
        System.setIn(emptyInput);

        // Verificar que se arroja una excepción al intentar imprimir palabras con un archivo vacío
        assertThrows(IllegalArgumentException.class, () -> contadorPalabras.imprimirPalabrasQueEmpiezanConVocal(nombreArchivo));

        // Restaurar la entrada estándar
        System.setIn(System.in);
    }
}
