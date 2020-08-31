package com.ejemplo;

import com.ejemplo.dominio.CuentaBanco;
import java.util.Scanner;

public class Ejecutable {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        CuentaBanco miCuenta = new CuentaBanco("Juan");
        miCuenta.setCodigo(1);
        miCuenta.depositar(1000);
        miCuenta.extraer(2000);
        /*System.out.println("Mi cuenta tiene código: " + miCuenta.getCodigo());
        System.out.println("Mi cuenta tiene Titular: " + miCuenta.getTitular());
        System.out.println("Mi cuenta tiene saldo: " + miCuenta.getSaldo());
         */
        System.out.println(miCuenta.mostrarDatos());

        System.out.println("Ingrese código de la cuenta");
        int codigo = entrada.nextInt();
        System.out.println("Ingrese saldo inicial de la cuenta (>0)");
        float saldo = entrada.nextFloat();
        System.out.println("Ingrese el nombre del titular");
        String titular = entrada2.nextLine();

        CuentaBanco otraCuenta = new CuentaBanco(codigo, saldo, titular);
        otraCuenta.depositar(-900);
        otraCuenta.extraer(100);

        System.out.println("Otra cuenta tiene código: " + otraCuenta.getCodigo());
        System.out.println("Otra cuenta tiene Titular: " + otraCuenta.getTitular());
        System.out.println("Otra cuenta tiene saldo: " + otraCuenta.getSaldo());

        if (miCuenta.getSaldo() > otraCuenta.getSaldo()) {
            System.out.println("La cuenta de mayor saldo es: " + miCuenta.getCodigo());

        } else if (miCuenta.getSaldo() < otraCuenta.getSaldo()) {
            System.out.println("La cuenta de mayor saldo es: " + otraCuenta.getCodigo());

        } else {
            System.out.println("Las cuentas tienen el mismo saldo");
        }

    }

}
