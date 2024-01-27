package edu_gilberto_heredia.reto1;
import edu_gilberto_heredia.reto1.ui.CLI;
//Una parte del código en archivos distintos.
public class Main {
    public static void main(String[] args) {
        try{
            CLI.launchCalculadoraMasas();
        }
        catch(Exception e){
            System.out.println("Error inesperado... " + e);
        }

    }
}
