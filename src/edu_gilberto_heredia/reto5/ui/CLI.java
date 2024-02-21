package edu_gilberto_heredia.reto5.ui;

import static edu_gilberto_heredia.reto5.process.Medicamentos.registrarIniciarSesion;

public class CLI {
    public static void launchProgFarmacia(){
        System.out.println("Bienvenido al programa de control de productos de farmacia.\n" +
                            "Con esto se controlan los datos de productos del catálogo de producción.\n" +
                            "Por favor, regístrese e inicie sesión en su cuenta.\n");
        registrarIniciarSesion();
    }

}
