package edu_gilberto_heredia.reto5.casos.articulos_super3.process;

/**
 * Representa una calculadora de importe para un artículo.
 */
public class ImporteCalculadora {
    /**
     * Precio unitario del artículo.
     */
    private double precio;

    /**
     * Cantidad de artículos.
     */
    private int cantidadArticulos;

    /**
     * Importe total del artículo.
     */
    private double importeTotal;

    /**
     * Crea una nueva instancia de ImporteCalculadora con valores iniciales.
     *
     * @param precio            Precio unitario del artículo.
     * @param cantidadArticulos Cantidad de artículos.
     */
    public ImporteCalculadora(double precio, int cantidadArticulos) {
        this.precio = precio;
        this.cantidadArticulos = cantidadArticulos;
        this.importeTotal = precio * cantidadArticulos;
    }

    /**
     * Obtiene el precio unitario del artículo.
     *
     * @return El precio unitario del artículo.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio unitario del artículo.
     *
     * @param precio El nuevo precio unitario del artículo.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Obtiene la cantidad de artículos.
     *
     * @return La cantidad de artículos.
     */
    public int getCantidadArticulos() {
        return cantidadArticulos;
    }

    /**
     * Establece la cantidad de artículos.
     *
     * @param cantidadArticulos La nueva cantidad de artículos.
     */
    public void setCantidadArticulos(int cantidadArticulos) {
        this.cantidadArticulos = cantidadArticulos;
        this.importeTotal = this.precio * this.cantidadArticulos;
    }

    /**
     * Obtiene el importe total del artículo.
     *
     * @return El importe total del artículo.
     */
    public double getImporteTotal() {
        return importeTotal;
    }
}

