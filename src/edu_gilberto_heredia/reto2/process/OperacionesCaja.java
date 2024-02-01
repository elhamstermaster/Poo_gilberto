package edu_gilberto_heredia.reto2.process;

public class OperacionesCaja { //ver si puedo reducir esto y lo otro
    //Costo caja básica.
    public static double costoCaja = 50;

    //a, b
    public static double numEgresosCompras;
    public static double numIngresosVentas;

    //c
    public static double numVentas;
    public static double numCompras;

    public static double monto = 10_000;

    //d
    public static double numOperaciones; //Final del programa

    //Método para opción a. Negocio compra a proveedor.
    public static double comprarCajas(double costoCaja, double numCajas){
        return (costoCaja * numCajas);
    }

    //Método para opción b. Negocio vende a cliente.
    public static double venderCajas(double numVentaCajas, double costoVentaCajas){
        return (numVentaCajas * costoVentaCajas);
    }

}
