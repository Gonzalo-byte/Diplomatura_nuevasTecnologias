
package com.ejemplo.dominio;

/**
 *
 * @author Usuario
 */
public class CuentaBanco {
//atributos:
private int codigo;
private float saldo;
private String titular;


//comportamiento: accesores

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

}
