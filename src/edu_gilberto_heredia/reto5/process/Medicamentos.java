package edu_gilberto_heredia.reto5.process;

public class Medicamentos {
    public enum TipoPresentacion {
        SOLIDAS,
        SEMISOLIDAS,
        LIQUIDAS
    }

    private String nombreQuimico;
    private String nombreGenerico;
    private String nombreRegistrado;
    private double precioDeVenta;
    private double precioPublico;
    private TipoPresentacion tipoPresentacion;
    private String registradoPor;

    public Medicamentos(String nombreQuimico, String nombreGenerico, String nombreRegistrado, double precioDeVenta,
                        double precioPublico, TipoPresentacion tipoPresentacion, String registradoPor) {
        this.nombreQuimico = nombreQuimico;
        this.nombreGenerico = nombreGenerico;
        this.nombreRegistrado = nombreRegistrado;
        this.precioDeVenta = calcularPrecioVenta(precioPublico, tipoPresentacion);
        this.precioPublico = precioPublico;
        this.tipoPresentacion = tipoPresentacion;
        this.registradoPor = registradoPor;
    }

    public String getRegistradoPor() {
        return registradoPor;
    }

    public void setRegistradoPor(String registradoPor) {
        this.registradoPor = registradoPor;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre Químico: " + nombreQuimico);
        System.out.println("Nombre Genérico: " + nombreGenerico);
        System.out.println("Nombre Registrado: " + nombreRegistrado);
        System.out.println("Precio Público: " + precioPublico);
        System.out.println("Precio de Venta: " + precioDeVenta);
        System.out.println("Tipo de Presentación: " + tipoPresentacion);
    }

    private double calcularPrecioVenta(double precioPublico, TipoPresentacion tipoPresentacion) {
        double porcentajeAdicional;

        switch (tipoPresentacion) {
            case SOLIDAS:
                porcentajeAdicional = 0.09;
                break;
            case SEMISOLIDAS:
                porcentajeAdicional = 0.12;
                break;
            case LIQUIDAS:
                porcentajeAdicional = 0.13;
                break;
            default:
                throw new IllegalArgumentException("Tipo de presentación no válido.");
        }

        return precioPublico + (precioPublico * porcentajeAdicional);
    }
}
