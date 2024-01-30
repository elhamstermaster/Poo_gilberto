package edu_gilberto_heredia.reto1.process;

//Calculadora metabolismo basal
public class MetabolismoBasal {
    public static double calcularMetabolismoBasalHombre(double pesoHombreMetabolismoBasal, double estaturaHombreMetabolismoBasal, double edadMetabolismoBasal){
        return 66.5 + (13.75 * pesoHombreMetabolismoBasal) + (5.003 * estaturaHombreMetabolismoBasal) - (6.775 * edadMetabolismoBasal);

    }
    public static double calcularMetabolismoBasalMujer(double pesoMujerMetabolismoBasal, double estaturaMujerMetabolismoBasal, double edadMetabolismoBasal){
        return 655.1 + (9.563 * pesoMujerMetabolismoBasal) + (1.85 * estaturaMujerMetabolismoBasal) - (4.676 * edadMetabolismoBasal);

    }
}
