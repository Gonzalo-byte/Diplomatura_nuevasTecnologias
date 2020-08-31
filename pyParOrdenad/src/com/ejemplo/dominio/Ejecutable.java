package com.ejemplo.dominio;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejecutable {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ParOrdenado par1 = new ParOrdenado();
        System.out.println("Ingrese la primer coordenada en X : ");
        par1.setCordenadaX(entrada.nextDouble());
        System.out.println("Ingrese la primer coordenada en Y : ");
        par1.setCordenadaY(entrada.nextDouble());

        System.out.println(par1.toString());
        System.out.println(par1.getDistanciaOrigen());
        System.out.println(par1.getCuadrante());

    }

}
