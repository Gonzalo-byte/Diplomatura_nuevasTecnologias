package com.ejemplo.dominio;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Tanque {

    //atributos
    double acumLitros;
    Scanner entrada = new Scanner(System.in);

    //constructores
    public Tanque() {
        acumLitros = 0;
    }

    //accesores
    public double getAcumLitros() {
        return acumLitros;
    }

    public void setAcumLitros(double acumLitros) {
        this.acumLitros = acumLitros;
    }

    //metodos propios
    public void cargaCombustible() {
        double cargaCombustible;
        boolean aux = false;

        do {
            System.out.println("Ingrese los litros a cargar");
            cargaCombustible = entrada.nextDouble();

            if (cargaCombustible >= 0 && cargaCombustible <= (49 - acumLitros)) {

                acumLitros += cargaCombustible;
                System.out.println("Carga exitosa");
                aux = true;

            } else {
                System.out.println("No se puede realizar la carga, ya que solo queda lugar disponible para: " + (49 - acumLitros) + " litros");
            }
        } while (aux == false);

    }

    public void chequearNivel() {
        if (acumLitros == 49) {
            System.out.println("El tanque está completo");
        } else {
            System.out.println("El tanque se encuentra al: " + ((acumLitros / 49) * 100) + " %");
        }

    }

}
