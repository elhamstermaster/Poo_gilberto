package edu_gilberto_heredia.reto5.casos.propiedades1.process;

import edu_gilberto_heredia.reto5.casos.propiedades1.data.PropiedadEnRenta;
import edu_gilberto_heredia.reto5.casos.propiedades1.data.PropiedadEnVenta;

import java.util.ArrayList;

public class PropiedadInmobiliaria {
    private ArrayList<PropiedadEnVenta> propiedadesEnVenta;
    private ArrayList<PropiedadEnRenta> propiedadesEnRenta;

    public PropiedadInmobiliaria() {
        propiedadesEnVenta = new ArrayList<>();
        propiedadesEnRenta = new ArrayList<>();
    }

    public void agregarPropiedadEnVenta(PropiedadEnVenta propiedad) {
        propiedadesEnVenta.add(propiedad);
    }

    public void agregarPropiedadEnRenta(PropiedadEnRenta propiedad) {
        propiedadesEnRenta.add(propiedad);
    }

    public ArrayList<PropiedadEnVenta> obtenerPropiedadesEnVenta() {
        return propiedadesEnVenta;
    }

    public ArrayList<PropiedadEnRenta> obtenerPropiedadesEnRenta() {
        return propiedadesEnRenta;
    }
}

