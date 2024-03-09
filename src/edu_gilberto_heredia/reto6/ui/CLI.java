package edu_gilberto_heredia.reto6.ui;

import edu_gilberto_heredia.reto6.process.RegistroEmpleados;

public class CLI {
    public static void launchRegistroNomina() {
        System.out.println("Bienvenido al programa de generación de nómina desde Recursos Humanos.");
        RegistroEmpleados.registrarEmpleados();
    }
}
