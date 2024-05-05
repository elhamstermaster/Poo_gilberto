package edu_gilberto_heredia.evidencia3.ui;

public class Idiomas {
    public static String NOMBRES;
    public static String INICIO_JUEGO;
    public static String SIMBOLOS_DE_JUEGO;
    public static String JUGAR_DE_NUEVO;
    public static String GANADOR;

    /**
     * Obtiene una instancia de los textos en el idioma seleccionado
     *
     * @param idioma El idioma seleccionado por el usuario
     */
    public static void getInstance(String idioma) {
    Textos opcion = Textos.valueOf(idioma);
        switch (opcion) {
            case ESP:
                NOMBRES = "Elige tu nombre: \n";
                INICIO_JUEGO = " ";
                SIMBOLOS_DE_JUEGO = " ";
                JUGAR_DE_NUEVO = " ";
                GANADOR = " ";

                break;

            case ENG:
                NOMBRES = "Choose your nickname: \n";
                INICIO_JUEGO = " ";
                SIMBOLOS_DE_JUEGO = " ";
                JUGAR_DE_NUEVO = " ";
                GANADOR = " ";

                break;

            case JAP:
                NOMBRES = " ";
                INICIO_JUEGO = " ";
                SIMBOLOS_DE_JUEGO = " ";
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
