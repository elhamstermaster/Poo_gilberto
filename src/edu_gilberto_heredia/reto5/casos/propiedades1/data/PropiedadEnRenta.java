package edu_gilberto_heredia.reto5.casos.propiedades1.data;

/**
 * Representa una propiedad en alquiler con información sobre su ubicación, precio mensual y duración del contrato.
 */
public class PropiedadEnRenta {
    private String ubicacionRenta;
    private double precioMensualRenta;
    private int duracionContratoRenta;

    /**
     * Crea una nueva instancia de PropiedadEnRenta con la información proporcionada.
     *
     * @param ubicacionRenta         La ubicación de la propiedad en alquiler.
     * @param precioMensualRenta     El precio mensual de la propiedad en alquiler.
     * @param duracionContratoRenta  La duración del contrato de alquiler en meses.
     */
    public PropiedadEnRenta(String ubicacionRenta, double precioMensualRenta, int duracionContratoRenta) {
        this.ubicacionRenta = ubicacionRenta;
        this.precioMensualRenta = precioMensualRenta;
        this.duracionContratoRenta = duracionContratoRenta;
    }

    /**
     * Obtiene la ubicación de la propiedad en alquiler.
     *
     * @return La ubicación de la propiedad en alquiler.
     */
    public String getUbicacionRenta() {
        return ubicacionRenta;
    }

    /**
     * Establece la ubicación de la propiedad en alquiler.
     *
     * @param ubicacionRenta La nueva ubicación de la propiedad en alquiler.
     */
    public void setUbicacionRenta(String ubicacionRenta) {
        this.ubicacionRenta = ubicacionRenta;
    }

    /**
     * Obtiene el precio mensual de la propiedad en alquiler.
     *
     * @return El precio mensual de la propiedad en alquiler.
     */
    public double getPrecioMensualRenta() {
        return precioMensualRenta;
    }

    /**
     * Establece el precio mensual de la propiedad en alquiler.
     *
     * @param precioMensualRenta El nuevo precio mensual de la propiedad en alquiler.
     */
    public void setPrecioMensualRenta(double precioMensualRenta) {
        this.precioMensualRenta = precioMensualRenta;
    }

    /**
     * Obtiene la duración del contrato de alquiler en meses.
     *
     * @return La duración del contrato de alquiler en meses.
     */
    public int getDuracionContratoRenta() {
        return duracionContratoRenta;
    }

    /**
     * Establece la duración del contrato de alquiler en meses.
     *
     * @param duracionContratoRenta La nueva duración del contrato de alquiler en meses.
     */
    public void setDuracionContratoRenta(int duracionContratoRenta) {
        this.duracionContratoRenta = duracionContratoRenta;
    }
}
