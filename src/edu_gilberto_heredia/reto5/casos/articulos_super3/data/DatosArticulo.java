package edu_gilberto_heredia.reto5.casos.articulos_super3.data;

/**
 * Representa los datos asociados a un artículo en el carrito de compras.
 */
public class DatosArticulo {
    /**
     * Nombre del artículo.
     */
    private String nombre;

    /**
     * Precio unitario del artículo.
     */
    private double precio;

    /**
     * Cantidad de artículos seleccionados.
     */
    private int cantidadArticulos;

    /**
     * Importe total del artículo.
     */
    private double importeTotal;

    /**
     * Crea una nueva instancia de DatosArticulo con valores iniciales.
     *
     * @param nombre            Nombre del artículo.
     * @param precio            Precio unitario del artículo.
     * @param cantidadArticulos Cantidad de artículos seleccionados.
     */
    public DatosArticulo(String nombre, double precio, int cantidadArticulos) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadArticulos = cantidadArticulos;
        this.importeTotal = precio * cantidadArticulos;
    }

    /**
     * Obtiene el nombre del artículo.
     *
     * @return El nombre del artículo.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del artículo.
     *
     * @param nombre El nuevo nombre del artículo.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        this.importeTotal = this.precio * this.cantidadArticulos;
    }

    /**
     * Obtiene la cantidad de artículos seleccionados.
     *
     * @return La cantidad de artículos seleccionados.
     */
    public int getCantidadArticulos() {
        return cantidadArticulos;
    }

    /**
     * Establece la cantidad de artículos seleccionados.
     *
     * @param cantidadArticulos La nueva cantidad de artículos seleccionados.
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
