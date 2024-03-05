package edu_gilberto_heredia.reto5.casos.agenda_telefonica4.data;

/**
 * Clase que representa los datos de un contacto en una agenda telefónica.
 */
public class DatosContacto {
    private String nombre;
    private String direccion;
    private int telefonoCasa;
    private int telefonoTrabajo;

    /**
     * Crea una nueva instancia de DatosContacto con los datos proporcionados.
     *
     * @param nombre          El nombre del contacto.
     * @param direccion       La dirección del contacto.
     * @param telefonoCasa    El número de teléfono de casa del contacto.
     * @param telefonoTrabajo El número de teléfono de trabajo del contacto.
     */
    public DatosContacto(String nombre, String direccion, int telefonoCasa, int telefonoTrabajo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefonoCasa = telefonoCasa;
        this.telefonoTrabajo = telefonoTrabajo;
    }

    /**
     * Obtiene el nombre del contacto.
     *
     * @return El nombre del contacto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del contacto.
     *
     * @param nombre El nuevo nombre del contacto.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la dirección del contacto.
     *
     * @return La dirección del contacto.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece la dirección del contacto.
     *
     * @param direccion La nueva dirección del contacto.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Obtiene el número de teléfono de casa del contacto.
     *
     * @return El número de teléfono de casa del contacto.
     */
    public int getTelefonoCasa() {
        return telefonoCasa;
    }

    /**
     * Establece el número de teléfono de casa del contacto.
     *
     * @param telefonoCasa El nuevo número de teléfono de casa del contacto.
     */
    public void setTelefonoCasa(int telefonoCasa) {
        this.telefonoCasa = telefonoCasa;
    }

    /**
     * Obtiene el número de teléfono de trabajo del contacto.
     *
     * @return El número de teléfono de trabajo del contacto.
     */
    public int getTelefonoTrabajo() {
        return telefonoTrabajo;
    }

    /**
     * Establece el número de teléfono de trabajo del contacto.
     *
     * @param telefonoTrabajo El nuevo número de teléfono de trabajo del contacto.
     */
    public void setTelefonoTrabajo(int telefonoTrabajo) {
        this.telefonoTrabajo = telefonoTrabajo;
    }
}
