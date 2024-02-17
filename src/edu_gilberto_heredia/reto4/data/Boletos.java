package edu_gilberto_heredia.reto4.data;

import java.util.ArrayList;

public class Boletos {
    private int num;
    private int numeroPasajero;

    // Constructor
    public Boletos(int num, int numeroPasajero) {
        this.num = num;
        this.numeroPasajero = numeroPasajero;
    }

    // Getter para obtener el número de boletos
    public int getNum() {
        return num;
    }

    // Setter para establecer el número de boletos
    public void setNum(int num) {
        this.num = num;
    }

    // Getter para obtener el número de pasajero
    public int getNumeroPasajero() {
        return numeroPasajero;
    }

    // Setter para establecer el número de pasajero
    public void setNumeroPasajero(int numeroPasajero) {
        this.numeroPasajero = numeroPasajero;
    }

    // Método para procesar la lista de boletos
    public static void procesarListaBoletos(ArrayList<Boletos> listaBoletos) {
        // Aquí puedes realizar operaciones con la lista de boletos según sea necesario
        for (Boletos boleto : listaBoletos) {
            System.out.println("Pasajero: " + boleto.getNumeroPasajero() + ", Número de boletos: " + boleto.getNum());
            // Realiza otras operaciones según sea necesario
        }
    }
}
