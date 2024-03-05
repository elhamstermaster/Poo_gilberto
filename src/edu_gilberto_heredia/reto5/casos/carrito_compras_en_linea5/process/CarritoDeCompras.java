package edu_gilberto_heredia.reto5.casos.carrito_compras_en_linea5.process;

import java.util.ArrayList;

/**
 * Representa un carrito de compras en línea que contiene elementos seleccionados.
 */
public class CarritoDeCompras {
    private ArrayList<ItemCarrito> items;

    /**
     * Crea un nuevo carrito de compras vacío.
     */
    public CarritoDeCompras() {
        items = new ArrayList<>();
    }

    /**
     * Agrega un elemento al carrito de compras.
     *
     * @param item El elemento a agregar.
     */
    public void agregarItem(ItemCarrito item) {
        items.add(item);
    }

    /**
     * Elimina un elemento del carrito de compras.
     *
     * @param item El elemento a eliminar.
     */
    public void eliminarItem(ItemCarrito item) {
        items.remove(item);
    }

    /**
     * Calcula el subtotal del carrito de compras.
     *
     * @return El subtotal del carrito.
     */
    public double calcularSubtotal() {
        double subtotal = 0;
        for (ItemCarrito item : items) {
            subtotal += item.calcularImporte();
        }
        return subtotal;
    }

    /**
     * Calcula el total del carrito de compras, incluyendo impuestos u otros costos adicionales.
     *
     * @return El total del carrito.
     */
    public double calcularTotal() {
        double total = calcularSubtotal();
        // Lógica para agregar impuestos u otros costos adicionales si es necesario
        return total;
    }

    /**
     * Obtiene la lista de elementos en el carrito de compras.
     *
     * @return La lista de elementos en el carrito.
     */
    public ArrayList<ItemCarrito> getItems() {
        return items;
    }

    /**
     * Muestra la información detallada del carrito de compras, incluyendo cada elemento y los totales.
     */
    public void mostrarInformacion() {
        System.out.println("---- Carrito de Compras ----");
        for (ItemCarrito item : items) {
            System.out.println("Producto: " + item.getProducto().getNombre());
            System.out.println("Cantidad: " + item.getCantidad());
            System.out.println("Precio Unitario: " + item.getProducto().getPrecioUnitario());
            System.out.println("Importe: " + item.calcularImporte());
            System.out.println("------------------------------");
        }
        System.out.println("Subtotal: " + calcularSubtotal());
        System.out.println("Total: " + calcularTotal());
    }
}

