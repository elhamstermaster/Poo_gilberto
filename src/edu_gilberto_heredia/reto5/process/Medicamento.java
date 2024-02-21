package edu_gilberto_heredia.reto5.process;

import java.util.Scanner;

public class Medicamento {
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
