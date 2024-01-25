package edu_gilberto_heredia.reto1.ui;
import edu_gilberto_heredia.reto1.process.CalculadoraMasas;
import edu_gilberto_heredia.reto1.process.MetabolismoBasal;

import java.util.Scanner;

import static edu_gilberto_heredia.reto1.process.CalculadoraMasas.clasificarIndiceMasaCorporal;

//Command Line Interface
public class CLI {
    public static void mostrarMenu(){ //Método arranca la aplicación, código limpio, usar verbo
        //Interfaz, menú
        System.out.println(
                """
                        *********************************************************
                        Bienvenido a la clínica de nutrición de Tecmilenio, elige una de las 3 opciones para calcular lo que desees:
                        A. Cálculo de masa corporal (índice de masa corporal).
                        B. Cálculo de masa corporal magra.
                        C. Cálculo de metabolismo basal (gasto energético basal).
                        D. Salir.""");
    }//Ya listo

    public static void selectAgain(){
        System.out.println("¿Deseas seleccionar otro cálculo? s/n");
        Scanner selectAgainScanner = new Scanner(System.in);
        char selectAgain = selectAgainScanner.next().charAt(0);
                        switch(selectAgain)
        {
            case 's':
                CLI.launchCalculadoraMasas();
                break;
            case 'n':
                System.out.println("OK. Fin de la aplicación.");
                break;
            default:
                System.out.println("Escribe s o n");
        }
    }
    //Método público, estático, accedidos desde otras fuentes
        public static void launchCalculadoraMasas(){
            //Leer la elección
            Scanner opcionScanner = new Scanner(System.in);

            mostrarMenu();
            char opcion = opcionScanner.next().charAt(0); //Checar para tolowercase
            switch(opcion)
            {
                case 'A':
                    //Para sacar el IMC, lo que hace esto es llamar a su respectiva clase y método, y vars
                    //Scanner, lector de datos del IMC
                    Scanner imcScanner = new Scanner(System.in);

                    System.out.println("Teclea tu peso en kg:");
                    double peso = imcScanner.nextDouble(); //Doubles

                    System.out.println("Teclea tu altura en cm:");
                    double estatura = imcScanner.nextDouble(); //Double, en a m

                    //Llama al cálculo del IMC, usando el peso y la estatura
                    double imc = CalculadoraMasas.calcularIndiceMasaCorporal(peso, estatura);
                    String estado = clasificarIndiceMasaCorporal(imc); //uso el valor calculado del imc como argumento para arrojar el método clasificatorio

                    System.out.println("Tu IMC es " + imc + ". " + estado);
                    selectAgain();
                    break;

                case 'B':
                    //B. Cálculo de masa corporal magra
                    Scanner masaMagraScanner = new Scanner(System.in);
                    System.out.println("¿Cuál es tu sexo? h/m");
                    char masaMagraSexo = masaMagraScanner.next().charAt(0);

                    if(masaMagraSexo == 'h') {
                        System.out.println("Teclea tu peso en kg.");
                        double pesoHombreMagra = masaMagraScanner.nextDouble();

                        System.out.println("Teclea tu estatura en cm.");
                        double estaturaHombreMagra = masaMagraScanner.nextDouble();

                        double masaMagraHombre = CalculadoraMasas.calcularMasaMagraHombre(pesoHombreMagra, estaturaHombreMagra);

                        System.out.println("Tu masa corporal magra es: " + masaMagraHombre + ".");
                    }

                    if(masaMagraSexo == 'm') {
                        System.out.println("Teclea tu peso en kg.");
                        double pesoMujerMagra = masaMagraScanner.nextDouble();

                        System.out.println("Teclea tu estatura en cm.");
                        double estaturaMujerMagra = masaMagraScanner.nextDouble();

                        double masaMagraMujer = CalculadoraMasas.calcularMasaMagraMujer(pesoMujerMagra, estaturaMujerMagra);

                        System.out.println("Tu masa corporal magra es: " + masaMagraMujer + ".");
                    }
                    selectAgain();
                    break;

                case 'C':
                    //C. Cálculo de metabolismo basal
                    Scanner metabolismoBasalScanner = new Scanner(System.in);
                    System.out.println("¿Cuál es tu sexo? h/m");
                    char metabolismoBasalSexo = metabolismoBasalScanner.next().charAt(0);

                    //Hombre
                    if(metabolismoBasalSexo == 'h') {
                        System.out.println("Teclea tu peso en kg.");
                        double pesoHombreMetabolismoBasal = metabolismoBasalScanner.nextDouble();

                        System.out.println("Teclea tu estatura en cm.");
                        double estaturaHombreMetabolismoBasal = metabolismoBasalScanner.nextDouble();

                        System.out.println("Teclea tu edad.");
                        double edadMetabolismoBasal = metabolismoBasalScanner.nextDouble();

                        double metabolismoBasalHombre = MetabolismoBasal.calcularMetabolismoBasalHombre(pesoHombreMetabolismoBasal, estaturaHombreMetabolismoBasal, edadMetabolismoBasal);

                        System.out.println("El resultado de tu índice metabólico es: " + metabolismoBasalHombre + " Joules.");
                    }

                    //Mujer
                    if(metabolismoBasalSexo == 'm') {
                        System.out.println("Teclea tu peso en kg.");
                        double pesoMujerMetabolismoBasal = metabolismoBasalScanner.nextDouble();

                        System.out.println("Teclea tu estatura en cm.");
                        double estaturaMujerMetabolismoBasal = metabolismoBasalScanner.nextDouble();

                        System.out.println("Teclea tu edad.");
                        double edadMetabolismoBasal = metabolismoBasalScanner.nextDouble();

                        double metabolismoBasalMujer = MetabolismoBasal.calcularMetabolismoBasalMujer(pesoMujerMetabolismoBasal, estaturaMujerMetabolismoBasal, edadMetabolismoBasal);

                        System.out.println("El resultado de tu índice metabólico es: " + metabolismoBasalMujer + " Joules.");
                    }
                    selectAgain();
                    break;

                case 'D':
                    System.out.println("Fin de la aplicación.");
                    break;

                default:
                    System.out.println("Escribe A, B o C. ");
            }

        }

}
