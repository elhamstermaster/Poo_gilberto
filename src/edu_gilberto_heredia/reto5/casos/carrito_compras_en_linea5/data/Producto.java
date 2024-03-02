package edu_gilberto_heredia.reto5.casos.carrito_compras_en_linea5.data;

/**
 * Representa un producto que puede ser añadido a un carrito de compras.
 */
public class Producto {
    private String nombre;
    private double precioUnitario;
    private double iva;

    /**
     * Crea un nuevo producto con el nombre, precio unitario e IVA especificados.
     *
     * @param nombre         El nombre del producto.
     * @param precioUnitario El precio unitario del producto.
     * @param iva            El porcentaje de IVA aplicado al producto.
     */
    public Producto(String nombre, double precioUnitario, double iva) {
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.iva = iva;
    }

    /**
     * Obtiene el nombre del producto.
     *
     * @return El nombre del producto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del producto.
     *
     * @param nombre El nuevo nombre del producto.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el precio unitario del producto.
     *
     * @return El precio unitario del producto.
     */
    public double getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * Establece el precio unitario del producto.
     *
     * @param precioUnitario El nuevo precio unitario del producto.
     */
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    /**
     * Obtiene el porcentaje de IVA aplicado al producto.
     *
     * @return El porcentaje de IVA.
     */
    public double getIva() {
        return iva;
    }

    /**
     * Establece el porcentaje de IVA aplicado al producto.
     *
     * @param iva El nuevo porcentaje de IVA.
     */
    public void setIva(double iva) {
        this.iva = iva;
    }
}
