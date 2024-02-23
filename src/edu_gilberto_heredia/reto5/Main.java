package edu_gilberto_heredia.reto5;

import edu_gilberto_heredia.reto5.process.Medicamentos;
import edu_gilberto_heredia.reto5.ui.CLI;

import java.util.ArrayList;

public class Main {
    // Crear un ArrayList del tipo Medicamentos
    public static ArrayList<Medicamentos> listaMedicamentos = new ArrayList<>();

    public static void main(String[] args) {
        // Creación de medicamentos y agregarlos al ArrayList
        Medicamentos medicamento1 = new Medicamentos("Bencenosulfonamida", "Polvo", "Sulfatiazol", 40.0, 45.0, Medicamentos.TipoPresentacion.SOLIDAS, "Usuario1");
        Medicamentos medicamento2 = new Medicamentos("Nolotil", "Cápsula", "Metamizol", 25.0, 30.0, Medicamentos.TipoPresentacion.SOLIDAS, "Usuario2");
        Medicamentos medicamento3 = new Medicamentos("Calcio", "Comprimido", "Mastical", 15.5, 20.0, Medicamentos.TipoPresentacion.SOLIDAS, "Usuario3");

        Medicamentos medicamento4 = new Medicamentos("Betametazona", "Pomada", "Barmicil", 12.0, 17.0, Medicamentos.TipoPresentacion.SEMISOLIDAS, "Usuario1");
        Medicamentos medicamento5 = new Medicamentos("Emulgel", "Crema", "Voltaren", 14.0, 19.0, Medicamentos.TipoPresentacion.SEMISOLIDAS, "Usuario2");
        Medicamentos medicamento6 = new Medicamentos("Aloe vera", "Gel", "Gel de Aloe", 20.0, 25.0, Medicamentos.TipoPresentacion.SEMISOLIDAS, "Usuario3");

        Medicamentos medicamento7 = new Medicamentos("Guaifenesina", "Jarabe", "Pyrena", 18.0, 23.0, Medicamentos.TipoPresentacion.LIQUIDAS, "Usuario1");
        Medicamentos medicamento8 = new Medicamentos("Eritromicina", "Loción", "Retromicina", 19.4, 24.9, Medicamentos.TipoPresentacion.LIQUIDAS, "Usuario2");
        Medicamentos medicamento9 = new Medicamentos("Cloropiramina", "Inyectable", "Avapena", 56.3, 61.3, Medicamentos.TipoPresentacion.LIQUIDAS, "Usuario3");

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
