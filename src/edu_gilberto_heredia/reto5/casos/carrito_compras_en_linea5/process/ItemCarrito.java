package edu_gilberto_heredia.reto5.casos.carrito_compras_en_linea5.process;

import edu_gilberto_heredia.reto5.casos.carrito_compras_en_linea5.data.Producto;

/**
 * Representa un elemento en un carrito de compras, que incluye un producto y la cantidad deseada.
 */
public class ItemCarrito {
    private Producto producto;
    private int cantidad;

    /**
     * Crea un nuevo elemento en el carrito de compras con el producto y la cantidad especificados.
     *
     * @param producto El producto asociado al elemento.
     * @param cantidad La cantidad deseada del producto.
     */
    public ItemCarrito(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    /**
     * Calcula el importe total del elemento, considerando el precio unitario y la cantidad.
     *
     * @return El importe total del elemento.
     */
    public double calcularImporte() {
        return producto.getPrecioUnitario() * cantidad;
    }

    /**
     * Obtiene el producto asociado al elemento.
     *
     * @return El producto asociado.
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * Establece el producto asociado al elemento.
     *
     * @param producto El nuevo producto asociado.
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    /**
     * Obtiene la cantidad deseada del producto en el elemento.
     *
     * @return La cantidad deseada.
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Establece la cantidad deseada del producto en el elemento.
     *
     * @param cantidad La nueva cantidad deseada.
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
