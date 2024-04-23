package edu_gilberto_heredia.reto11.ui;

/**
 * Clase que define los menús en diferentes idiomas
 */
public class Idiomas {
    public static String MENU;
    public static String LIBROS;
    public static String El_Hobbit;
    public static String El_principito;
    public static String El_Padrino;
    public static String Libro_1984;
    public static String Rebelion_en_la_granja;
    public static String INVALIDO;
    public static String ERROR;
    public static String PALABRAS_MAS_USADAS;
    public static String SON;


    public static void getInstance(String idioma) {
        Textos opcion = Textos.valueOf(idioma);
        switch (opcion) {
            case ESP:
                MENU = "--------------Menu--------------";
                LIBROS = "Libros disponibles:";
                El_Hobbit = "1. El Hobbit.";
                El_principito = "2. El principito.";
                El_Padrino = "3. El Padrino.";
                Libro_1984 = "4. 1984.";
                Rebelion_en_la_granja = "5. Rebelión en la granja.";
                INVALIDO = "Opción inválida";
                ERROR = "Error inesperado ";
                PALABRAS_MAS_USADAS = "Las 10 palabras más repetidas en el libro ";
                SON = " son: ";
                break;

            case ENG:
                MENU = "--------------Menu--------------";
                LIBROS = "Books available:";
                El_Hobbit = "1. El Hobbit.";
                El_principito = "2. El principito.";
                El_Padrino = "3. El Padrino.";
                Libro_1984 = "4. 1984.";
                Rebelion_en_la_granja = "5. Rebelión en la granja.";
                INVALIDO = "Invalid option";
                ERROR = "Unexpected error ";
                PALABRAS_MAS_USADAS = "Top 10 most repeated words in the book ";
                SON = " are: ";
                break;
            default:
                throw new IllegalArgumentException("Idioma no disponible");
        }
    }

    /**
     Aquí definimos las posibles instancias de idioma.
     */
    enum Textos {
        ESP, ENG
    }
}