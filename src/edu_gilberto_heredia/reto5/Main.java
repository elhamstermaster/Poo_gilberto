package edu_gilberto_heredia.reto5;

import edu_gilberto_heredia.reto5.process.Medicamentos;
import edu_gilberto_heredia.reto5.ui.CLI;

import java.util.ArrayList;

public class Main {
    //Crear un ArrayList del tipo Medicamentos
    public static ArrayList<Medicamentos> listaMedicamentos = new ArrayList<>();

    public static void main(String[] args) {
        // Ejemplo de creación de medicamentos y agregarlos al ArrayList
        Medicamentos medicamento1 = new Medicamentos("Bencenosulfonamida", "Polvo", "Sulfatiazol", 10.0, Medicamentos.TipoPresentacion.SOLIDAS);
        Medicamentos medicamento2 = new Medicamentos("NombreQuimico2", "NombreGenerico2", "NombreRegistrado2", 15.2, Medicamentos.TipoPresentacion.SOLIDAS);
        Medicamentos medicamento3 = new Medicamentos("NombreQuimico3", "NombreGenerico3", "NombreRegistrado3", 8.5, Medicamentos.TipoPresentacion.SOLIDAS);

        Medicamentos medicamento4 = new Medicamentos("", "", "", 10.0, Medicamentos.TipoPresentacion.SOLIDAS_SEMISOLIDAS);
        Medicamentos medicamento5 = new Medicamentos("", "", "", 10.0, Medicamentos.TipoPresentacion.SOLIDAS_SEMISOLIDAS);
        Medicamentos medicamento6 = new Medicamentos("", "", "", 10.0, Medicamentos.TipoPresentacion.SOLIDAS_SEMISOLIDAS);

        Medicamentos medicamento7 = new Medicamentos("", "", "", 10.0, Medicamentos.TipoPresentacion.SOLIDAS_LIQUIDAS);
        Medicamentos medicamento8 = new Medicamentos("", "", "", 10.0, Medicamentos.TipoPresentacion.SOLIDAS_LIQUIDAS);
        Medicamentos medicamento9 = new Medicamentos("", "", "", 10.0, Medicamentos.TipoPresentacion.SOLIDAS_LIQUIDAS);

        // Agregar medicamentos al ArrayList
        listaMedicamentos.add(medicamento1);
        listaMedicamentos.add(medicamento2);
        listaMedicamentos.add(medicamento3);

        listaMedicamentos.add(medicamento4);
        listaMedicamentos.add(medicamento5);
        listaMedicamentos.add(medicamento6);

        listaMedicamentos.add(medicamento7);
        listaMedicamentos.add(medicamento8);
        listaMedicamentos.add(medicamento9);

        CLI.launchProgFarmacia();

    }
}
