package edu_gilberto_heredia.reto5.docs.cuentahabiente;
import java.util.ArrayList;

public class CuentaHabientesBanco {
        private String nombre;
        private ArrayList<CuentaHabientesBanco> cuentas;

        public CuentaHabientesBanco(String nombre) {
            this.nombre = nombre;
            this.cuentas = new ArrayList<>();
        }

        // Métodos para operar con las cuentas
        // ...

        public void agregarCuenta(CuentaHabientesBanco cuenta) {
            this.cuentas.add(cuenta);
        }

        // Otros métodos y atributos
        // ...

}
