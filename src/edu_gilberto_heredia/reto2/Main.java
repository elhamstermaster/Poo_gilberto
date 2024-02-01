package edu_gilberto_heredia.reto2;
import edu_gilberto_heredia.reto2.UI.CLI;

public class Main {
    public static void main(String[] args) {
        try{
            CLI.mostrarMenu();
        }
        catch(Exception e){
            System.out.println("Error inesperado... " + e);
        }

    }
}
