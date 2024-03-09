package edu_gilberto_heredia.reto6;

import edu_gilberto_heredia.reto6.process.RegistroEmpleados;
//
/**
 * Clase principal que contiene el método main para ejecutar el programa de generación de nómina
 */
public class Main {
    /**
     * Método principal que inicia el programa. Crea una instancia de RegistroEmpleados y llama al método para registrar empleados.
     * @param args Argumentos de la línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {
        // Crea una instancia de RegistroEmpleados
        RegistroEmpleados registroEmpleados = new RegistroEmpleados();

        // Llama al método registrarEmpleados en la instancia de RegistroEmpleados
        registroEmpleados.registrarEmpleados();
    }
}

