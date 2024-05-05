package edu_gilberto_heredia.evidencia3.ui;

import java.util.Scanner;

public class CLI {
    private static final Scanner scanner = new Scanner(System.in);

    public static void mostrarMenuIdiomas() {
        System.out.println("""
                --------------------------------------------------------------------------
                Seleccione su idioma / Select your language / あなたが使う言語を選んでください:
                ESP: Español / Spanish / スペイン語
                ENG: Inglés / English / 英語
                JAP: Japonés / Japanese / 日本語""");
    }

    public static void mostrarMenuJuego() {
        System.out.println(Idiomas.NOMBRES);
    }

    public static void elegirIdiomaYNombre() {
        mostrarMenuIdiomas();
        String idiomaSeleccionado = scanner.nextLine().toUpperCase();
        Idiomas.getInstance(idiomaSeleccionado);

        mostrarMenuJuego();


    }



}
