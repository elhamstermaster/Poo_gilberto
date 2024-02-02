package edu_gilberto_heredia.reto2.UI;
import edu_gilberto_heredia.reto2.process.OperacionesCaja;
import java.util.Scanner;

import static edu_gilberto_heredia.reto2.process.OperacionesCaja.*;

public class CLI {
    //Se muestra menú, poner usuario y password
    public static void mostrarMenu(){
        System.out.println("Bienvenido (a) al programa de control de compra y venta. Para ver el menú, escribe tu usuario y contraseña.");
        Scanner usuarioScanner = new Scanner(System.in);

        System.out.println("Usuario/User:");
        String usuario = usuarioScanner.next();

        Scanner passwordScanner = new Scanner(System.in);

        System.out.println("Contraseña/password:");
        String password = passwordScanner.next();

        launchCalculadoraCompraVenta();
    }

    //Método público, estático, accedidos desde otras fuentes, este es el que voy a correr en el main reto 2
    public static void launchCalculadoraCompraVenta(){
        System.out.printf("¡Bienvenido (a) al menú del programa de control de compra y venta! Selecciona una opción por efectuar:\n" +
                "Monto disponible en caja: $%.2f\n" + //Efectivo disponible, se verá afectado si se efectúa una compra.
                "a.Comprar cajas de papel. \n" +
                "b.Vender cajas de papel. \n" +
                "c.Mostrar reporte. \n" +
                "d.Salir del programa.\n", OperacionesCaja.monto);


        Scanner opcionScanner = new Scanner(System.in);
        char opcion = opcionScanner.next().toLowerCase().charAt(0); //De mayus a minus
        switch(opcion) {
            case 'a':
                Scanner numCompraScanner = new Scanner(System.in);
                System.out.println("Número de cajas por comprar al proveedor (c/u vale $50):");
                int numCajasCompra = numCompraScanner.nextInt(); //Solo se pueden comprar cajas enteras


                double montoCompra = OperacionesCaja.comprarCajas(numCajasCompra, costoCaja);

                Scanner confirmarScannerA = new Scanner(System.in);
                System.out.println("¿Confirma que efectuará su compra? s/n");
                char confirmarA = confirmarScannerA.next().toLowerCase().charAt(0); //De minus a mayus
                switch (confirmarA){
                    case 's':
                        System.out.printf("La compra realizada por %d cajas al costo de $50 c/u es igual a $%.2f\n", numCajasCompra, montoCompra);
                        monto = monto - montoCompra;
                        numCompras++;

                        egresosCompras = egresosCompras + montoCompra;
                        selectAgain();
                        break;
                    case 'n':
                        launchCalculadoraCompraVenta();
                        break;
                }
                break;

            case 'b':
                Scanner numVentaScanner = new Scanner(System.in);
                System.out.println("Número de cajas por vender al cliente (c/u vale $50):");
                int numCajasVenta = numVentaScanner.nextInt(); //Solo se pueden vender cajas enteras

                double montoVenta = OperacionesCaja.comprarCajas(numCajasVenta, costoCaja);

                Scanner confirmarScannerB = new Scanner(System.in);
                System.out.println("¿Confirma que efectuará la venta al cliente? s/n");
                char confirmarB = confirmarScannerB.next().toLowerCase().charAt(0); //De mayus a minus, en tal caso
                switch (confirmarB){
                    case 's':
                        System.out.printf("La venta realizada por %d cajas al costo de $50 c/u es igual a $%.2f\n", numCajasVenta, montoVenta);
                        monto = monto + montoVenta;
                        numVentas++;

                        ingresosVentas = ingresosVentas + montoVenta; //Cambiar a +=
                        selectAgain();
                        break;
                    case 'n':
                        launchCalculadoraCompraVenta();
                        break;
                }
                break;

            //Reporte
            case 'c':
                System.out.printf("""
                        Estás consultando los siguientes datos.
                        1-Número total de ventas: %d.
                        2-Número total de compras: %d.
                        3-Ingresos generados por ventas: $%.2f.
                        4-Egresos generados por compras: $%.2f.
                        5-Monto de efectivo restante en la caja: $%.2f.%n""", OperacionesCaja.numVentas, OperacionesCaja.numCompras, OperacionesCaja.ingresosVentas, OperacionesCaja.egresosCompras, OperacionesCaja.monto);
                selectAgain();
                break;

            //Salir del programa
            case 'd':
                System.out.println("OK. Fin de la aplicación.");
                numOperaciones = numVentas + numCompras;
                System.out.println("OK. Fin de la aplicación.");
                System.out.printf("""
                        Se muestran las acciones realizadas:
                        La cantidad total de operaciones realizadas: %d.
                        Total de ventas: %d.
                        Total de compras: %d.
                        Monto en la caja: %.2f.
                        Los ingresos generados por ventas: $%.2f.
                        Egresos de compras: $%.2f.
                        Gracias por usar este servicio, vuelve pronto.""", numVentas, numCompras, monto, ingresosVentas, egresosCompras);
                break;
            default:
                System.out.println("Escribe a, b, c, o d. ");
        }

    }//método launchCalculadoraCompraVenta


    public static void selectAgain(){ //Método selectAgain
        System.out.println("¿Deseas seleccionar otro cálculo? s/n");
        Scanner selectAgainScanner = new Scanner(System.in);
        char selectAgain = selectAgainScanner.next().toLowerCase().charAt(0); //Mayus a minus
        switch(selectAgain)
        {
            case 's':
                launchCalculadoraCompraVenta();
                break;
            case 'n':
                numOperaciones = numVentas + numCompras; //Cambiar a +=
                System.out.println("OK. Fin de la aplicación.");
                System.out.printf("""
                        Se muestran las acciones realizadas:
                        La cantidad total de operaciones realizadas: %d.
                        Total de ventas: %d.
                        Total de compras: %d.
                        Monto en la caja: %.2f.
                        Los ingresos generados por ventas: $%.2f.
                        Egresos de compras: $%.2f.
                        Gracias por usar este servicio, vuelve pronto.""", numOperaciones, numVentas, numCompras, monto, ingresosVentas, egresosCompras);
                break;
            default:
                System.out.println("Escribe s o n");
        }
    }

}

