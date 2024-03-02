package edu_gilberto_heredia.reto5.casos.propiedades1.process;

import edu_gilberto_heredia.reto5.casos.propiedades1.data.PropiedadEnRenta;
import edu_gilberto_heredia.reto5.casos.propiedades1.data.PropiedadEnVenta;

import java.util.ArrayList;

/**
 * Gestiona propiedades inmobiliarias, permitiendo agregar propiedades en venta o en alquiler y obtener información sobre ellas.
 */
public class PropiedadInmobiliaria {
    private ArrayList<PropiedadEnVenta> propiedadesEnVenta;
    private ArrayList<PropiedadEnRenta> propiedadesEnRenta;

    /**
     * Crea una nueva instancia de PropiedadInmobiliaria con listas vacías de propiedades en venta y en alquiler.
     */
    public PropiedadInmobiliaria() {
        propiedadesEnVenta = new ArrayList<>();
        propiedadesEnRenta = new ArrayList<>();
    }

    /**
     * Agrega una propiedad en venta a la lista de propiedades en venta.
     *
     * @param propiedad La propiedad en venta a agregar.
     */
    public void agregarPropiedadEnVenta(PropiedadEnVenta propiedad) {
        propiedadesEnVenta.add(propiedad);
    }

    /**
     * Agrega una propiedad en alquiler a la lista de propiedades en alquiler.
     *
     * @param propiedad La propiedad en alquiler a agregar.
     */
    public void agregarPropiedadEnRenta(PropiedadEnRenta propiedad) {
        propiedadesEnRenta.add(propiedad);
    }

    /**
     * Obtiene la lista de propiedades en venta.
     *
     * @return La lista de propiedades en venta.
     */
    public ArrayList<PropiedadEnVenta> obtenerPropiedadesEnVenta() {
        return propiedadesEnVenta;
    }

    /**
     * Obtiene la lista de propiedades en alquiler.
     *
     * @return La lista de propiedades en alquiler.
     */
    public ArrayList<PropiedadEnRenta> obtenerPropiedadesEnRenta() {
        return propiedadesEnRenta;
    }

    /**
     * Muestra información detallada sobre las propiedades en venta y en alquiler.
     *
     * @return Una cadena de texto con la información detallada de las propiedades.
     */
    public String mostrarInformacion() {
        StringBuilder informacion = new StringBuilder("Información de Propiedades:\n");

        for (PropiedadEnVenta propiedad : propiedadesEnVenta) {
            informacion.append("Información de Propiedad en Venta: ").append(propiedad.getUbicacionVenta())
                    .append(", Precio: ").append(propiedad.getPrecioVenta()).append("\n");
        }

        for (PropiedadEnRenta propiedad : propiedadesEnRenta) {
            informacion.append("Información de Propiedad en Renta: ").append(propiedad.getUbicacionRenta())
                    .append(", Precio Mensual: ").append(propiedad.getPrecioMensualRenta()).append("\n");
        }

        return informacion.toString();
    }
}
