package edu_gilberto_heredia.reto5.casos.articulos_super3.process;

import edu_gilberto_heredia.reto5.casos.articulos_super3.data.DatosArticulo;

import java.util.ArrayList;

public class ArticulosSuper {
    /**
     *
     */
    private ArrayList<DatosArticulo> articulos;
    private String nombre;
    private double precio;
    private int cantidadArticulos;

    public ArticulosSuper(String nombre, double precio, int cantidadArticulos) {
        this.articulos = new ArrayList<>();
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadArticulos = cantidadArticulos;
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
    }

    public int getCantidadArticulos() {
        return cantidadArticulos;
    }

    public void setCantidadArticulos(int cantidadArticulos) {
        this.cantidadArticulos = cantidadArticulos;
    }

    public ArrayList<DatosArticulo> getArticulos() {
        return articulos;
    }

    public void agregarArticulo(DatosArticulo articulo) {
        articulos.add(articulo);
    }

    public double calcularImporteTotal() {
        double importeTotal = 0;
        for (DatosArticulo articulo : articulos) {
            importeTotal += articulo.getImporteTotal();
        }
        return importeTotal;
    }

    public void MostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad de Artículos: " + cantidadArticulos);
        System.out.println("Importe Total: " + calcularImporteTotal());

        for (DatosArticulo articulo : articulos) {
            System.out.println("Detalles del Artículo:");
            System.out.println("Nombre: " + articulo.getNombre());
            System.out.println("Precio: " + articulo.getPrecio());
            System.out.println("Cantidad de Artículos: " + articulo.getCantidadArticulos());
            System.out.println("Importe Total: " + articulo.getImporteTotal());
            System.out.println("--------------");
        }
    }
}
