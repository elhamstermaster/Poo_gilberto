package edu_gilberto_heredia.reto8.ui;

public class Ingles extends Textos {
    public Ingles() {
        menu = """
                 -----ARITHMETIC CALCULATOR-----
                 Welcome. Choose one of the options:
                 a. Addition
                 b. Subtraction
                 c. Multiplication
                 d. Division
                 e. Modulus (remainder)
                 f. Power
                 g. Square Root
                 h. Logarithm
                 ---------------------------------""";
        operaciones = "Arithmetic operation:";
        opcionNoValida = "Enter a valid option.";
        valorX = "Enter the first value: ";
        valorY = "Enter the second value: ";
        argumento = "Enter the value of the argument: ";
        base = "Enter the value of the base:";
        resultado = "The result of your operation is: ";
        operacionNoValida = "Invalid operation";
        error = "Error while performing the operation: ";
        elegirDeNuevoSalir = "\nChoose again with 's', or press 'n' to exit the application.";
        gracias = "Thank you for using the program, come back soon.";
        numValido = "Enter a valid number:";
        sobreCero = "Do not divide over 0.";
        expNegativo = "Do not use negative exponents.";
        logNoDefinido = "Logarithm is not defined for the values you entered.";

    }
}
