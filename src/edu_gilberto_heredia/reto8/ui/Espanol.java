package edu_gilberto_heredia.reto8.ui;


public class Espanol extends Textos {
    public Espanol () {
        menu = """
                 -----CALCULADORA ARITMÉTICA-----
                 Bienvenido. Elija una de las opciones:
                 a. Suma
                 b. Resta
                 c. Multiplicación
                 d. División
                 e. Módulo (residuo)
                 f. Potencia
                 g. Raíz
                 h. Logaritmo
                 ---------------------------------""";
        operaciones = "Operación aritmética:";
        opcionNoValida = "Ingresa una opción válida.";
        valorX = "Ingrese el primer valor: ";
        valorY = "Ingrese el segundo valor: ";
        argumento = "Ingrese el valor del argumento: ";
        base = "Ingrese el valor de la base:";
        resultado = "El resultado de su operación es: ";
        operacionNoValida = "Operación no válida";
        error = "Error al realizar la operación: ";
        elegirDeNuevoSalir = "\nElija de nuevo con 's', o presione 'n' para salir de la aplicación.";
        gracias = "Gracias por usar el programa, vuelva pronto.";
        numValido = "Ingresa un número válido:";
        sobreCero = "No divida sobre 0.";
        expNegativo = "No use exponentes negativos.";
        logNoDefinido = "El logaritmo no está definido para los valores que ingresó.";

    }
}
