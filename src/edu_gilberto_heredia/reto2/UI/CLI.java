package edu_gilberto_heredia.reto2.UI;

import edu_gilberto_heredia.reto2.process.OperacionesCaja;

import java.util.Scanner;

//Command Line Interface
public class CLI {
    //Menú de acceso.
    public static void mostrarMenuAcceso() {
        System.out.println("Bienvenido (a) al programa de control de compra y venta. Para ver el menú, escribe tu usuario y contraseña.");
        Scanner usuarioPasswordScanner = new Scanner(System.in);
        //User
        System.out.println("Usuario/User:");
        String usuario = usuarioPasswordScanner.next();
        //Password
        System.out.println("Contraseña/password:");
        String password = usuarioPasswordScanner.next();

        //Iniciar programa de compra y venta
        launchProgramaCompraVenta();
    }

    public static void launchProgramaCompraVenta() {
        System.out.printf("""
                
                ¡Bienvenido (a) al menú del programa de control de compra y venta! Selecciona una opción por efectuar:
                Monto disponible en caja: $%.2f MXN.
                a.Comprar cajas de papel.
                b.Vender cajas de papel.
                c.Mostrar reporte.
                d.Salir del programa.
                """, OperacionesCaja.monto);

        //Leer opción
        Scanner opcionScanner = new Scanner(System.in);
        char opcion = opcionScanner.next().toLowerCase().charAt(0);

        switch (opcion) {
            case 'a':
                try {
                    //Dirige al método de compra de cajas en la clase OperacionesCaja
                    OperacionesCaja.comprarCajas();
                } catch (Exception e) {
                    System.out.println("Error: Ingresa un número entero válido.");
                    launchProgramaCompraVenta();
                }
                break;
            case 'b':
                //Dirige al método de venta de cajas en la clase OperacionesCaja
                OperacionesCaja.venderCajas();
                break;
            case 'c':
                //Mostrar reporte
                OperacionesCaja.mostrarReporte();
                OperacionesCaja.selectAgain();
                break;
            case 'd':
                OperacionesCaja.mostrarResumenFinal();
                break;
            default:
                //Al escribir una letra no válida
                System.out.println("Escribe a, b, c, o d. ");
                launchProgramaCompraVenta();
        }
    }
}