package edu_gilberto_heredia.reto5;
import edu_gilberto_heredia.reto5.process.Medicamentos;
import edu_gilberto_heredia.reto5.ui.CLI;

import java.util.ArrayList;

public class Main {
    //Declaración declare un ArrayList del tipo de la clase Medicamentos
    //y en otro lado acciones sobre el ArrayList para guardar los medicamentos, además de declarar atributos y métodos necesarios.
    ArrayList<String> medicamentos = new ArrayList<>();

    public static void main(String[] args) {
        /* Crear una instancia de Medicamento utilizando el constructor
        Medicamentos medicamento1 = new Medicamentos("Ibuprofeno", "Ibuprofeno Genérico", "Ibuprox",
                5.99, 8.99, "Tabletas");

        // Invocar un método de la instancia para mostrar la información
        medicamento1.mostrarInformacion();

         */

        try {
            CLI.launchProgFarmacia();
        } catch (Exception e) {
            System.out.println("Error inesperado... " + e.getMessage());
        }
    }
}
