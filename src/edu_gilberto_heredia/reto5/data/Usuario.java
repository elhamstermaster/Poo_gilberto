// Usuario.java
package edu_gilberto_heredia.reto5.data;

/**
 * La clase Usuario representa a un usuario del sistema de control de productos de farmacia.
 */
public class Usuario {
    private String nombreUsuario;
    private String contrasena;

    /**
     * Constructor para crear un objeto Usuario con el nombre de usuario y contraseña proporcionados.
     *
     * @param nombreUsuario El nombre de usuario del nuevo usuario.
     * @param contrasena    La contraseña del nuevo usuario.
     */
    public Usuario(String nombreUsuario, String contrasena) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }

    /**
     * Obtiene el nombre de usuario.
     *
     * @return El nombre de usuario.
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * Obtiene la contraseña.
     *
     * @return La contraseña.
     */
    public String getContrasena() {
        return contrasena;
    }
}