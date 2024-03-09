package edu_gilberto_heredia.reto6.data;

/**
 * Clase que representa los datos de un empleado y calcula la nómina según la categoría.
 */
public class DatosEmpleados {
    /**
     * Método que calcula la nómina del empleado según su categoría.
     */
    public void calcularNominaEmpleado() {
        switch (categoria) {
            case "EMPLEADO_VENTAS":
                sueldoBase = 100;
                sueldoExtra = 50;
                break;
            case "ADMINISTRADOR":
                sueldoBase = 180;
                sueldoExtra = 100;
                break;
            case "GERENTE":
                sueldoBase = 250;
                sueldoExtra = 150;
                break;
            default:
                // Manejo de categorías no válidas si es necesario
                break;
        }
    }

    private String categoria;
    private String nombre;
    private int horas;
    private int horasExtra;
    private int sueldoBase;
    private int sueldoExtra;
    private String telefono;
    private int fechaNacimiento;


    public DatosEmpleados(String categoria, String nombre, int horas, int horasExtra, int sueldoBase, int sueldoExtra, String telefono, int fechaNacimiento) {
        this.categoria = categoria;
        this.nombre = nombre;
        this.horas = horas;
        this.horasExtra = horasExtra;
        this.sueldoBase = sueldoBase;
        this.sueldoExtra = sueldoExtra;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;

        calcularNominaEmpleado();
    }

    //Getters y setters
    public String getCategoria() {
        return categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }


    public int getHorasExtra() {
        return horasExtra;
    }


    public int getSueldoBase() {
        return sueldoBase;
    }


    public int getSueldoExtra() {
        return sueldoExtra;
    }

}
