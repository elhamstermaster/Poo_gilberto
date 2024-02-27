/**
 * Clase que representa un medicamento y realiza operaciones relacionadas con él.
 */
package edu_gilberto_heredia.reto5.process;

public class Medicamentos {
    /**
     * Enumeración que define los tipos de presentación de los medicamentos.
     */
    public enum TipoPresentacion {
        SOLIDAS,
        SEMISOLIDAS,
        LIQUIDAS
    }

    private String nombreQuimico;
    private String nombreGenerico;
    private String nombreRegistrado;
    private double precioPublico;
    private double precioVenta;
    private TipoPresentacion tipoPresentacion;
    private String registradoPor;

    /**
     * Constructor que inicializa un objeto Medicamentos con la información proporcionada.
     *
     * @param nombreGenerico    Nombre genérico del medicamento.
     * @param nombreRegistrado  Nombre registrado del medicamento.
     * @param precioPublico     Precio público del medicamento.
     * @param tipoPresentacion  Tipo de presentación del medicamento.
     * @param registradoPor     Nombre del usuario que registró el medicamento.
     */
    public Medicamentos(String nombreGenerico, String nombreRegistrado,
                        double precioPublico, TipoPresentacion tipoPresentacion, String registradoPor) {
        this.nombreGenerico = nombreGenerico;
        this.nombreRegistrado = nombreRegistrado;
        this.precioPublico = precioPublico;
        this.tipoPresentacion = tipoPresentacion;
        this.nombreQuimico = nombreRegistrado;  // Puedes ajustar esto según tus necesidades
        this.registradoPor = registradoPor;

        // Calcular precio de venta basado en el tipo de presentación
        calcularPrecioVenta();
    }

    /**
     * Obtiene el tipo de presentación del medicamento.
     *
     * @return Tipo de presentación.
     */
    public TipoPresentacion getTipoPresentacion() {
        return tipoPresentacion;
    }

    /**
     * Calcula y establece el precio de venta del medicamento según el tipo de presentación.
     */
    public void calcularPrecioVenta() {
        switch (tipoPresentacion) {
            case SOLIDAS:
                precioVenta = precioPublico * 1.09;
                break;
            case SEMISOLIDAS:
                precioVenta = precioPublico * 1.12;
                break;
            case LIQUIDAS:
                precioVenta = precioPublico * 1.13;
                break;
            default:
                precioVenta = precioPublico;  // Por defecto
        }
    }

    /**
     * Muestra la información del medicamento en la consola.
     */
    public void mostrarInformacion() {
        System.out.println("Nombre Químico: " + nombreQuimico);
        System.out.println("Nombre Genérico: " + nombreGenerico);
        System.out.println("Nombre Registrado: " + nombreRegistrado);
        System.out.println("Tipo de Presentación: " + tipoPresentacion);
    }

    /**
     * Obtiene el precio de venta del medicamento.
     *
     * @return Precio de venta.
     */
    public double getPrecioVenta() {
        return precioVenta;
    }

    /**
     * Obtiene el nombre del usuario que registró el medicamento.
     *
     * @return Nombre del usuario registrador.
     */
    public String getRegistradoPor() {
        return registradoPor;
    }
}
