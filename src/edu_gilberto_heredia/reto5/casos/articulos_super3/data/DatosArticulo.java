package edu_gilberto_heredia.reto5.casos.articulos_super3.data;

public class DatosArticulo {
    /**
     *
     */
    private String nombre;
    private double precio;
    private int cantidadArticulos;
    private double importeTotal;

    public DatosArticulo(String nombre, double precio, int cantidadArticulos) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadArticulos = cantidadArticulos;
        this.importeTotal = precio * cantidadArticulos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
        this.importeTotal = this.precio * this.cantidadArticulos;
    }

    public int getCantidadArticulos() {
        return cantidadArticulos;
    }

    public void setCantidadArticulos(int cantidadArticulos) {
        this.cantidadArticulos = cantidadArticulos;
        this.importeTotal = this.precio * this.cantidadArticulos;
    }

    public double getImporteTotal() {
        return importeTotal;
    }
}