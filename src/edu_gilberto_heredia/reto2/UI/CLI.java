package edu_gilberto_heredia.reto2.UI;

import edu_gilberto_heredia.reto2.process.OperacionesCaja;

import java.util.Scanner;

public class CLI {

    public static void mostrarMenuAcceso() {
        System.out.println("Bienvenido (a) al programa de control de compra y venta. Para ver el menú, escribe tu usuario y contraseña.");
        Scanner usuarioPasswordScanner = new Scanner(System.in);

        System.out.println("Usuario/User:");
        String usuario = usuarioPasswordScanner.next();

        System.out.println("Contraseña/password:");
        String password = usuarioPasswordScanner.next();

        launchCalculadoraCompraVenta();
    }

    public static void launchCalculadoraCompraVenta() {
        System.out.printf("""
                
                ¡Bienvenido (a) al menú del programa de control de compra y venta! Selecciona una opción por efectuar:
                Monto disponible en caja: $%.2f MXN.
                a.Comprar cajas de papel.
                b.Vender cajas de papel.
                c.Mostrar reporte.
                d.Salir del programa.
                """, OperacionesCaja.monto);

        Scanner opcionScanner = new Scanner(System.in);
        char opcion = opcionScanner.next().toLowerCase().charAt(0);

        switch (opcion) {
            case 'a':
                try {
                    OperacionesCaja.comprarCajas();
                } catch (Exception e) {
                    System.out.println("Error: Ingresa un número entero válido.");
                    launchCalculadoraCompraVenta();
                }
                break;
            case 'b':
                OperacionesCaja.venderCajas();
                break;
            case 'c':
                // Código para mostrar reporte
                OperacionesCaja.mostrarReporte();
                selectAgain();
                break;
            case 'd':
                selectAgain();
                break;
            default:
                System.out.println("Escribe a, b, c, o d. ");
                launchCalculadoraCompraVenta();
        }
    }

    public static void selectAgain() {
        System.out.println("¿Deseas seleccionar otro cálculo? s/n");
        Scanner selectAgainScanner = new Scanner(System.in);
        char selectAgain = selectAgainScanner.next().toLowerCase().charAt(0);

        if (selectAgain == 's') {
            launchCalculadoraCompraVenta();
        } else if (selectAgain == 'n') {
            OperacionesCaja.mostrarResumenFinal();
            System.out.println("OK. Fin de la aplicación.");
        } else {
            System.out.println("Escribe s o n");
            selectAgain();
        }
    }
}