package com.ejemplo;

import com.ejemplo.dominio.Coche;
import com.ejemplo.dominio.Tanque;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejecutable {

    Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        Coche Coche1 = new Coche();
        Tanque T1=new Tanque();
        Coche1.setTanque(T1);
        
        
        T1.cargaCombustible();
        T1.chequearNivel();
        Coche1.Conducir();
        T1.chequearNivel();

    }

}
