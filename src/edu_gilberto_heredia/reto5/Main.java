/**
 * Clase principal que inicia la aplicación y maneja la interacción con el usuario.
 */
package edu_gilberto_heredia.reto5;

import edu_gilberto_heredia.reto5.data.Usuario;
import edu_gilberto_heredia.reto5.process.Medicamentos;
import edu_gilberto_heredia.reto5.ui.CLI;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /**
     * Lista que almacena los medicamentos registrados.
     */
    public static List<Medicamentos> listaMedicamentos = new ArrayList<>();
    /**
     * Usuario actual que ha iniciado sesión en la aplicación.
     */
    public static Usuario usuarioActual;

    /**
     * Método principal que inicia la aplicación.
     *
     * @param args Argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        //Solicitar credenciales al usuario
        System.out.println("Bienvenido al programa de control de productos de farmacia.");
        System.out.print("Ingrese un usuario: ");
        String nombreUsuario = CLI.scanner.nextLine();
        System.out.print("Ahora ingrese una contraseña: ");
        String contrasena = CLI.scanner.nextLine();

        //Crear un usuario con las credenciales proporcionadas
        usuarioActual = new Usuario(nombreUsuario, contrasena);

        //Creación de medicamentos y agregarlos al ArrayList
        Medicamentos medicamento1 = new Medicamentos("Sulfatiazol", "Polvo", 40.0, Medicamentos.TipoPresentacion.SOLIDAS, usuarioActual.getNombreUsuario());
        Medicamentos medicamento2 = new Medicamentos("Metamizol", "Cápsula", 25.0, Medicamentos.TipoPresentacion.SOLIDAS, usuarioActual.getNombreUsuario());
        Medicamentos medicamento3 = new Medicamentos("Mastical", "Comprimido", 15.5, Medicamentos.TipoPresentacion.SOLIDAS, usuarioActual.getNombreUsuario());

        Medicamentos medicamento4 = new Medicamentos("Barmicil", "Pomada", 12.0, Medicamentos.TipoPresentacion.SEMISOLIDAS, usuarioActual.getNombreUsuario());
        Medicamentos medicamento5 = new Medicamentos("Voltaren", "Crema", 14.0, Medicamentos.TipoPresentacion.SEMISOLIDAS, usuarioActual.getNombreUsuario());
        Medicamentos medicamento6 = new Medicamentos("Gel de Aloe", "Gel", 20.0, Medicamentos.TipoPresentacion.SEMISOLIDAS, usuarioActual.getNombreUsuario());

        Medicamentos medicamento7 = new Medicamentos("Pyrena", "Jarabe", 18.0, Medicamentos.TipoPresentacion.LIQUIDAS, usuarioActual.getNombreUsuario());
        Medicamentos medicamento8 = new Medicamentos("Retromicina", "Loción", 19.4, Medicamentos.TipoPresentacion.LIQUIDAS, usuarioActual.getNombreUsuario());
        Medicamentos medicamento9 = new Medicamentos("Avapena", "Inyectable", 56.3, Medicamentos.TipoPresentacion.LIQUIDAS, usuarioActual.getNombreUsuario());

        //Agregar medicamentos al ArrayList
        listaMedicamentos.add(medicamento1);
        listaMedicamentos.add(medicamento2);
        listaMedicamentos.add(medicamento3);
        listaMedicamentos.add(medicamento4);
        listaMedicamentos.add(medicamento5);
        listaMedicamentos.add(medicamento6);
        listaMedicamentos.add(medicamento7);
        listaMedicamentos.add(medicamento8);
        listaMedicamentos.add(medicamento9);

        //Lanzar la interfaz de línea de comandos
        CLI.launchProgFarmacia(listaMedicamentos, usuarioActual);
    }
}
