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
public class JuegoNumerosAleatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
   
        
        int aleatorio= (int) (Math.random()*100);
        int intentos=0;
        int numero=0;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("El juego consiste en adivinar el número aleatorio generado por el sistema entre 1 y 100");
        while(aleatorio==numero==false){
            intentos++;
            System.out.println("Por favor introduce un número");
            numero= entrada.nextInt();
            if(numero<aleatorio){
                System.out.println("Mas alto");
            }
            else if (numero>aleatorio){
                System.out.println("Mas bajo");
            }
            
        }
        System.out.println("Correcto, lo has logrado en "+intentos+ " intentos");
        
                
       
        
      
     
        
        
        
        
    }
    
}
