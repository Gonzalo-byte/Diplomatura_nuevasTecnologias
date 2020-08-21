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
public class Figuras{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Elige una opción:\n1 :Cuadrado \n2 :Círculo \n3: Triángulo");
        Scanner entrada= new Scanner (System.in);
        int opción=entrada.nextInt();
        switch(opción){
            case 1: 
                System.out.println("Introduce el lado del cuadrado");
                int lado=entrada.nextInt();
                System.out.println("El área del cuadrado es: "+ (Math.pow(lado,2)));
                break;
            case 2: 
                System.out.println("Introduce el radio");
                int radio=entrada.nextInt();
                System.out.println("El área del círculo es: "+Math.PI*(Math.pow(radio,2))); 
                break;
            case 3: 
                System.out.println("Introduce la base del triángulo: ");
                int base=entrada.nextInt();
                System.out.println("Introduce la altura del triángulo: ");
                int altura=entrada.nextInt();
                System.out.println("El área del triángulo es: "+ (base*altura)/2);
                break;
                
                
                
                
            
        }
    }
}
              
        
        
               
             
        
        
    
    

