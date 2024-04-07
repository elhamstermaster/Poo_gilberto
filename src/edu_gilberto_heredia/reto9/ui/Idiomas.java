package edu_gilberto_heredia.reto9.ui;

public class Idiomas {

    private String MENU;

    public Idiomas(String MENU) {
        this.MENU = MENU;
    }

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

    public String getMenu() {
        return MENU;
    }

    enum Idioma {
        ES, ENG
    }

}