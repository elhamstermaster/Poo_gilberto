package edu_gilberto_heredia.reto5.casos.propiedades1.data;

public class PropiedadEnRenta {
    private String ubicacionRenta;
    private double precioMensualRenta;
    private int duracionContratoRenta;

    public PropiedadEnRenta(String ubicacionRenta, double precioMensualRenta, int duracionContratoRenta) {
        this.ubicacionRenta = ubicacionRenta;
        this.precioMensualRenta = precioMensualRenta;
        this.duracionContratoRenta = duracionContratoRenta;
    }

    public String obtenerInformacion() {
        // Implementa la lógica para obtener información específica de la propiedad en renta
        return "Información de Propiedad en Renta: " + ubicacionRenta + ", Precio Mensual: " + precioMensualRenta;
    }
}

