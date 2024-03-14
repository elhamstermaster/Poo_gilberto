package edu_gilberto_heredia.reto6.pruebas;

public class Alumno {
    //Haciéndolos privados se encapsulan, integridad con control de su uso.
    //Los atributos dan características al objeto: vars o consts


    /*
    1. new. Reserva de memoria en heap
    2. Asignar valores default según el tipo de dato
    3. Csontructor
    4.
     */


    //ATRIBUTOS
    private String nombre; //Los atributos son vars globales, pero no todas las vars globales son atributos
    private int edad;
    private boolean activo;

    final int EDAD_MINIMA = 16; //No es un atributo, es constante.


    //CONSTRUCTOR DEFINIDO. Inicializan los atributos.
    public Alumno(String nombre, int edad, boolean activo) {
        this.nombre = nombre;
        this.edad = edad;
        this.activo = activo;
        //this va a hacer que el código se personalice para el objeto que lo está ejecutando
    }
    /*
    {//Bloque anónimo
        EDAD_MINIMA = 16;
    }
     */

    //El static tiene que estar asociado a la clase y no al objeto. Se carga primero y en la heap, donde van cosas que ya van a ser utilizadas.
    //Todos los statics se cargan primero, al mismo tiempo y en la heap.
    public static void metodoStatic(){

    }


    //Se carga hasta hallar un objeto. No es static, puedo invocar al método static porque ya está en memoria, no se puede al revés
    public void metodo(){
        metodoStatic();
    }


    //
    static{
        nombreProfesor = "Carlos";
        Alumno alumno = new Alumno("Carlos", 18, true); //El new construye el objeto, da valores y llama al constructor
        Alumno alumno2 = new Alumno("Pedro", 18, true);
        System.out.println(alumno);
        System.out.println(alumno2);
        alumno = null;
        System.out.println(alumno);
        System.exit(0);
    }


    public Alumno() {

    }

    //GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad < EDAD_MINIMA){
            throw new IllegalArgumentException();
        }
        this.edad = edad;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public int getEDAD_MINIMA() {
        return EDAD_MINIMA;
    }

    public static String getNombreProfesor() {
        return nombreProfesor;
    }

    public static void setNombreProfesor(String nombreProfesor) {
        Alumno.nombreProfesor = nombreProfesor;
    }

    static String nombreProfesor;
    //Var privada solo relevante para cálculos de esta clase

    @Override //Anulación
    public String toString() {
        return "Alumno{" +
                "nombre='" + this.nombre + '\'' +
                ", edad=" + this.edad +
                ", activo=" + this.activo +
                '}';
    }

}
