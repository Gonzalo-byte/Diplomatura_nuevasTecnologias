package introducciónProgramacion;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //definir variables:
        int dato, cuadrado;
        Scanner entrada= new Scanner (System.in);
        
        //Proceso:
         
        
        System.out.println("ingrese un numero entero: ");
        dato=entrada.nextInt();
        cuadrado = dato * dato;
        //salida:
        
        System.out.println("El cuadrado del número es: "+cuadrado );
        
        
    }
    
}
