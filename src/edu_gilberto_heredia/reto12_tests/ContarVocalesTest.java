package edu_gilberto_heredia.reto12_tests;

import edu_gilberto_heredia.reto11.process.ContadorPalabras;
import org.junit.Test;

public class ContarVocalesTest {
    @Test
    public void contarVocalesTest() {
        ContadorPalabras contador = new ContadorPalabras();

        //Prueba con un archivo vacío
        String nombreArchivo = "vacio.txt";
        long resultado = contador.contarVocales(nombreArchivo);

        //Verificar que el resultado es 0
        assert resultado == 0;
    }
}
