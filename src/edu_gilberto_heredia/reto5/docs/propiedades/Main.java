package edu_gilberto_heredia.reto5.docs.propiedades;
//
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        //ArrayLists para almacenar propiedades
        ArrayList<PropiedadEnVenta> propiedadesEnVenta = new ArrayList<>();
        ArrayList<PropiedadEnRenta> propiedadesEnRenta = new ArrayList<>();

        //Solicitar información de propiedades en venta al usuario
        System.out.println("Ingrese información de propiedades en venta:");
        for (int i = 0; i < 2; i++) { //Puedes ajustar la cantidad de propiedades
            System.out.println("Propiedad " + (i + 1));
            System.out.print("Ubicación: ");
            String ubicacionVenta = scanner.nextLine();
            System.out.print("Precio: ");
            double precioVenta = Double.parseDouble(scanner.nextLine());

            //Crear instancia de PropiedadEnVenta y agregar a ArrayList
            PropiedadEnVenta VentaNueva = new PropiedadEnVenta(ubicacionVenta, precioVenta, true);
            propiedadesEnVenta.add(VentaNueva);
        }

        //Solicitar información de propiedades en renta al usuario
        System.out.println("\nIngrese información de propiedades en renta:");
        for (int i = 0; i < 2; i++) { // Puedes ajustar la cantidad de propiedades
            System.out.println("Propiedad " + (i + 1));
            System.out.print("Ubicación: ");
            String ubicacionRenta = scanner.nextLine();
            System.out.print("Precio Mensual: ");
            double precioMensualRenta = Double.parseDouble(scanner.nextLine());
            System.out.print("Duración del Contrato (meses): ");
            int duracionContratoRenta = Integer.parseInt(scanner.nextLine());

            //Crear instancia de PropiedadEnRenta y agregar a ArrayList
            PropiedadEnRenta propiedadRenta = new PropiedadEnRenta(ubicacionRenta, precioMensualRenta, duracionContratoRenta);
            propiedadesEnRenta.add(propiedadRenta);
        }

        // Mostrar información de propiedades almacenadas
        System.out.println("\nPropiedades en Venta:");
        for (PropiedadEnVenta propiedadVenta : propiedadesEnVenta) {
            System.out.println(propiedadVenta.obtenerInformacion());
        }

        System.out.println("\nPropiedades en Renta:");
        for (PropiedadEnRenta propiedadRenta : propiedadesEnRenta) {
            System.out.println(propiedadRenta.obtenerInformacion());
        }

        // Cerrar el scanner al finalizar
        scanner.close();
    }
}
