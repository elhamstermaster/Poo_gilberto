package edu_gilberto_heredia.reto5.casos.cuentahabiente2.process;

import edu_gilberto_heredia.reto5.casos.cuentahabiente2.data.Cuenta;

import java.util.ArrayList;

/**
 * Gestiona la cartera de cuentahabientes de un banco, permitiendo realizar operaciones sobre cuentas.
 */
public class CuentaHabientesBanco {
    /**
     * Lista de cuentas asociadas al cuentahabiente.
     */
    private ArrayList<Cuenta> cuentas;

    /**
     * Nombre del cliente.
     */
    private String cliente;

    /**
     * PIN del cliente.
     */
    private int pin;

    /**
     * Cuentas asociadas al cliente.
     */
    private String cuentasAsociadas;

    /**
     * Crea una nueva instancia de CuentaHabientesBanco con listas vacías de cuentas.
     *
     * @param cliente           Nombre del cliente.
     * @param pin               PIN del cliente.
     * @param cuentasAsociadas  Cuentas asociadas al cliente.
     */
    public CuentaHabientesBanco(String cliente, int pin, String cuentasAsociadas) {
        this.cuentas = new ArrayList<>();
        this.cliente = cliente;
        this.pin = pin;
        this.cuentasAsociadas = cuentasAsociadas;
    }

    /**
     * Obtiene el nombre del cliente.
     *
     * @return El nombre del cliente.
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * Establece el nombre del cliente.
     *
     * @param cliente El nuevo nombre del cliente.
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     * Obtiene el PIN del cliente.
     *
     * @return El PIN del cliente.
     */
    public int getPin() {
        return pin;
    }

    /**
     * Establece el PIN del cliente.
     *
     * @param pin El nuevo PIN del cliente.
     */
    public void setPin(int pin) {
        this.pin = pin;
    }

    /**
     * Obtiene las cuentas asociadas al cliente.
     *
     * @return Las cuentas asociadas al cliente.
     */
    public String getCuentasAsociadas() {
        return cuentasAsociadas;
    }

    /**
     * Establece las cuentas asociadas al cliente.
     *
     * @param cuentasAsociadas Las nuevas cuentas asociadas al cliente.
     */
    public void setCuentasAsociadas(String cuentasAsociadas) {
        this.cuentasAsociadas = cuentasAsociadas;
    }
}
