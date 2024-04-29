package edu_gilberto_heredia.reto11.ui;

/**
 * Esta clase almacena los textos en diferentes idiomas para la interfaz de usuario.
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
    public static String VOCALES;
    public static String VOCALES_INICIO;
    public static String IMPAR;
    public static String CORTA;
    public static String LARGA;
    public static String CINCO_LETRAS;
    public static String NO_HAY_PALABRAS;
    public static String CUMPLAN_CONDICION;
    public static String PALABRA_ESPECIAL;

    /**
     * Obtiene una instancia de los textos en el idioma seleccionado.
     *
     * @param idioma El idioma seleccionado por el usuario.
     */
    public static void getInstance(String idioma) {
        Textos opcion = Textos.valueOf(idioma);
        switch (opcion) {
            case ESP:
                MENU = "--------------------------------";
                LIBROS = "Libros disponibles:";
                El_Hobbit = "1. El Hobbit.";
                El_principito = "2. El principito.";
                El_Padrino = "3. El Padrino.";
                Libro_1984 = "4. 1984.";
                Rebelion_en_la_granja = "5. Rebelión en la granja.";
                INVALIDO = "Opción inválida";
                ERROR = "Error inesperado ";
                PALABRAS_MAS_USADAS = "Las 10 palabras más repetidas en el libro ";
                VOCALES = "\nEl total de vocales en el libro es: ";
                VOCALES_INICIO = "\nLas palabras que empiezan con una vocal son: ";
                IMPAR = "\nPalabras con número impar de letras:";
                CORTA = "\nLa palabra más corta del libro es: ";
                LARGA = "\nLa palabra más larga del libro es: ";
                CINCO_LETRAS = "\nPalabras que empiecen y terminen con vocal y tengan al menos 5 letras:";
                NO_HAY_PALABRAS = "\nNo se han encontrado palabras dentro del libro: ";
                CUMPLAN_CONDICION = "que cumplan con esta condicion";
                PALABRA_ESPECIAL = "\nLas palabras que empiecen y terminen con vocal; " +
                        "y ademas tengan al menos 5 letras, en el libro: ";
                break;

            case ENG:
                MENU = "--------------------------------";
                LIBROS = "Books available:";
                El_Hobbit = "1. El Hobbit.";
                El_principito = "2. The little prince.";
                El_Padrino = "3. El Padrino.";
                Libro_1984 = "4. 1984.";
                Rebelion_en_la_granja = "5. Animal Farm.";
                INVALIDO = "Invalid option";
                ERROR = "Unexpected error ";
                PALABRAS_MAS_USADAS = "The 10 most used words in the book ";
                VOCALES = "\nThe total number of vowels in the book is: ";
                VOCALES_INICIO = "\nWords that start with a vowel are: ";
                IMPAR = "\nWords with an odd number of letters:";
                CORTA = "\nThe shortest word in the book is: ";
                LARGA = "\nThe longest word in the book is: ";
                CINCO_LETRAS = "\nWords starting and ending with a vowel and have at least 5 letters:";
                NO_HAY_PALABRAS = "\nNo words were found within the book: ";
                CUMPLAN_CONDICION = "that meet this condition";
                PALABRA_ESPECIAL = "\nWords starting and ending with a vowel; " +
                        "and also have at least 5 letters, in the book: ";
                break;

            default:
                throw new IllegalArgumentException("Invalid language selection");
        }
    }

    /**
     * Enumeración de las opciones de idioma disponibles.
     */
    private enum Textos {
        ESP, ENG
    }
}
