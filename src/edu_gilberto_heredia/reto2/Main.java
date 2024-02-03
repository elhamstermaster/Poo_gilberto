package edu_gilberto_heredia.reto2;
import edu_gilberto_heredia.reto2.UI.CLI;
//Comentario para poder hacer commit
public class Main {
    public static void main(String[] args) {
        try {
            CLI.mostrarMenuAcceso();
        } catch (Exception e) {
            System.out.println("Error inesperado... " + e);
        }
    }
}
