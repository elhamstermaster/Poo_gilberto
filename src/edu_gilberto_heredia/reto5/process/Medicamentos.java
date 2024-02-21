package edu_gilberto_heredia.reto5.process;

import java.util.Scanner;

public class Medicamentos {
    /*
    Genera una clase llamada Medicamentos.
    Declara sus atributos y métodos.
    Haz acciones sobre el ArrayList para guardar los medicamentos, además de declarar atributos y métodos necesarios.
     */

    //Atributos de la clase de los medicamentos
    private String nombreQuimico;
    private String nombreGenerico;
    private String nombreRegistrado;
    private double precioPublico;
    private double precioDeVenta;
    private String tipoPresentacion;

    //Constructor de la clase
    public Medicamentos(String nombreQuimico, String nombreGenerico, String nombreRegistrado,
                           double precioPublico, double precioDeVenta, String tipoPresentacion) {
        this.nombreQuimico = nombreQuimico;
        this.nombreGenerico = nombreGenerico;
        this.nombreRegistrado = nombreRegistrado;
        this.precioPublico = precioPublico;
        this.precioDeVenta = precioDeVenta;
        this.tipoPresentacion = tipoPresentacion;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre Químico: " + nombreQuimico);
        System.out.println("Nombre Genérico: " + nombreGenerico);
        System.out.println("Nombre Registrado: " + nombreRegistrado);
        System.out.println("Precio Público: " + precioPublico);
        System.out.println("Precio de Venta: " + precioDeVenta);
        System.out.println("Tipo de Presentación: " + tipoPresentacion);
    }


    public static void registrarIniciarSesion(){
        Scanner userScanner = new Scanner(System.in);
        Scanner passwordScanner = new Scanner(System.in);

        System.out.print("Ingrese primero un usuario: ");
        String user = userScanner.next();
        System.out.print("Ahora ingrese lo que será su contraseña: ");
        String password = passwordScanner.next();

        System.out.println("Se registró con éxito. Ahora inicie su sesión.");
        System.out.print("Usuario: ");
        String inputUser = userScanner.next();

        System.out.print("Contraseña: ");
        String inputPassword = passwordScanner.next();

        if(inputUser.equals(user) && inputPassword.equals(password)) {
            System.out.println("Sesión aprobada, puede continuar.");

        } else {
            System.out.println("Usuario o contraseña incorrectos. Sesión no aprobada.");
            registrarIniciarSesion();
        }
    }



}
