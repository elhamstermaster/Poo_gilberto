package edu_gilberto_heredia.reto5.docs.propiedades;

public class PropiedadEnVenta {
    private String ubicacionVenta;
    private double precioVenta;
    private boolean disponibleVenta;

    public PropiedadEnVenta(String ubicacionVenta, double precioVenta, boolean disponibleVenta) {
        this.ubicacionVenta = ubicacionVenta;
        this.precioVenta = precioVenta;
        this.disponibleVenta = disponibleVenta;
    }


    public String obtenerInformacion() {
        return "Ubicación: " + ubicacionVenta + ", Precio: $" + precioVenta + ", Disponible: " + (disponibleVenta ? "Sí" : "No");
    }
}
