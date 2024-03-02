package edu_gilberto_heredia.reto5.casos.articulos_super3.process;

public class ImporteCalculadora {
    /**
     *
     */
    private double precio;
    private int cantidadArticulos;
    private double importeTotal;

    public ImporteCalculadora(double precio, int cantidadArticulos) {
        this.precio = precio;
        this.cantidadArticulos = cantidadArticulos;
        this.importeTotal = precio * cantidadArticulos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadArticulos() {
        return cantidadArticulos;
    }

    public void setCantidadArticulos(int cantidadArticulos) {
        this.cantidadArticulos = cantidadArticulos;
    }

    public double getImporteTotal() {
        return importeTotal;
    }
}
