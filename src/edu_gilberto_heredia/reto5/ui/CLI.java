package edu_gilberto_heredia.reto5.ui;
import edu_gilberto_heredia.reto5.process.Medicamentos;
import static edu_gilberto_heredia.reto5.Main.listaMedicamentos;


public class CLI {
    public static void launchProgFarmacia(){
        System.out.println("""
                Bienvenido al programa de control de productos de farmacia.
                Con esto se controlan los datos de productos del catálogo de producción.
                Por favor, regístrese e inicie sesión en su cuenta.
                """);
        Medicamentos.registrarIniciarSesion(listaMedicamentos);
    }

}
