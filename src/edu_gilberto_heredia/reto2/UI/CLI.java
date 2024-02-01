package edu_gilberto_heredia.reto2.UI;
import edu_gilberto_heredia.reto2.process.CalculadoraCompraVentaCajas;

import java.util.Scanner;

public class CLI {
    public static void mostrarMenu(){
        System.out.println("Bienvenido (a) al programa de control de compra y venta. Para ver el menú, escribe tu usuario y contraseña.");
        Scanner usuarioScanner = new Scanner(System.in);

        System.out.println("Usuario/User:");
        String usuario = usuarioScanner.next();

        Scanner passwordScanner = new Scanner(System.in);

        System.out.println("Contraseña/password:");
        String password = usuarioScanner.next();

        //No hace falta validar esto, preguntar al profe...
        launchCalculadoraCompraVenta();
    }

    public static void selectAgain(){
        System.out.println("¿Deseas seleccionar otro cálculo? s/n");
        Scanner selectAgainScanner = new Scanner(System.in);
        char selectAgain = selectAgainScanner.next().toLowerCase().charAt(0); //Para que pase los mayus a minus
        switch(selectAgain)
        {
            case 's':
                launchCalculadoraCompraVenta();
                break;
            case 'n':
                System.out.println("OK. Fin de la aplicación.");
                break;
            default:
                System.out.println("Escribe s o n");
        }
    }

        //Método público, estático, accedidos desde otras fuentes, este es el que voy a correr en el main reto 2
        public static void launchCalculadoraCompraVenta(){
            System.out.println("¡Bienvenido (a) al menú del programa de control de compra y venta! Selecciona una opción por efectuar:\n" +
                    "a.Comprar cajas de papel. \n" +
                    "b.Vender cajas de papel. \n" +
                    "c.Mostrar reporte. \n" +
                    "d.Salir del programa.");

            Scanner opcionScanner = new Scanner(System.in);
            char opcion = opcionScanner.next().toLowerCase().charAt(0); //De minus a mayus
            switch(opcion) {
                case 'a':
                    Scanner montoCompraScanner = new Scanner(System.in);
                    System.out.println("Número de cajas por comprar:");
                    double numCompraCajas = montoCompraScanner.nextDouble();


                    System.out.println("Costo de las cajas por comprar:");
                    double costoCompraCajas = montoCompraScanner.nextDouble();

                    double montoCompra = CalculadoraCompraVentaCajas.comprarCajas(numCompraCajas, costoCompraCajas);
                    int intCompraCajas = (int) numCompraCajas;
                    System.out.printf("La compra realizada por %d cajas al costo $%.2f es igual a $%.2f%n\n", intCompraCajas, costoCompraCajas, montoCompra);
                    selectAgain();
                    break;

                case 'b':
                    Scanner montoVentaScanner = new Scanner(System.in);
                    System.out.println("Número de cajas por comprar:");
                    double numVentaCajas = montoVentaScanner.nextDouble();

                    System.out.println("Costo de las cajas por comprar:");
                    double costoVentaCajas = montoVentaScanner.nextDouble();
                    int intVentaCajas = (int) numVentaCajas;

                    //
                    double montoVenta= CalculadoraCompraVentaCajas.venderCajas(numVentaCajas, costoVentaCajas);
                    System.out.printf("La compra realizada por $%d cajas al costo $%.2f es igual a $%.2f%n.\n", intVentaCajas, costoVentaCajas, montoVenta);
                    selectAgain();
                    break;

                case 'c':

                    selectAgain();
                    break;
                case 'd':
                    System.out.println("Fin de la aplicación.");
                    break;
                default:
                    System.out.println("Escribe a, b, c, o d. ");
            }

        }//método launchCalculadoraCompraVenta

}
