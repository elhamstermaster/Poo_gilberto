/**
 * Esta clase sirve para efectuar toda operación necesaria (no solo matemática) del
 * programa de compra y venta.
 * Clase que calcula
 *
 * @param costoCaja        Cada caja cuesta $50 MXN.
 * @param monto            Hay $10,000 MXN en la caja registradora, que también pueden usarse
 *                         para comprar al proveedor.
 *
 * @param egresosCompras   Cuenta del efectivo invertido, egresos de cajas compradas.
 * @param ingresosVentas   Cuenta del efectivo ganado, ingresos de cajas vendidas.
 * Conteo de las acciones efectuadas a lo largo del programa:
 * @param numVentas        Número total de ventas.
 * @param numCompras       Número total de compras.
 * @param numOperaciones   Cantidad total de operaciones realizadas.
 */

package edu_gilberto_heredia.reto2.process;

import java.util.Scanner;
import java.util.InputMismatchException;

import static edu_gilberto_heredia.reto2.UI.CLI.launchProgramaCompraVenta;

public class OperacionesCaja {

    //Operaciones de la caja usadas en CLI
    //Declaro acá variables estáticas que se me ocurieron, para usar en CLI
    public static double costoCaja = 50, monto = 10_000;
    public static double egresosCompras, ingresosVentas;
    public static int numVentas, numCompras;
    public static int numOperaciones;

    //Fórmula del costo de una compra y un pedido
    public static double sacarCostoCompraCajas(double cajasPorComprar, double costoCaja) {
        return cajasPorComprar * costoCaja;
    }

    public static double sacarCostoVentaCajas(double cajasPorVender, double costoCaja) {
        return cajasPorVender * costoCaja;
    }

    //Si se selecciona la opcion a
    public static void comprarCajas() {
        Scanner numCompraScanner = new Scanner(System.in);
        Scanner confirmarScannerA = new Scanner(System.in);

        try {
            System.out.println("Número de cajas por comprar al proveedor (c/u vale $50 MXN):");
            int cajasPorComprar = numCompraScanner.nextInt();

            System.out.println("Has ingresado: " + cajasPorComprar + " cajas.");

            double montoCompra = sacarCostoCompraCajas(cajasPorComprar, costoCaja);

            System.out.println("¿Confirma que efectuará su compra? s/n");
            char confirmarA = confirmarScannerA.next().toLowerCase().charAt(0);

            switch (confirmarA) {
                case 's':
                    System.out.printf("La compra realizada por %d cajas al costo de $50 MXN c/u es igual a $%.2f MXN\n", cajasPorComprar, montoCompra);
                    monto -= montoCompra;
                    numCompras++;
                    egresosCompras += montoCompra;
                    selectAgain();
                    break;
                case 'n':
                    launchProgramaCompraVenta();
                    break;
                default:
                    System.out.println("Opción no válida.");
                    comprarCajas();
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingresa un número entero válido.");
            numCompraScanner.next(); // Limpia el búfer de entrada
            launchProgramaCompraVenta();
        } finally {
            // Cierra los Scanners manualmente
            numCompraScanner.close();
            confirmarScannerA.close();
        }
    }


    //Si se selecciona la opcion b
    public static void venderCajas() {
        Scanner numVentaScanner = new Scanner(System.in);
        Scanner confirmarScannerB = new Scanner(System.in);

        try {
            System.out.println("Número de cajas por vender al cliente (c/u vale $50 MXN):");
            int cajasPorVender = numVentaScanner.nextInt();

            double montoVenta = sacarCostoVentaCajas(cajasPorVender, costoCaja);

            System.out.println("¿Confirma que efectuará la venta al cliente? s/n");
            char confirmarB = confirmarScannerB.next().toLowerCase().charAt(0);

            switch (confirmarB) {
                case 's':
                    System.out.printf("La venta realizada por %d cajas al costo de $50 MXN c/u es igual a $%.2f MXN\n", cajasPorVender, montoVenta);
                    monto += montoVenta;
                    numVentas++;
                    ingresosVentas += montoVenta;
                    selectAgain();
                    break;
                case 'n':
                    launchProgramaCompraVenta();
                    break;
                default:
                    System.out.println("Opción no válida.");
                    venderCajas();
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingresa un número entero válido.");
            numVentaScanner.next(); // Limpia el búfer de entrada
            launchProgramaCompraVenta();
        } finally {
            // Cierra los Scanners manualmente
            numVentaScanner.close();
            confirmarScannerB.close();
        }
    }

    //Opción c
    public static void mostrarReporte() {
        System.out.printf("""
                
                Estás consultando los siguientes datos.
                1-Número total de ventas: %d.
                2-Número total de compras: %d.
                3-Ingresos generados por ventas: $%.2f MXN.
                4-Egresos generados por compras: $%.2f MXN.
                5-Monto de efectivo restante en la caja: $%.2f.
                """, numVentas, numCompras, ingresosVentas, egresosCompras, monto);
    }

    //Opción d y n
    public static void mostrarResumenFinal() {
        numOperaciones = numVentas + numCompras;
        System.out.printf("""
                
                Se muestran las acciones realizadas:
                ------------------------------------------------------
                La cantidad total de operaciones realizadas: %d.
                ------------------------------------------------------
                Total de ventas:                             %d.
                ------------------------------------------------------
                Total de compras:                            %d.
                ------------------------------------------------------
                Monto en la caja:                            $%.2f MXN.
                ------------------------------------------------------
                Los ingresos generados por ventas:           $%.2f MXN.
                ------------------------------------------------------
                Egresos de compras:                          $%.2f MXN.
                ------------------------------------------------------
                Gracias por usar este servicio, vuelve pronto.
                """, numOperaciones, numVentas, numCompras, monto, ingresosVentas, egresosCompras);
    }

    //Después de ejecutar una opción, si el usuario desea seguir con otro cálculo
    public static void selectAgain() {
        Scanner selectAgainScanner = new Scanner(System.in);

        try {
            System.out.println("¿Deseas seleccionar otro cálculo? s/n");
            char selectAgain = selectAgainScanner.next().toLowerCase().charAt(0);

            switch (selectAgain) {
                case 's':
                    launchProgramaCompraVenta();
                    break;
                case 'n':
                    mostrarResumenFinal();
                    break;
                default:
                    System.out.println("Escribe s o n");
                    selectAgain();
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingresa un carácter válido.");
            selectAgainScanner.next(); // Limpia el búfer de entrada
            launchProgramaCompraVenta();
        } finally {
            //Cierra el Scanner manualmente
            selectAgainScanner.close();
        }
    }


}