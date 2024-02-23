// Usuario.java
package edu_gilberto_heredia.reto5.data;

import java.util.Scanner;

public class Usuario {
    private String nombreUsuario;
    private String contrasena;

    public Usuario(String nombreUsuario, String contrasena) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public boolean verificarCredenciales(String nombreUsuario, String contrasena) {
        return this.nombreUsuario.equals(nombreUsuario) && this.contrasena.equals(contrasena);
    }

    public static Usuario registrarUsuario() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un usuario: ");
        String nombreUsuario = scanner.next();

        System.out.print("Ahora ingrese una contraseña: ");
        String contrasena = scanner.next();

        System.out.println("Se registró con éxito.");

        // Cerrar el scanner
        scanner.close();

        return new Usuario(nombreUsuario, contrasena);
    }
}
