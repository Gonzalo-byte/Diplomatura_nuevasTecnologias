package com.ejemplo.dominio;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Coche {

    //atributos
    private double kmRecorrer;
    private double consumo;
    Scanner entrada = new Scanner(System.in);

    private Tanque T1;

    public void setTanque(Tanque T1) {
        this.T1 = T1;
    }

    //constructores
    public Coche() {

    }
    //accesores
    //metodos propios

    public void Conducir() {
        System.out.println("Ingrese la cantidad de KM a recorrer");
        kmRecorrer = entrada.nextDouble();
        if (kmRecorrer > 0 && kmRecorrer <= (T1.getAcumLitros() * 11)) {
            T1.setAcumLitros(T1.getAcumLitros() - (kmRecorrer / 11));
            System.out.println("Es posible recorrer esa cantidad de KM");

        } else {
            System.out.println("No es posible recorrer esa cantidad de KM");
        }
    }

}
