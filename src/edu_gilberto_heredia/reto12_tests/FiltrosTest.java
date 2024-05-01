package edu_gilberto_heredia.reto12_tests;

import edu_gilberto_heredia.reto11.process.ContadorPalabras;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.*;

/**
 * Esta clase contiene pruebas unitarias para la clase ContadorPalabras.
 * Estas pruebas cubren varios escenarios, incluidos casos de archivos no encontrados, archivos vacíos y archivos con contenido específico.
 */
public class FiltrosTest {
    /**
     * Prueba el método contarPalabras con un archivo que contiene símbolos.
     */
    @Test
    public void contarPalabrasSimbolosTest() {
        ContadorPalabras contadorPalabras = new ContadorPalabras();
        String nombreArchivo = "simbolos.txt";

        ByteArrayInputStream inputStream = new ByteArrayInputStream("p@l@br@s con sm¡bolos p@r@ ver como re@cc¡n@n los metodos ".getBytes());
        System.setIn(inputStream);

        contadorPalabras.contarPalabras.accept(nombreArchivo);

        System.setIn(System.in);
    }

    /**
     * Prueba el manejo de excepciones cuando el archivo no se encuentra al contar palabras.
     */
    @Test
    public void contarPalabrasArchivoNoEncontradoTest() {
        ContadorPalabras contadorPalabras = new ContadorPalabras();
        String nombreArchivo = "archivo_que_no_existe.txt";

        assertThrows(Exception.class, () -> contadorPalabras.contarPalabras.accept(nombreArchivo));
    }

    /**
     * Prueba el conteo de vocales cuando el archivo no se encuentra.
     */
    @Test
    public void contarVocalesArchivoNoEncontradoTest() {
        ContadorPalabras contador = new ContadorPalabras();
        String nombreArchivo = "archivo_que_no_existe.txt";

        assertEquals(0, contador.contarVocales(nombreArchivo));
    }

    /**
     * Prueba el manejo de excepciones al imprimir palabras que empiezan con vocal cuando el archivo no se encuentra.
     */
    @Test
    public void imprimirPalabrasQueEmpiezanConVocalArchivoNoEncontradoTest() {
        ContadorPalabras contadorPalabras = new ContadorPalabras();
        String nombreArchivo = "archivo_que_no_existe.txt";

        assertThrows(Exception.class, () -> contadorPalabras.imprimirPalabrasQueEmpiezanConVocal(nombreArchivo));
    }

    /**
     * Prueba el método para imprimir palabras con un número impar de letras cuando el archivo no se encuentra.
     */
    @Test
    public void imprimirPalabrasConNumeroImparDeLetrasArchivoNoEncontradoTest() {
        ContadorPalabras contadorPalabras = new ContadorPalabras();
        String nombreArchivo = "archivo_que_no_existe.txt";

        contadorPalabras.imprimirPalabrasConNumeroImparDeLetras(nombreArchivo);
    }

    /**
     * Prueba el método para encontrar la palabra más larga cuando el archivo no se encuentra.
     */
    @Test
    public void encontrarPalabraMasLargaArchivoNoEncontradoTest() {
        ContadorPalabras contadorPalabras = new ContadorPalabras();
        String nombreArchivo = "archivo_que_no_existe.txt";

        assertNull(contadorPalabras.encontrarPalabraMasLarga(nombreArchivo));
    }

    /**
     * Prueba el método para encontrar la palabra más corta cuando el archivo no se encuentra.
     */
    @Test
    public void encontrarPalabraMasCortaArchivoNoEncontradoTest() {
        ContadorPalabras contadorPalabras = new ContadorPalabras();
        String nombreArchivo = "archivo_que_no_existe.txt";

        assertNull(contadorPalabras.encontrarPalabraMasCorta(nombreArchivo));
    }

    /**
     * Prueba el criterio de vocales cuando el archivo no se encuentra.
     */
    @Test
    public void criterioVocalesArchivoNoEncontradoTest() {
        ContadorPalabras contadorPalabras = new ContadorPalabras();
        String nombreArchivo = "archivo_que_no_existe.txt";

        assertNull(contadorPalabras.criterioVocales(nombreArchivo));
    }

    /**
     * Prueba el conteo de palabras en un archivo vacío.
     */
    @Test
    public void contarPalabrasVacioTest() {
        ContadorPalabras contadorPalabras = new ContadorPalabras();
        String nombreArchivo = "vacio.txt";

        ByteArrayInputStream emptyInput = new ByteArrayInputStream(new byte[0]);
        System.setIn(emptyInput);
        contadorPalabras.contarPalabras.accept(nombreArchivo);

        System.setIn(System.in);
    }

    /**
     * Prueba el conteo de vocales en un archivo vacío.
     */
    @Test
    public void contarVocalesVacioTest() {
        ContadorPalabras contador = new ContadorPalabras();
        String nombreArchivo = "vacio.txt";

        long resultado = contador.contarVocales(nombreArchivo);

        assertEquals(0, resultado);
    }

    /**
     * Prueba el método para imprimir palabras que empiezan con vocal en un archivo vacío.
     */
    @Test
    public void imprimirPalabrasQueEmpiezanConVocalVacioTest() {
        ContadorPalabras contadorPalabras = new ContadorPalabras();
        String nombreArchivo = "vacio.txt";

        ByteArrayInputStream emptyInput = new ByteArrayInputStream(new byte[0]);
        System.setIn(emptyInput);

        assertThrows(IllegalArgumentException.class, () -> contadorPalabras.imprimirPalabrasQueEmpiezanConVocal(nombreArchivo));

        System.setIn(System.in);
    }

    /**
     * Prueba el método para imprimir palabras con un número impar de letras en un archivo vacío.
     */
    @Test
    public void imprimirPalabrasConNumeroImparDeLetrasVacioTest() {
        ContadorPalabras contadorPalabras = new ContadorPalabras();
        String nombreArchivo = "vacio.txt";

        ByteArrayInputStream emptyInput = new ByteArrayInputStream(new byte[0]);
        System.setIn(emptyInput);

        contadorPalabras.imprimirPalabrasConNumeroImparDeLetras(nombreArchivo);

        System.setIn(System.in);
    }

    /**
     * Prueba para encontrar la palabra más larga en un archivo vacío.
     */
    @Test
    public void encontrarPalabraMasLargaVacioTest() {
        ContadorPalabras contadorPalabras = new ContadorPalabras();
        String nombreArchivo = "vacio.txt";

        ByteArrayInputStream emptyInput = new ByteArrayInputStream(new byte[0]);
        System.setIn(emptyInput);

        assertNull(contadorPalabras.encontrarPalabraMasLarga(nombreArchivo));

        System.setIn(System.in);
    }

    /**
     * Prueba para encontrar la palabra más corta en un archivo vacío.
     */
    @Test
    public void encontrarPalabraMasCortaVacioTest() {
        ContadorPalabras contadorPalabras = new ContadorPalabras();
        String nombreArchivo = "vacio.txt";

        ByteArrayInputStream emptyInput = new ByteArrayInputStream(new byte[0]);
        System.setIn(emptyInput);

        assertNull(contadorPalabras.encontrarPalabraMasCorta(nombreArchivo));

        System.setIn(System.in);
    }

    /**
     * Prueba el criterio de vocales en un archivo vacío.
     */
    @Test
    public void criterioVocalesVacioTest() {
        ContadorPalabras contadorPalabras = new ContadorPalabras();
        String nombreArchivo = "vacio.txt";

        ByteArrayInputStream emptyInput = new ByteArrayInputStream(new byte[0]);
        System.setIn(emptyInput);

        assertNull(contadorPalabras.criterioVocales(nombreArchivo));

        System.setIn(System.in);
    }

    /**
     * Prueba el conteo de palabras en un archivo de números.
     */
    @Test
    public void contarPalabrasLibroNumeroTest() {
        ContadorPalabras contador = new ContadorPalabras();
        String nombreArchivo = "numeros.txt";

        ByteArrayInputStream inputStream = new ByteArrayInputStream("1 2 3 4 5".getBytes());
        System.setIn(inputStream);

        contador.contarPalabras.accept(nombreArchivo);

        System.setIn(System.in);
    }

    /**
     * Prueba contarVocalesLibroMayusculasTest().
     * Verifica que se cuenten correctamente las vocales en un archivo con letras mayúsculas.
     */
    @Test
    public void contarVocalesLibroMayusculasTest() {
        ContadorPalabras contador = new ContadorPalabras();

        String nombreArchivo = "mayusculas.txt";
        long resultado = contador.contarVocales(nombreArchivo);

        assertEquals(25, resultado);
    }

    /**
     * Prueba filtroPalabraEspecialLibroMayusculasTest().
     * Verifica que no se encuentren palabras especiales en un archivo con letras mayúsculas.
     */
    @Test
    public void filtroPalabraEspecialLibroMayusculasTest() {
        ContadorPalabras contador = new ContadorPalabras();
        String nombreArchivo = "mayusculas.txt";

        ByteArrayInputStream emptyInput = new ByteArrayInputStream(new byte[0]);
        System.setIn(emptyInput);

        assertNull(contador.criterioVocales(nombreArchivo));

        System.setIn(System.in);
    }


    /**
     * Prueba encontrarPalabraMasLargaTest().
     * Verifica que se encuentre correctamente la palabra más larga en un archivo dado.
     */
    @Test
    public void encontrarPalabraMasLargaTest() {
        ContadorPalabras contadorPalabras = new ContadorPalabras();
        String nombreArchivo = "palabras_largas.txt";

        // Redirigir la entrada estándar para que apunte al archivo de palabras largas
        ByteArrayInputStream inputStream = new ByteArrayInputStream("hello elephant cucumber".getBytes());
        System.setIn(inputStream);

        // Verificar que encuentra una de las palabras más largas esperadas
        String palabraMasLarga = contadorPalabras.encontrarPalabraMasLarga(nombreArchivo);
        assertTrue(palabraMasLarga.equals("cucumber") || palabraMasLarga.equals("elephant"));

        // Restaurar la entrada estándar
        System.setIn(System.in);
    }

    /**
     * Prueba encontrarPalabraMasCortaTest().
     * Verifica que se encuentre correctamente la palabra más corta en un archivo dado.
     */
    @Test
    public void encontrarPalabraMasCortaTest() {
        ContadorPalabras contadorPalabras = new ContadorPalabras();
        String nombreArchivo = "palabras_cortas.txt";

        // Redirigir la entrada estándar para que apunte al archivo de palabras cortas
        ByteArrayInputStream inputStream = new ByteArrayInputStream("cats dogs ant".getBytes());
        System.setIn(inputStream);

        // Verificar que encuentra la palabra más corta esperada
        String palabraMasCorta = contadorPalabras.encontrarPalabraMasCorta(nombreArchivo);
        assertEquals("ant", palabraMasCorta);

        // Restaurar la entrada estándar
        System.setIn(System.in);
    }

    /**
     * Prueba contarVocalesLibroNumerosTest().
     * Verifica que el recuento de vocales sea correcto en un archivo que contiene solo números.
     */
    @Test
    public void contarVocalesLibroNumerosTest(){
        ContadorPalabras contador = new ContadorPalabras();
        String nombreArchivo = "numeros.txt";

        long resultado = contador.contarVocales(nombreArchivo);

        //Verificar que el resultado es 0
        assertEquals(0, resultado);
    }

    /**
     * Prueba contarVocalesLibroPalabrasLargasTest().
     * Verifica que el recuento de vocales sea correcto en un archivo que contiene palabras largas.
     */
    @Test
    public void contarVocalesLibroPalabrasLargasTest(){
        ContadorPalabras contador = new ContadorPalabras();
        String nombreArchivo = "palabras_largas.txt";

        long resultado = contador.contarVocales(nombreArchivo);

        //Verificar que el resultado es 8
        assertEquals(8, resultado);
    }

    /**
     * Prueba contarVocalesLibroPalabrasCortasTest().
     * Verifica que el recuento de vocales sea correcto en un archivo que contiene palabras cortas.
     */
    @Test
    public void contarVocalesLibroPalabrasCortasTest(){
        ContadorPalabras contador = new ContadorPalabras();
        String nombreArchivo = "palabras_cortas.txt";

        long resultado = contador.contarVocales(nombreArchivo);

        //Verificar que el resultado es 3
        assertEquals(3, resultado);
    }

    /**
     * Prueba contarVocalesLibroPalabrasConNumerosTest().
     * Verifica que el recuento de vocales sea correcto en un archivo que contiene palabras con números.
     */
    @Test
    public void contarVocalesLibroPalabrasConNumerosTest(){
        ContadorPalabras contador = new ContadorPalabras();
        String nombreArchivo = "palabras_con_numeros.txt";

        long resultado = contador.contarVocales(nombreArchivo);

        //Verificar que el resultado es 1
        assertEquals(1, resultado);
    }

    /**
     * Prueba contarVocalesLibroSimbolosTest().
     * Verifica que el recuento de vocales sea correcto en un archivo que contiene símbolos.
     */
    @Test
    public void contarVocalesLibroSimbolosTest(){
        ContadorPalabras contador = new ContadorPalabras();
        String nombreArchivo = "simbolos.txt";

        long resultado = contador.contarVocales(nombreArchivo);

        //Verificar que el resultado es 11
        assertEquals(11, resultado);
    }

    /**
     * Prueba contarPalabrasTest().
     * Verifica que se cuenten correctamente las palabras en un archivo dado.
     */
    @Test
    public void contarPalabrasTest() {
        ContadorPalabras contadorPalabras = new ContadorPalabras();
        String nombreArchivo = "prueba_1.txt";

        // Redirigir la entrada estándar para que apunte a un archivo de prueba con contenido conocido
        String contenidoArchivo = "este es un archivo de prueba con varias palabras palabras palabras";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(contenidoArchivo.getBytes());
        System.setIn(inputStream);

        // Llamar al método contarPalabras y verificar el resultado
        contadorPalabras.contarPalabras.accept(nombreArchivo);

        // Restaurar la entrada estándar
        System.setIn(System.in);
    }

    /**
     * Prueba contarVocalesTest().
     * Verifica que se cuenten correctamente las vocales en un archivo dado.
     */
    @Test
    public void contarVocalesTest() {
        ContadorPalabras contadorPalabras = new ContadorPalabras();
        String nombreArchivo = "prueba_2.txt";

        // Redirigir la entrada estándar para que apunte a un archivo de prueba con contenido conocido
        String contenidoArchivo = "este es un archivo de prueba con varias vocales";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(contenidoArchivo.getBytes());
        System.setIn(inputStream);

        // Llamar al método contarVocales y verificar el resultado
        long resultado = contadorPalabras.contarVocales(nombreArchivo);
        assertEquals(18, resultado);

        // Restaurar la entrada estándar
        System.setIn(System.in);
    }

    /**
     * Prueba imprimirPalabrasQueEmpiezanConVocalTest().
     * Verifica que se impriman correctamente las palabras que empiezan con vocal en un archivo dado.
     */
    @Test
    public void imprimirPalabrasQueEmpiezanConVocalTest() {
        ContadorPalabras contadorPalabras = new ContadorPalabras();
        String nombreArchivo = "prueba_3.txt";

        // Redirigir la entrada estándar para que apunte a un archivo de prueba con contenido conocido
        String contenidoArchivo = "apple banana cat elephant";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(contenidoArchivo.getBytes());
        System.setIn(inputStream);

        // Llamar al método imprimirPalabrasQueEmpiezanConVocal y verificar la salida
        contadorPalabras.imprimirPalabrasQueEmpiezanConVocal(nombreArchivo);

        // Restaurar la entrada estándar
        System.setIn(System.in);
    }

    /**
     * Prueba contarVocalesLibroPrueba_3Test().
     * Verifica que se cuenten correctamente las vocales en un archivo dado.
     */
    @Test
    public void contarVocalesLibroPrueba_3Test(){
        ContadorPalabras contador = new ContadorPalabras();
        String nombreArchivo = "prueba_3.txt";

        long resultado = contador.contarVocales(nombreArchivo);

        //Verificar que el resultado es 9
        assertEquals(9, resultado);
    }

    /**
     * Prueba contarVocalesLibroPrueba_1Test().
     * Verifica que se cuenten correctamente las vocales en un archivo dado.
     */
    @Test
    public void contarVocalesLibroPrueba_1Test(){
        ContadorPalabras contador = new ContadorPalabras();
        String nombreArchivo = "prueba_1.txt";

        long resultado = contador.contarVocales(nombreArchivo);

        //Verificar que el resultado es 24
        assertEquals(24, resultado);
    }
}
