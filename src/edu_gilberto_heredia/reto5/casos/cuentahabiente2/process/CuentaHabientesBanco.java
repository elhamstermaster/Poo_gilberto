package edu_gilberto_heredia.reto5.casos.cuentahabiente2.process;

import edu_gilberto_heredia.reto5.casos.cuentahabiente2.data.Cuenta;

import java.util.ArrayList;

/**
 *
 */
public class CuentaHabientesBanco {
    private ArrayList<Cuenta> cuentas;
    private String cliente;
    private int pin;
    private String cuentasAsociadas;

    public CuentaHabientesBanco(String cliente, int pin, String cuentasAsociadas) {
        this.cuentas = new ArrayList<>();
        this.cliente = cliente;
        this.pin = pin;
        this.cuentasAsociadas = cuentasAsociadas;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getCuentasAsociadas() {
        return cuentasAsociadas;
    }

    public void setCuentasAsociadas(String cuentasAsociadas) {
        this.cuentasAsociadas = cuentasAsociadas;
    }
}

