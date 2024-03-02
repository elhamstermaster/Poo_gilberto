package edu_gilberto_heredia.reto5.casos.propiedades1.data;

public class PropiedadEnVenta {
    /**
     *
     */
    private String ubicacionVenta;
    private double precioVenta;
    private boolean disponibleVenta;

    public PropiedadEnVenta(String ubicacionVenta, double precioVenta, boolean disponibleVenta) {
        this.ubicacionVenta = ubicacionVenta;
        this.precioVenta = precioVenta;
        this.disponibleVenta = disponibleVenta;
    }

    public String obtenerInformacion() {
        // Implementa la lógica para obtener información específica de la propiedad en venta
        return "Información de Propiedad en Venta: " + ubicacionVenta + ", Precio: " + precioVenta;
    }
}
