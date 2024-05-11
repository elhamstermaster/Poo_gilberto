package edu_gilberto_heredia.evidencia3.ui;

//Está por cambiarse

public class Idiomas {
    public static String BIENVENIDA;
    public static String NOMBRES;
    public static String SIMBOLOS;
    public static String INICIO_JUEGO;
    public static String SIMBOLOS_DE_JUEGO;
    public static String JUGAR_DE_NUEVO;
    public static String GANADOR;
    public static String POSICION_INVALIDA;
    public static String EMPATE;

    /**
     * Obtiene una instancia de los textos en el idioma seleccionado
     *
     * @param //idioma El idioma seleccionado por el usuario
     */
    /*
    public static void getInstance(String idioma) {
        edu_gilberto_heredia.oldevidencia3.ui.Idiomas.Textos opcion = edu_gilberto_heredia.oldevidencia3.ui.Idiomas.Textos.valueOf(idioma);
        switch (opcion) {
            case ESP:
                NOMBRES = "Elige tu nombre: \n";
                INICIO_JUEGO = " ";
                SIMBOLOS_DE_JUEGO = " ";
                JUGAR_DE_NUEVO = " ";
                BIENVENIDA = "¡Bienvenido al juego del gato!";
                NOMBRES = "Elige tu nombre: ";
                SIMBOLOS = "Elige tu propio símbolo, hay 10 disponibles: \n" +
                        "@ # $ % & X 0 ? + =";
                INICIO_JUEGO = "Perfecto, ingresa la fila y la columna (ejemplo: 1 2):";
                JUGAR_DE_NUEVO = "¿Desea jugar de nuevo?";
                GANADOR = " ";
                POSICION_INVALIDA = "Posición inválida. Inténtalo de nuevo.";
                EMPATE = "¡Empate!";


                break;

            case ENG:
                NOMBRES = "Choose your nickname: \n";
                INICIO_JUEGO = " ";
                SIMBOLOS_DE_JUEGO = " ";
                SIMBOLOS = " ";
                JUGAR_DE_NUEVO = " ";
                GANADOR = " ";

                break;
            case JAP:
                NOMBRES = " ";
                INICIO_JUEGO = " ";
                SIMBOLOS_DE_JUEGO = " ";
                SIMBOLOS = " ";
                JUGAR_DE_NUEVO = " ";
                GANADOR = " ";

                break;
            default:
                throw new IllegalArgumentException("Invalid language selection");
        }
    }
    /**
     * Enumeración de las opciones de idioma disponibles.
     */

    private enum Textos {
        ESP, ENG, JAP
    }
}
