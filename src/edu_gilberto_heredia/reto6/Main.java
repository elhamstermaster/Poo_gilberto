package edu_gilberto_heredia.reto6;

import edu_gilberto_heredia.reto6.data.DatosEmpleados;
import edu_gilberto_heredia.reto6.ui.CLI;

import java.util.ArrayList;

public class Main {
    private static ArrayList<DatosEmpleados> Datos = new ArrayList<>();

    public static void main(String[] args) {
        CLI.launchRegistroNomina();
    }
}
