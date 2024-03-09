package edu_gilberto_heredia.reto6.data;

public class DatosEmpleados {
    public enum CategoriaEmpleado {
        EMPLEADO_VENTAS,
        ADMINISTRADOR,
        GERENTE
    }

    private String categoria;
    private String nombre;
    private int horas;
    private int horasExtra;
    private int sueldoBase;
    private int sueldoExtra;
    private int telefono;
    private int fechaNacimiento;


    //Constructor
    public DatosEmpleados(String categoria, String nombre, int horas, int horasExtra, int sueldoBase, int sueldoExtra, int telefono, int fechaNacimiento) {
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

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public int getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getSueldoExtra() {
        return sueldoExtra;
    }

    public void setSueldoExtra(int sueldoExtra) {
        this.sueldoExtra = sueldoExtra;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


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
}
