package com.ejemplo.dominio;

/**
 *
 * @author Usuario
 */
public class CuentaBanco {
//1. atributos:

    private int codigo;
    private float saldo;
    private String titular;

//2. constructores: se llama igual que la clase y no tiene tipo de retorno
//contructor por defecto
    public CuentaBanco() {
        codigo = 0;
        saldo = 0;
        titular = "sin definir";

    }
//constructor con todos los parámetros a definir

    public CuentaBanco(int codigo, float saldo, String titular) {
        this.codigo = codigo;
        this.saldo = saldo;
        this.titular = titular;
    }
//contructor con parametros: al menos tiene 1 parametro

    public CuentaBanco(String titular) {
        codigo = 0;
        saldo = 0;
        this.titular = titular;
    }

//3. comportamiento: accesores
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    //4. comportamientos propios: depositar y extraer
    public void depositar(float monto) {
        if (monto > 0) {
            saldo += monto;
        }

    }

    public void extraer(float monto) {
        if (monto > 0 && saldo >= monto) {
            saldo -= monto;
        }

    }
    public String mostrarDatos(){
        return "cuenta N°: "+codigo+" |Titular: "+titular+" |Saldo actual: $ "+saldo;
        
    }
}
