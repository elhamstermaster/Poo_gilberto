package edu_gilberto_heredia.reto5.casos.agenda_telefonica4.process;

import edu_gilberto_heredia.reto5.casos.agenda_telefonica4.data.DatosContacto;

import java.util.ArrayList;

/**
 * Representa una lista de contactos en una agenda telefónica.
 */
public class ContactosAgenda {
    /**
     * Lista de contactos en la agenda.
     */
    private ArrayList<DatosContacto> contactos;

    /**
     * Crea una nueva instancia de ContactosAgenda con una lista de contactos vacía.
     */
    public ContactosAgenda() {
        this.contactos = new ArrayList<>();
    }

    /**
     * Obtiene la lista de contactos en la agenda.
     *
     * @return La lista de contactos en la agenda.
     */
    public ArrayList<DatosContacto> getDatos() {
        return contactos;
    }

    /**
     * Agrega un contacto a la agenda.
     *
     * @param contacto El contacto a agregar.
     */
    public void agregarContacto(DatosContacto contacto) {
        contactos.add(contacto);
    }

    /**
     * Muestra los datos de todos los contactos en la agenda, incluyendo detalles como nombre, dirección,
     * teléfono de casa y teléfono de trabajo.
     */
    public void MostrarDatos() {
        for (DatosContacto contacto : contactos) {
            System.out.println("Nombre: " + contacto.getNombre());
            System.out.println("Dirección: " + contacto.getDireccion());
            System.out.println("Teléfono de Casa: " + contacto.getTelefonoCasa());
            System.out.println("Teléfono de Trabajo: " + contacto.getTelefonoTrabajo());
            System.out.println("--------------");
        }
    }
}
