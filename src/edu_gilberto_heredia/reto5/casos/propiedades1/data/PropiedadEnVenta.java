package edu_gilberto_heredia.reto5.casos.propiedades1.data;

/**
 * Representa una propiedad en venta con información sobre su ubicación, precio y disponibilidad.
 */
public class PropiedadEnVenta {
    private String ubicacionVenta;
    private double precioVenta;
    private boolean disponibleVenta;

    /**
     * Crea una nueva instancia de PropiedadEnVenta con la información proporcionada.
     *
     * @param ubicacionVenta     La ubicación de la propiedad en venta.
     * @param precioVenta        El precio de la propiedad en venta.
     * @param disponibleVenta    Indica si la propiedad está disponible para la venta.
     */
    public PropiedadEnVenta(String ubicacionVenta, double precioVenta, boolean disponibleVenta) {
        this.ubicacionVenta = ubicacionVenta;
        this.precioVenta = precioVenta;
        this.disponibleVenta = disponibleVenta;
    }

    /**
     * Obtiene la ubicación de la propiedad en venta.
     *
     * @return La ubicación de la propiedad en venta.
     */
    public String getUbicacionVenta() {
        return ubicacionVenta;
    }

    /**
     * Establece la ubicación de la propiedad en venta.
     *
     * @param ubicacionVenta La nueva ubicación de la propiedad en venta.
     */
    public void setUbicacionVenta(String ubicacionVenta) {
        this.ubicacionVenta = ubicacionVenta;
    }

    /**
     * Obtiene el precio de la propiedad en venta.
     *
     * @return El precio de la propiedad en venta.
     */
    public double getPrecioVenta() {
        return precioVenta;
    }

    /**
     * Establece el precio de la propiedad en venta.
     *
     * @param precioVenta El nuevo precio de la propiedad en venta.
     */
    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    /**
     * Verifica si la propiedad está disponible para la venta.
     *
     * @return true si la propiedad está disponible, false en caso contrario.
     */
    public boolean isDisponibleVenta() {
        return disponibleVenta;
    }

    /**
     * Establece la disponibilidad de la propiedad para la venta.
     *
     * @param disponibleVenta Indica si la propiedad está disponible para la venta.
     */
    public void setDisponibleVenta(boolean disponibleVenta) {
        this.disponibleVenta = disponibleVenta;
    }
}

