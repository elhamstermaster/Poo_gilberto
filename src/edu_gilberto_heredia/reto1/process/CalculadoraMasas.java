package edu_gilberto_heredia.reto1.process;

/**
 * Esta clase sirve para EL CÁLCULO y no más que EL CÁLCULO del índice de masa corporal
 * y la masa corporal magra, incluye los métodos:
 * Índice de masa corporal
 * Masa corporal magra
 **/
public class CalculadoraMasas {
    /**
     * Método que calcula
     * @param peso peso del paciente en kg
     * @param estatura estatura en m
     * @return índice de masa corporal
     **/

    public static double calcularIndiceMasaCorporal(double peso, double estatura){
        //Fórmula IMC = (peso (kg)) / (estatura(m)^2)
        return peso/Math.pow( (estatura/100), 2);
    }

    public static String clasificarIndiceMasaCorporal(double imc) {
        String valorImc = " ";

        if(imc < 18.9){
            valorImc = "Tu IMC denota un peso bajo.";
        }
        else if(imc >= 18.9 && imc <= 24.99){
            valorImc = "Tu IMC denota un peso normal.";
        }
        else if(imc >= 25 && imc <= 29.99){
            valorImc = "Tu IMC denota sobrepeso.";
        }
        else if(imc >= 30 && imc <= 34.99){
            valorImc = "Tu IMC denota obesidad leve.";
        }
        else if(imc >= 35 && imc <= 39.99){
            valorImc = "Tu IMC denota sobrepeso.";
        }
        else if(imc >= 40){
            valorImc = "Tu IMC denota obesidad mórbida.";
        }
        return valorImc;
    }

    //Masas magras, decidí no crear otra clase debido a que estas también son masas. Aunque pude hacerlo con el
    // metabolismo basal, por organización hice otro archivo de clase.

        public static double calcularMasaMagraHombre(double pesoHombreMagra, double estaturaHombreMagra) {
            // Fórmula para calcular la masa magra en hombres según Boer
            return (1.10 * pesoHombreMagra) - 128 * (Math.pow(pesoHombreMagra, 2) / Math.pow(estaturaHombreMagra, 2));
        }

        public static double calcularMasaMagraMujer(double pesoMujerMagra, double estaturaMujerMagra) {
            // Fórmula para calcular la masa magra en mujeres según Boer
            return (1.07 * pesoMujerMagra) - 148 * (Math.pow(pesoMujerMagra, 2) / Math.pow(estaturaMujerMagra, 2));
        }
}



