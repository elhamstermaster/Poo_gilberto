package edu_gilberto_heredia.reto11.ui;

/**
 * Clase que define los menús en diferentes idiomas.
 */
public class Idiomas {

    private String MENU; // Almacena el menú en el idioma correspondiente.

    /**
     * Constructor de la clase Idiomas.
     *
     * @param MENU El menú en el idioma correspondiente.
     */
    public Idiomas(String MENU) {
        this.MENU = MENU;
    }

    /**
     * Método estático que obtiene una instancia de la clase Idiomas según el idioma seleccionado.
     *
     * @param idioma El idioma seleccionado ("ES" para español, "ENG" para inglés).
     * @return Una instancia de Idiomas con el menú en el idioma correspondiente.
     */
    public static Idiomas getInstance(String idioma) {
        switch (Idioma.valueOf(idioma)) {
            case ES:
                return new Idiomas("""
                        MENÚ EN ESPAÑOL.
                        Libros disponibles:
                        1. El principito.
                        2. El Hobbit.
                        3. Rebelión en la granja.
                        4. 1984.
                        5. El Padrino.""");
            case ENG:
                return new Idiomas("""
                        ENGLISH MENU.
                        Books available:
                        1. The Little Prince.
                        2. The Hobbit.
                        3. Animal Farm.
                        4. 1984.
                        5. The Godfather.""");
            default:
                throw new IllegalArgumentException("Idioma no disponible / Language not available");
        }
    }

    /**
     * Método que devuelve el menú en el idioma correspondiente.
     *
     * @return El menú en el idioma correspondiente.
     */
    public String getMenu() {
        return MENU;
    }

    /**
     * Enumeración que define los idiomas disponibles.
     */
    enum Idioma {
        ES, ENG
    }

}