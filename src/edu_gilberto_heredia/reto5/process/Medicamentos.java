package edu_gilberto_heredia.reto5.process;

import java.util.ArrayList;
import java.util.Scanner;


public class Medicamentos {

    public static void registrarIniciarSesion(ArrayList<Medicamentos> listaMedicamentos) {
        Scanner userScanner = new Scanner(System.in);
        Scanner passwordScanner = new Scanner(System.in);

        System.out.print("Ingrese un usuario: ");
        String user = userScanner.next();
        System.out.print("Ahora ingrese lo que será su contraseña: ");
        String password = passwordScanner.next();

        System.out.println("Se registró con éxito. Ahora inicie su sesión.");
        System.out.print("Usuario: ");
        String inputUser = userScanner.next();

        System.out.print("Contraseña: ");
        String inputPassword = passwordScanner.next();

        if (inputUser.equals(user) && inputPassword.equals(password)) {
            System.out.println("Sesión aprobada, puede continuar.");
            mostrarTodosLosMedicamentos(listaMedicamentos);

        } else {
            System.out.println("Usuario o contraseña incorrectos. Sesión no aprobada.");
            registrarIniciarSesion(listaMedicamentos);
        }
    }

    public static void mostrarTodosLosMedicamentos(ArrayList<Medicamentos> listaMedicamentos) {
        //Mostrar información de todos los medicamentos en el ArrayList
        for (Medicamentos medicamento : listaMedicamentos) {
            medicamento.mostrarInformacion();
            System.out.println("=============================");
        }
    }

    public enum TipoPresentacion {
        SOLIDAS,
        SOLIDAS_SEMISOLIDAS,
        SOLIDAS_LIQUIDAS
    }

    private String nombreQuimico;
    private String nombreGenerico;
    private String nombreRegistrado;
    private double precioPublico;
    private double precioDeVenta;
    private TipoPresentacion tipoPresentacion;

    public Medicamentos(String nombreQuimico, String nombreGenerico, String nombreRegistrado,
                        double precioPublico, TipoPresentacion tipoPresentacion) {
        this.nombreQuimico = nombreQuimico;
        this.nombreGenerico = nombreGenerico;
        this.nombreRegistrado = nombreRegistrado;
        this.precioPublico = precioPublico;
        this.tipoPresentacion = tipoPresentacion;
        calcularPrecioVenta();
    }

    private void calcularPrecioVenta() {
        double porcentajeAdicional = 0.0;

        switch (tipoPresentacion) {
            case SOLIDAS:
                porcentajeAdicional = 0.09;
                break;
            case SOLIDAS_SEMISOLIDAS:
                porcentajeAdicional = 0.12;
                break;
            case SOLIDAS_LIQUIDAS:
                porcentajeAdicional = 0.13;
                break;
        }

        precioDeVenta = precioPublico + (precioPublico * porcentajeAdicional);
    }

    public void mostrarInformacion() {
        System.out.println("Nombre Químico: " + nombreQuimico);
        System.out.println("Nombre Genérico: " + nombreGenerico);
        System.out.println("Nombre Registrado: " + nombreRegistrado);
        System.out.println("Precio Público: " + precioPublico);
        System.out.println("Precio de Venta: " + precioDeVenta);
        System.out.println("Tipo de Presentación: " + tipoPresentacion);
    }
}

