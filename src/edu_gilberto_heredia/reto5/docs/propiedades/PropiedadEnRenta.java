package edu_gilberto_heredia.reto5.docs.propiedades;

public class PropiedadEnRenta {
    private String ubicacionRenta;
    private double precioMensualRenta;
    private int duracionContratoRenta;
    private boolean disponibleRenta;

    public PropiedadEnRenta(String ubicacionRenta, double precioMensualRenta, int duracionContratoRenta) {
        this.ubicacionRenta = ubicacionRenta;
        this.precioMensualRenta = precioMensualRenta;
        this.duracionContratoRenta = duracionContratoRenta;
        this.disponibleRenta = true;
    }

    public String obtenerInformacion() {
        return "Ubicación: " + ubicacionRenta + ". Precio Mensual: $" + precioMensualRenta + ". Duración del Contrato: " + duracionContratoRenta + " meses. " + "Disponible: " + (disponibleRenta ? "Sí" : "No");
    }
}

